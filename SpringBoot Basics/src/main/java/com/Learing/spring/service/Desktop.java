package com.Learing.spring.service;

import org.springframework.stereotype.Component;

@Component
public class Desktop implements Computer{

    // variables
    private String processor;
    private String ram;
    private String storage;

    public Desktop(){
        this.processor = "intel i5 14th gen";
        this.ram = "16GB";
        this.storage = "1TB";
    }

    @Override
    public void getDetails(){
        System.out.println("processor : "+this.processor);
        System.out.println("ram : "+this.ram);
        System.out.println("storage : "+this.storage);
    }
}
