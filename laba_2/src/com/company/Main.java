package com.company;
import java.lang.reflect.*;

public class Main {

    public static void main(String[] args) {

        Polinom polinom = new Polinom();
        Handler handler = new Handler(polinom);

        IPolinom p = (IPolinom) Proxy.newProxyInstance(IPolinom.class.getClassLoader()
                ,new Class[]{IPolinom.class},handler);

        polinom.getArray(1);
        p.setArray(1,2);

    }
}
