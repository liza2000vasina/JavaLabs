package com.company;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;



import static org.junit.jupiter.api.Assertions.*;

class RationalStatementTest {

    @org.junit.jupiter.api.Test
    void testForGetName() {

        RationalStatement obj = new RationalStatement();
        Class clazz = obj.getClass();

        assertEquals("com.company.RationalStatement",clazz.getCanonicalName());
    }

    @org.junit.jupiter.api.Test
    void testForGetFieldType(){

        RationalStatement obj = new RationalStatement();
        Class clazz = obj.getClass();
        Field[] fields = clazz.getDeclaredFields();

        for(Field field : fields){
            Class fieldType = field.getType();
            assertEquals("[I",  fieldType.getName());
        }

    }

    @org.junit.jupiter.api.Test
    void testForGetFieldName(){

        RationalStatement obj = new RationalStatement();
        Class clazz = obj.getClass();
        Field[] fields = clazz.getDeclaredFields();

        for(Field field : fields){
            assertEquals("array2",  field.getName());
        }

    }

    @org.junit.jupiter.api.Test
    void testForGetModifier(){

        RationalStatement obj = new RationalStatement();
        Class clazz = obj.getClass();
        Field[] fields = clazz.getDeclaredFields();

        for(Field field : fields){

            if(Modifier.isPublic(field.getModifiers())){
            System.out.println("Field is public");}
            else if(Modifier.isPrivate(field.getModifiers())){
            System.out.println("Field is private"); }
            else if(Modifier.isProtected(field.getModifiers())){
            System.out.println("Field is protected");}

        }

    }

    @org.junit.jupiter.api.Test
    void testForGetNameClassesWithAnnotation(){

        RationalStatement obj = new RationalStatement();
        Class clazz = obj.getClass();
        Method[] methods = clazz.getDeclaredMethods();

        for(Method method: methods){

            if(method.isAnnotationPresent(MyAnnotation.class)){
                System.out.println(method.getName() + " have an annotation");
                try {
                    method.invoke(obj);
                }
                catch (Exception inv){
                    System.out.println("exp");
                }
            }
        }
    }


    @org.junit.jupiter.api.Test
    void testForGetAnnotation() {

        RationalStatement obj = new RationalStatement();
        Class clazz = obj.getClass();
        Method[] methods = clazz.getDeclaredMethods();

        for (Method method : methods) {
            Annotation[] annotations = method.getDeclaredAnnotations();
            for (Annotation annotation : annotations) {
                System.out.println(annotation.toString());
            }
        }

    }

    }

