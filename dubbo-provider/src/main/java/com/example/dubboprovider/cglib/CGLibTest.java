package com.example.dubboprovider.cglib;

import org.springframework.cglib.proxy.Enhancer;

public class CGLibTest {

    public static void main(String[] args) {

        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(CGLibSubject.class);
        enhancer.setCallback(new HelloInterceptor());
        CGLibSubject cgLibSubject = (CGLibSubject) enhancer.create();
        cgLibSubject.sayHello("word");
    }

}
