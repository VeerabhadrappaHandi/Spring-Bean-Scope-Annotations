package com.qsp.BeanScope_postconstruct_predestroy_annotation;

//import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PaymentDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConfigurableApplicationContext context=new AnnotationConfigApplicationContext(PaymentConfig.class);
		context.close();
	}

}
