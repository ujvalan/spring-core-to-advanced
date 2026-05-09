# Spring XML-Based Dependency Injection Project

## 🔄 Inversion of Control (IoC)

This project demonstrates the **IoC (Inversion of Control)** principle using Spring Core:
- Spring container is responsible for creating and managing objects (beans)
- Dependencies are injected instead of being created manually using `new`

### Benefits of IoC:
- Loose coupling  
- Better maintainability  
- Easier unit testing  
- Cleaner architecture  

---

## 📌 Description
This project shows how to configure a Spring application using **pure XML-based configuration** without annotations. Beans are explicitly defined in the XML file and managed by the Spring container.

---

## 🚀 Technologies Used
- Java  
- Spring Core  
- Eclipse IDE  

---

## ⚙️ Configuration

This project uses XML configuration to define and manage beans manually.

### Key Configuration:
```xml
<bean id="service" class="com.telusko.service.ServiceLayer"></bean> 
<bean id="repo" class="com.telusko.dao.RepositoryLayer"></bean>
<bean id="web" class="com.telusko.web.WebLayer"></bean>