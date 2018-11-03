package com.rollingstone.listeners;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.rollingstone.events.OrderLineItemEvent;

@Component
public class OrderLineItemEventListener {

	private final Logger log = LoggerFactory.getLogger(this.getClass());
	
	@EventListener
	public void onApplicationEvent(OrderLineItemEvent orderLineItemEvent) {
		log.info("Received Order Line Item Event : "+orderLineItemEvent.getEventType());
		log.info("Received Order Line Item From OrderLineItem Event :"+orderLineItemEvent.getOrderLineItem().toString());
	}
}
