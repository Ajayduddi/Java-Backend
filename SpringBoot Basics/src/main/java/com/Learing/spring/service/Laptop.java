package com.Learing.spring.service;

import org.springframework.stereotype.Component;

@Component
public class Laptop implements Computer {

    // variables
    private String processor;
    private String ram;
    private String storage;

    public Laptop(){
        this.processor = "intel i5 12th gen";
        this.ram = "8GB";
        this.storage = "512GB";
    }

    @Override
    public void getDetails(){
        System.out.println("processor : "+this.processor);
        System.out.println("ram : "+this.ram);
        System.out.println("storage : "+this.storage);
    }
}
