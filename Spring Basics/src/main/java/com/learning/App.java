package com.learning;

import com.learning.service.Dev;
import com.learning.service.Laptop;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Entry point to the Spring Application
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        /*
         * when we run " new ClassPathXmlApplicationContext() " constructor. it allows you to create IOC Container in JVM. & return a reference of an IOC Container
         * the Type of the IOC Container is Application Context . we need to know that IOC Container is also an object.
         *
         * If we don't mention the xml file ( where beens are configured ) in the ClassPathXmlApplicationContext() constructor
         * then, we got IllegalStateException: BeanFactory not initialized or already closed error will be raised
         *
         * that xml file is presented at src/main/resources
         */
        ApplicationContext context = new ClassPathXmlApplicationContext("beens.xml");

        /*
         *  here we want to use build() method which is available in the Dev class
         *  here Dev class is our dependency. so, we need to import that class
         *  we know that in java every thing is work with classes and objects only.
         *  so, we need an object of the Dev class to use the build() method.
         *
         *	here below in the first line , you're manually creating an object fo the Dev class
         *  you're fully responsible for managing that object.
         *  but the main objective of the spring framework is you don't have to manage the object. spring is do it for you
         */
//		Dev obj = new Dev();

        /*
         * 	here we assume that the object of the Dev class is available in the IOC Container.
         * 	we are injecting ( import ) the object of the Dev class form the IOC Container to use build() method.
         * 	if object ( been ) is not available in the IOC Container we're getting an error : No qualifying bean of type 'com.Learing.spring.service.Dev' available " ( NoSuchBeanDefinitionException )
         *
         * 	A Java object that is managed by the Spring IoC container is called as Been. it was defined in the Spring configuration file or annotated with Spring-specific annotations.
         * 	The process of providing (injecting) external dependencies into an object using Spring IOC is called Dependency Injection.
         *
         *  Spring By default doesn't create an object until you defined to create been for a particular class
         */
        // Inject Been by name ( id name )
        Dev obj = (Dev) context.getBean("dev");
        Dev obj1 = (Dev) context.getBean("dev2");

        System.out.println();
        obj.computerDetails();
        obj.build();

        System.out.println();
        obj1.computerDetails();
        obj1.build();

        // inject been by type
        Laptop lp = context.getBean(Laptop.class);
        System.out.println();
        lp.getDetails();
    }
}
