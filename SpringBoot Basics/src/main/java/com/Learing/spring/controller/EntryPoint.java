package com.Learing.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EntryPoint {

    @GetMapping("/")
    public final String main() {
        return "<center style = \" margin : 5% 0% 0% 0% \"> Application started successfully!! <br/> <b> Welcome to SpringBoot Basics </b> </center>";
    }

    @GetMapping("/about")
    public final String about() {
        return "<html>" +
            "<head><title>Spring Framework & Spring Boot Overview</title></head>" +
            "<body style='font-family:Arial, sans-serif; line-height:1.6;'>" +
            "<h1>Understanding Spring Framework & Spring Boot</h1>" +
            "<p><b>Spring Framework:</b> A comprehensive programming and configuration model for modern Java-based enterprise applications. It provides support for dependency injection, aspect-oriented programming, transaction management, and more. The framework simplifies enterprise application development by promoting loose coupling and easier testability.</p>" +
            "<p><b>Spring Boot:</b> A project built on the Spring Framework that streamlines the process of setup and development by offering pre-configured starters, auto-configuration, and embedded servers. This enables developers to create stand-alone, production-grade applications with minimal configuration.</p>" +
            "<h2>Key Concepts and Terminologies</h2>" +
            "<ul>" +
            "<li><b>Dependency Injection (DI):</b> A design pattern where objects receive their dependencies from an external source rather than creating them internally, leading to decoupled code.</li>" +
            "<li><b>Inversion of Control (IoC):</b> A principle where the control of object instantiation and lifecycle is transferred from the application code to the Spring container.</li>" +
            "<li><b>ApplicationContext:</b> The central interface in Spring for providing configuration information, managing bean creation, and handling their lifecycle.</li>" +
            "<li><b>Bean:</b> An object that is instantiated, assembled, and managed by the Spring IoC container.</li>" +
            "<li><b>Aspect-Oriented Programming (AOP):</b> A paradigm that separates cross-cutting concerns from business logic, enabling modularization of aspects such as logging or security.</li>" +
            "<li><b>Spring Expression Language (SpEL):</b> A powerful expression language for querying and manipulating object graphs at runtime.</li>" +
            "</ul>" +
            "<h2>Essential Spring Boot Annotations</h2>" +
            "<ul>" +
            "<li><b>@SpringBootApplication:</b> Combines @Configuration, @EnableAutoConfiguration, and @ComponentScan. It is the primary annotation for Spring Boot applications.</li>" +
            "<li><b>@RestController:</b> A specialized @Controller where every method returns a domain object instead of a view.</li>" +
            "<li><b>@Autowired:</b> Enables automatic dependency injection by instructing Spring to resolve and inject collaborating beans.</li>" +
            "<li><b>@GetMapping, @PostMapping, etc.:</b> Shorthand annotations for mapping HTTP GET, POST, and other requests to specific handler methods.</li>" +
            "<li><b>@Component, @Service, @Repository:</b> Stereotype annotations that mark classes as Spring-managed components, with additional semantics for different layers.</li>" +
            "</ul>" +
            "<h2>Spring Boot Starters and Auto-Configuration</h2>" +
            "<p><b>Starters:</b> Pre-packaged dependency descriptors that simplify build configuration by grouping commonly used libraries together, making it easier to get started.</p>" +
            "<p><b>Auto-Configuration:</b> Automatically configures Spring application components based on the jar dependencies present in the classpath, reducing manual configuration overhead.</p>" +
            "<h2>How a Spring Boot Application Starts</h2>" +
            "<p>Below is a simplified diagram of the Spring Boot startup process:</p>" +
            "<pre style='background:#f4f4f4;padding:10px;border:1px solid #ddd;'>" +
            "+------------------------+\n" +
            "|   Application Start    |\n" +
            "+-----------+------------+\n" +
            "            |\n" +
            "+-----------v------------+\n" +
            "|   Load Spring Context  |\n" +
            "+-----------+------------+\n" +
            "            |\n" +
            "+-----------v------------+\n" +
            "| Auto-Configuration Set |\n" +
            "+-----------+------------+\n" +
            "            |\n" +
            "+-----------v------------+\n" +
            "|  Bean Creation & DI    |\n" +
            "+-----------+------------+\n" +
            "            |\n" +
            "+-----------v------------+\n" +
            "|  Application is Ready  |\n" +
            "+------------------------+\n" +
            "</pre>" +
            "<h2>Common Spring Boot Annotations</h2>" +
            "<ul>" +
            "<li><b>@SpringBootApplication</b> - Entry point for Spring Boot applications, enabling auto-configuration and component scanning.</li>" +
            "<li><b>@Configuration</b> - Indicates that a class declares one or more @Bean methods and may be processed by the Spring container.</li>" +
            "<li><b>@EnableAutoConfiguration</b> - Tells Spring Boot to start adding beans based on classpath settings, other beans, and various property settings.</li>" +
            "<li><b>@ComponentScan</b> - Configures the base packages used by Spring to scan for components, configurations, and services.</li>" +
            "<li><b>@RestController</b> - A convenience annotation that combines @Controller and @ResponseBody, used for RESTful web services.</li>" +
            "<li><b>@Controller</b> - Marks a class as a Spring MVC controller.</li>" +
            "<li><b>@Service</b> - Indicates that a class holds business logic and is a service component in the Spring context.</li>" +
            "<li><b>@Repository</b> - Indicates that a class is a repository (e.g., DAO) and encapsulates storage, retrieval, and search behavior.</li>" +
            "<li><b>@Component</b> - Generic stereotype for any Spring-managed component.</li>" +
            "<li><b>@Autowired</b> - Enables automatic dependency injection.</li>" +
            "<li><b>@Qualifier</b> - Specifies which bean should be used when multiple candidates are present.</li>" +
            "<li><b>@Value</b> - Injects property values into beans.</li>" +
            "<li><b>@Bean</b> - Indicates that a method produces a Spring bean to be managed by the container.</li>" +
            "<li><b>@ConfigurationProperties</b> - Binds external configurations to a bean's properties.</li>" +
            "</ul>" +
            "<p>In summary, the Spring Boot application initializes by launching the main application, loading the Spring context, applying auto-configurations based on the available dependencies, creating and wiring the beans via dependency injection, and finally exposing the application to serve incoming requests.</p>" +
            "</body>" +
            "</html>";
    }
}
