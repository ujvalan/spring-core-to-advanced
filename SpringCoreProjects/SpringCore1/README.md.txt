# Spring Annotation-Based Configuration Project

## 🔄 Inversion of Control (IoC)

This project follows the **IoC (Inversion of Control)** principle, which means:
- The control of object creation is transferred from the programmer to the Spring container.
- Instead of creating objects manually using `new`, Spring manages and injects dependencies automatically.

### Benefits of IoC:
- Loose coupling between classes  
- Better code maintainability  
- Easier testing  
- Improved scalability  

---

## 📌 Description
This project demonstrates how to configure a Spring application using XML to enable annotation-based dependency injection. It uses component scanning to automatically detect and register beans.

---

## 🚀 Technologies Used
- Java
- Spring Core
- Eclipse IDE

---

## ⚙️ Configuration

The project uses an XML configuration file to enable annotation support and component scanning.

### Key Configuration:
```xml
<context:annotation-config />
<context:component-scan base-package="com.telusko" />