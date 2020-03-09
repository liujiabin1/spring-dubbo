package com.example.dubboprovider.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class SubjectProxy implements InvocationHandler {

    Subject subject ;

    public SubjectProxy(Subject subject) {
        this.subject = subject;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("在执行正在的方法之前，输出日志");

        //利用反射原理调用类里面的实际方法，proxys是方法的返回值
        Object proxys = method.invoke(subject,args);

        System.out.println("在执行正在的方法之后，输出日志");

        return proxys;
    }

}
