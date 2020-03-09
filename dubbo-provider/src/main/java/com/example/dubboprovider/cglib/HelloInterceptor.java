package com.example.dubboprovider.cglib;


import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class HelloInterceptor implements MethodInterceptor {


    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("调用方法之前，输出日志");

        Object result = methodProxy.invokeSuper(0,objects);

        System.out.println("调用方法之后，输出日志");
        return result;
    }
}
