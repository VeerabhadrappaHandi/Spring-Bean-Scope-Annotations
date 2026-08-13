package com.qsp.spring_annotation_bean_scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype") //types of bean
public class Payment {

}
