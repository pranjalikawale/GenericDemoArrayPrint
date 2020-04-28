package com.bl.genericdemo;

public class PrintArray <T> {
    T[] myArray;

    public PrintArray(){ }

    public PrintArray(T [] myArray){
        this.myArray=myArray;
    }

    /*public static boolean toPrint(Integer [] arr)
    {
        for(Integer i: arr)
            System.out.println(i);
        return true;
    }
    public static  boolean toPrint(Double [] arr)
    {
        for(Double i: arr)
            System.out.println(i);
        return true;
    }
    public static boolean toPrint(Character [] arr)
    {
        for(Character i: arr)
            System.out.println(i);
         return true;
    }*/
    public static <T> boolean toPrint(T [] arr)
    {
        for(T i: arr)
            System.out.println(i);
       return true;
    }
    public boolean toPrint()
    {
        return toPrint(myArray);
    }
}
