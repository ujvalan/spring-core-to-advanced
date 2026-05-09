# Spring Dependency Injection (DI) Project

## 🔄 Inversion of Control (IoC)

This project follows the **IoC (Inversion of Control)** principle where:
- Object creation and dependency management are handled by the Spring container
- Classes do not create their dependencies manually

---

## 🔗 Dependency Injection (DI)

This project demonstrates **Dependency Injection using Spring annotations**.

- Dependencies are injected into classes instead of being created using `new`
- Promotes loose coupling and flexibility

### Types of DI used:
- Constructor Injection (optional based on your code)
- Setter Injection (optional)
- Field Injection using `@Autowired`

---

## 📌 Description

This project simulates a learning platform where different courses are injected dynamically into a main class.

### Components:
- 'ICourse'→ Interface
- Implementations:
  - 'AIEngineering'
  - 'DevOps'
  - 'SystemDesign'
- 'Telusko' → Main class that depends on 'ICourse'

Spring injects the required course into the 'Telusko' class based on configuration.

---

## 🚀 Technologies Used
- Java  
- Spring Core  
- Eclipse IDE  
- Maven

---

## ⚙️ Configuration

### XML Configuration:
```xml
<context:annotation-config />
<context:component-scan base-package="com.telusko" />