package com.learning.service;

public class Dev {

    public Computer computer;

    public Dev() {
        System.out.println("Dev constructor is calling");
    }

    public Computer getComputer() {
        return computer;
    }

    public void setComputer(Computer computer) {
        this.computer = computer;
    }

    public void build(){
        System.out.println("You are working on awesome project");
    }
    public void computerDetails(){computer.getDetails();}
}
