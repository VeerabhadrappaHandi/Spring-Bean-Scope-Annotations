package com.qsp.spring_annotation_bean_scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanScopeDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new AnnotationConfigApplicationContext(MyBeanConfig.class);
		Payment p=context.getBean(Payment.class);
		System.out.println(p);
		Payment p1=context.getBean(Payment.class);
		System.out.println(p1);
	}

}
