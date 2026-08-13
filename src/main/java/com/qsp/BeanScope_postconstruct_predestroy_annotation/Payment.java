package com.qsp.BeanScope_postconstruct_predestroy_annotation;

import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
public class Payment {
	@PostConstruct
	public void postconstruct() {
		System.out.println("POST CONSTRUCT");
	}
	public Payment() {
		System.out.println("I am Constructor");
	}
	@PreDestroy
	public void predestroy() {
		System.out.println("PRE DESTROY");
	}
}
