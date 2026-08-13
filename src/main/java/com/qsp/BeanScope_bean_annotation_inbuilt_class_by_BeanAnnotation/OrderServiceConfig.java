package com.qsp.BeanScope_bean_annotation_inbuilt_class_by_BeanAnnotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.qsp.BeanScope_bean_annotation")
public class OrderServiceConfig {
	@Bean(name="order")
	public OrderService getObject() {
		return new OrderService();
	}

}
