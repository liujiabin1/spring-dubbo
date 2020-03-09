package com.example.dubboprovider.proxy;

import java.lang.reflect.Proxy;

public class TestProxy {

    public static void main(String[] args) {
        Subject subject = new SubjectImpl();
        SubjectProxy subjectProxy = new SubjectProxy(subject);
        Subject proxy = (Subject) Proxy.newProxyInstance(subjectProxy.getClass().getClassLoader(),
        new Class[]{Subject.class},subjectProxy);
        proxy.sayHello("word");
    }

}
