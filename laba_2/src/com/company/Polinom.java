package com.company;

public class Polinom implements IPolinom {
    protected int[] array;
    int a;
    char b;

    public Polinom(){
        array = new int[3];
    }

    public Polinom(int size){
        array = new int[size];
    }

    public int getArray(int n){
        if(array.length>n && n>=0)
            System.out.println("Getter");
            return array[n];
    }

    public  void setArray(int n, int data){
        if(array.length>n && n>=0)
            array[n] = data;
    }
    @Override
    public String toString(){
        String result = "";
        for(int i=0; i<array.length; i++){
            result = result + new Integer(array[i]).toString()+ "x^"+ new Integer(array.length-1-i).toString();
        }
        return result;
    }

}
