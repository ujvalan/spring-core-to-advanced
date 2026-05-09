# 🌱 Spring Annotation-Based Configuration Project

> Master the fundamentals of Spring IoC and dependency injection with annotation-based configuration

---

## 🔄 Inversion of Control (IoC)

This project follows the **IoC (Inversion of Control)** principle, which inverts the traditional flow of control:

| Aspect | Traditional | IoC (Spring) |
|--------|-------------|------------|
| **Object Creation** | Manual (`new` keyword) | Spring Container |
| **Dependency Management** | Manual injection | Automatic injection |
| **Control Flow** | Application controls framework | Framework controls application |

### ✨ Key Benefits of IoC

```
✅ Loose Coupling       - Classes are independent and testable
✅ Better Maintainability - Changes are isolated and safe  
✅ Easier Testing       - Mock dependencies effortlessly
✅ Improved Scalability - Add features without refactoring
✅ Centralized Config   - Manage beans in one place
```

---

## 📌 Project Overview

This project demonstrates **practical Spring annotation-based configuration** using XML to enable component scanning and automatic dependency injection. You'll learn how Spring manages the lifecycle of beans and wires dependencies seamlessly.

### What You'll Learn
- ✔️ Configure Spring using XML files
- ✔️ Enable annotation support with `<context:annotation-config />`
- ✔️ Auto-discover beans with component scanning
- ✔️ Inject dependencies using `@Autowired`
- ✔️ Use `@Component`, `@Service`, `@Repository`, `@Controller` stereotypes

---

## 🚀 Technologies Used

| Technology | Version | Purpose |
|-----------|---------|---------|
| **Java** | 8+ | Programming Language |
| **Spring Core** | 5.x+ | IoC Container & DI |
| **Eclipse IDE** | Latest | Development Environment |

---

## ⚙️ Configuration

The project uses an XML configuration file to bootstrap Spring's annotation support and enable automatic bean discovery.

### 📄 XML Configuration File

```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
   xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
   xmlns:context="http://www.springframework.org/schema/context"
   xsi:schemaLocation="http://www.springframework.org/schema/beans
   http://www.springframework.org/schema/beans/spring-beans.xsd
   http://www.springframework.org/schema/context
   http://www.springframework.org/schema/context/spring-context.xsd">
   
   <!-- Enable annotation support -->
   <context:annotation-config />
   
   <!-- Enable component scanning -->
   <context:component-scan base-package="com.telusko" />
   
</beans>
```

### 🔑 Key Configuration Elements

| Element | Purpose |
|---------|---------|
| `<context:annotation-config />` | Registers bean post-processors for `@Autowired`, `@Resource`, `@PostConstruct`, `@PreDestroy` |
| `<context:component-scan>` | Scans classpath for components and registers them as beans |
| `base-package` | Root package to scan for annotated classes |

---

## 📂 Project Structure

```
SpringCore1/
├── src/
│   └── com/telusko/
│       ├── beans/          # POJO classes
│       ├── config/         # Spring configuration files
│       └── main/           # Application entry point
├── resources/
│   └── applicationContext.xml
└── README.md
```

---

## 🎯 Common Annotations

| Annotation | Usage |
|-----------|-------|
| `@Component` | Generic component |
| `@Service` | Business logic layer |
| `@Repository` | Data access layer |
| `@Controller` | Web controller layer |
| `@Autowired` | Dependency injection |
| `@Qualifier` | Specify bean when multiple exist |

---

## 🚀 Getting Started

1. **Clone the repository**
   ```bash
   git clone https://github.com/ujvalan/spring-core-to-advanced.git
   cd SpringCoreProjects/SpringCore1
   ```

2. **Set up your IDE** - Open in Eclipse IDE

3. **Configure Spring** - Ensure `applicationContext.xml` is properly configured

4. **Run the application** - Execute the main class to see IoC in action

---

## 💡 Key Concepts Demonstrated

- **Dependency Injection** - Automatic wiring of dependencies
- **Bean Lifecycle** - Creation, initialization, and destruction
- **Component Scanning** - Auto-discovery of beans
- **Annotation-based Configuration** - XML + annotations approach

---

## 📚 Next Steps

- Explore **Java-based Configuration** (`@Configuration`, `@Bean`)
- Learn **Aspect-Oriented Programming (AOP)**
- Master **Spring Boot** for rapid development
- Study **Spring Data JPA** for database operations

---

## 📝 License

This project is part of the comprehensive Spring Framework learning series.

---

**Happy Learning! 🎓**
