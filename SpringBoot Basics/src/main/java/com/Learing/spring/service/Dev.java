package com.Learing.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Dev {

//    @Autowired // Field Dependency Injection
//    @Qualifier("laptop")
    public Computer computer;

    /*
     *  @Autowired annotation on the constructor to determine which constructor to use for dependency injection.
     *  The @Qualifier annotation is meant to be associated with a parameter or field, not a constructor.
     *
     *  @Autowired
     *  @Qualifier("desktop")
     *  public Dev( Computer computer){
         this.computer = computer;
     *  }
     *
     *  the above code is not run .
     *  dependency injection for constructors relies on parameter-level annotations to differentiate which beans should be injected.
     */
//    @Autowired  // Constructor Injection
//    public Dev(@Qualifier("desktop") Computer computer){
//        this.computer = computer;
//    }


    /*
     *  when @Qualifier annotation is used with methods, it's not the method itself being annotated with @Qualifier.
     *  Instead, the @Qualifier annotation is applied to the method's parameters to specify which bean to inject.
     *
     *  @Autowired is applied to a method (usually a setter), and @Qualifier can be applied to the parameter of the method,
     *  OR it can be applied directly to the method if the method only has one parameter.
     *
     *  recommended way.to write @Qualifier annotation for methods & Constructor is :
     *  @Autowired
     *  public void Dev(@Qualifier("desktop") Computer computer) {
            this.computer = computer;
     * }
     *
     */
    @Autowired
    @Qualifier("laptop")
    public void setComputer(Computer computer){this.computer = computer;}

    public void build(){
        System.out.println("You are working on awesome project");
    }
    public void computerDetails(){computer.getDetails();}
}
