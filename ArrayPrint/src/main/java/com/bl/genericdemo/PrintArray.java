package com.bl.genericdemo;

public class PrintArray {

    public PrintArray(){ }

    public static boolean toPrint(Integer [] arr)
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
    }

}
