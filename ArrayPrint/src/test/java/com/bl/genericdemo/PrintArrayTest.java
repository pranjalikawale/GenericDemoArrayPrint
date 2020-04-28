package com.bl.genericdemo;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PrintArrayTest {
    private PrintArray printArray;
    private  Integer[] arrInt={1,2,3};
    private Double[] arrDouble={1.1,1.2,1.3};
    private Character[] arrChar={'a','b','c'};
    @Before
    public void initialize()
    {
        printArray=new PrintArray();
    }
    @Test
    public void  givenArray_ShouldPrintArray(){
        Assert.assertTrue(printArray.toPrint(arrInt));
        Assert.assertTrue(printArray.toPrint(arrDouble));
        Assert.assertTrue(printArray.toPrint(arrChar));
    }
    
}
