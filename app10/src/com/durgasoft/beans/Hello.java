package com.durgasoft.beans;

public class Hello {

    static Hello getInstance(){
        System.out.println("from getInstance method, creating Hello bean object....");
        return new Hello();
    }
    public Hello(){
        System.out.println("from 0-arg constructor.........");
    }
    public String sayHello(){

        return "Hello user!";
    }
}
