package com.qsp.BeanScope_bean_annotation_inbuilt_class_by_BeanAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class OrderServiceDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new AnnotationConfigApplicationContext(OrderServiceConfig.class);
		OrderService o=(OrderService)context.getBean("order");
		o.recieveorder();
	}

}
