package com.juvenxu.mvnbook.helloworld;

public class HelloWorld {
    public static void main(String[] args){
        System.out.print(new HelloWorld().sayHello());
    }

    public String sayHello(){
        return "Hello Maven";
    }
}
