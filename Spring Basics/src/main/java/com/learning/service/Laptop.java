package com.learning.service;

public class Laptop implements Computer {

    // variables
    private String processor;
    private String ram;
    private String storage;

    public Laptop(){
        System.out.println("Laptop constructor is calling");
    }

    /**
     * This parameterised constructor is used for constructor injection using xml configuration
     */
    public Laptop(String processor,String ram,String storage){
        System.out.println("parameterised laptop constructor is calling");
        this.processor = processor;
        this.ram = ram;
        this.storage = storage;
    }


    /**
     * These getter & setter methods are used for setter injection using xml configuration
     */
    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getStorage() {
        return storage;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }

    @Override
    public void getDetails(){
        System.out.println("processor : "+getProcessor());
        System.out.println("ram : "+getRam());
        System.out.println("storage : "+getStorage());
    }
}
