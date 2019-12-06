package com.company;

public class RationalStatement extends Polinom{
    private int[] array2;

    public RationalStatement(){
        super();
        array2 = new int[3];
    }


    public RationalStatement(int n1, int n2){
        super(n1);
        array2 = new int[n2];
    }


    public int getArray(int nArray, int n) {
        if (nArray == 1) {
            if (array.length > n && n >= 0)
                return array[n];
            return -1;
        } else {
            if (array2.length > n && n >= 0)
                return array2[n];
            return -1;
        }
    }


    public void setArray(int nArray, int n, int data){
        if(nArray==1){
            if(array.length>n && n>=0)
                array[n] = data;
        } else if(nArray==2){
            if(array2.length>n && n>=0)
                array2[n] = data;
        }
    }


    public String toString(int nArray){
        String result = "";
        if(nArray==1){
        for(int i=0; i<array.length; i++){
            result = result + new Integer(array[i]).toString()+ "x^"+ new Integer(array.length-1-i).toString();
        }
        return result;}
        else{
            for(int i=0; i<array2.length; i++){
                result = result + new Integer(array2[i]).toString()+ "x^"+ new Integer(array2.length-1-i).toString();
            }
            return result;
        }
    }

    @MyAnnotation
    public String toString(){

        String result = "";

        for(int i=0; i<array.length; i++){
                result = result + new Integer(array[i]).toString()+ "x^"+ new Integer(array.length-1-i).toString();
            }
        result = result + " / ";
        for(int i=0; i<array2.length; i++){
            result = result + new Integer(array2[i]).toString()+ "x^"+ new Integer(array2.length-1-i).toString();
        }

        return result;
    }







}
