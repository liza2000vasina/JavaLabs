package com.company;
import java.lang.reflect.*;
import java.util.EmptyStackException;

public class Handler implements InvocationHandler {

    private final IPolinom object;
    private Object Exception;

    public Handler(IPolinom object){
        this.object = object;
    }

    public Object invoke(Object proxy, Method method, Object [] args) throws IllegalArgumentException, InvocationTargetException, IllegalAccessException {
        if(!method.getName().equals("setArray")){
            return method.invoke(proxy,args);
        } else{
            throw new EmptyStackException();
        }
    }
}
