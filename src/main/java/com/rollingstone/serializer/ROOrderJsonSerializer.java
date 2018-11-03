package com.rollingstone.serializer;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.jackson.JsonComponent;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.rollingstone.spring.model.ROOrder;

@JsonComponent
public class ROOrderJsonSerializer extends JsonSerializer<ROOrder> {

	Logger logger  = LoggerFactory.getLogger("OrderJsonSerializer");
	
	@Override
    public void serialize(ROOrder order, JsonGenerator jsonGenerator, 
      SerializerProvider serializerProvider) throws IOException, 
      JsonProcessingException {
		
		logger.info("Inside the OrderJsonSerializer");
		 jsonGenerator.writeStartObject();
		 
		 
		 if (order == null) {
				logger.info("Inside the OrderJsonSerializer null");
		 }else if (order.getId() == null){
				logger.info("Inside the OrderJsonSerializer id null");

		 }
		 jsonGenerator.writeNumberField("id", order.getId());
		 jsonGenerator.writeStringField("orderNumber", order.getOrderNumber());
		 
		 jsonGenerator.writeStringField("orderTrackingNumber", order.getOrderTrackingNumber());
		 jsonGenerator.writeStringField("accountNumber", order.getOrderNumber());

		 jsonGenerator.writeNumberField("orderTotal", order.getOrderTotal());
		 jsonGenerator.writeStringField("orderDate", order.getOrderDate().toLocaleString());
	
		 jsonGenerator.writeStringField("userName", order.getUserName());
		 jsonGenerator.writeStringField("firstName", order.getFirstName());
		 jsonGenerator.writeStringField("lastName", order.getLastName());
		 jsonGenerator.writeStringField("memberType", order.getMemberType());
		 
		 jsonGenerator.writeStringField("shippingHouseNumber", order.getShippingHouseNumber());
		 jsonGenerator.writeStringField("shippingStreetAddress", order.getShippingStreetAddress());
		 jsonGenerator.writeStringField("shippingCity", order.getShippingCity());
		 jsonGenerator.writeStringField("shippingState", order.getShippingState());
		 jsonGenerator.writeStringField("shippingZipCode", order.getShippingZipCode());
		 
		 jsonGenerator.writeStringField("billingHouseNumber", order.getBillingHouseNumber());
		 jsonGenerator.writeStringField("billingCity", order.getBillingCity());
		 jsonGenerator.writeStringField("billingState", order.getBillingState());
		 jsonGenerator.writeStringField("billingZipCode", order.getBillingZipCode());

	

		 
		 logger.info("Inside the OrderJsonSerializer id "+order.getId());
		 logger.info("Inside the OrderJsonSerializer order.getOrderTotal() "+order.getOrderTotal());

		 jsonGenerator.writeEndObject();
		/* if (order.getOrderItems() == null){
			 logger.info("order.getOrderItems() is null");
		 }else {
			 logger.info("order.getOrderItems() is not null");
		 }
		 
		 ObjectMapper objectMapper = new ObjectMapper();
		 objectMapper.writeValue(jsonGenerator, order.getOrderItems());	 
		 
			logger.info("Inside the OrderJsonSerializer 3");*/


		 
    }
   
}
