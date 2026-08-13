# Spring Bean Scope Annotations

This project is a simple Spring Framework practice project created to understand **Spring Bean Scopes and Bean Lifecycle** using annotations.

While learning Spring, I used this project to see how Spring creates and manages objects and how the behavior changes when different bean scopes are used.

## What I Learned

* How Spring creates and manages beans
* `@Configuration` and `@Bean`
* Singleton bean scope
* Prototype bean scope
* `@PostConstruct`
* `@PreDestroy`
* How multiple objects behave with different bean scopes
* How to retrieve beans from the Spring IoC container

## Project Examples

### 1. Singleton Scope

The singleton scope is the default scope in Spring.

Spring creates **only one object** for a bean and returns the same object whenever the bean is requested.

```java
Payment p1 = context.getBean(Payment.class);
Payment p2 = context.getBean(Payment.class);
```

If both references point to the same object, it means the bean is using singleton scope.

### 2. Prototype Scope

In prototype scope, Spring creates a **new object every time** the bean is requested.

```java
Payment p1 = context.getBean(Payment.class);
Payment p2 = context.getBean(Payment.class);
```

Here, `p1` and `p2` refer to different objects.

### 3. Bean Lifecycle

The project also demonstrates lifecycle annotations:

* `@PostConstruct` – executes after the bean is created and dependencies are initialized.
* `@PreDestroy` – executes before the bean is destroyed by the Spring container.

These annotations help understand what happens during the creation and destruction of a Spring bean.

## Technologies Used

* Java
* Spring Framework
* Spring Context
* Maven
* Eclipse IDE

## Project Structure

```text
Spring-Bean-Scope-Annotations
│
├── src/main/java
│   └── com.qsp
│       ├── spring_annotation_bean_scope
│       ├── BeanScope_postconstruct_predestroy_annotation
│       └── BeanScope_bean_annotation_inbuilt_class_by_Bean
│
├── src/main/resources
├── src/test/java
├── src/test/resources
└── pom.xml
```

## Dependencies

The project uses Spring Context and Jakarta Annotation API through Maven.

```xml
<dependency>
    <groupId>org.springframework</groupId>
    <artifactId>spring-context</artifactId>
    <version>6.2.18</version>
</dependency>

<dependency>
    <groupId>jakarta.annotation</groupId>
    <artifactId>jakarta.annotation-api</artifactId>
    <version>3.0.0</version>
</dependency>
```

## Purpose of the Project

The main purpose of this project is to get a practical understanding of how **Spring IoC manages objects**, how bean scopes affect object creation, and how annotations can be used to configure beans and their lifecycle.

This is a learning project and can be used as a reference while studying Spring Framework concepts.

## Author

**Veerabhadrappa Handi**

Java Full Stack Developer | Java | SQL | Spring
