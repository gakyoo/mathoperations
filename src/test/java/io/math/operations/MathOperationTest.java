package io.math.operations;

import org.junit.Assert;
import org.junit.Test;

import junit.framework.TestCase;

public class MathOperationTest extends TestCase {
    
    @Test
    public void testAddition() {
        MathOperation mo = new MathOperation();
        Assert.assertEquals("+", mo.determineMathOperation(1, 1, 2));
    }

    @Test
    public void testAdditionAndMultiplication() {
        MathOperation mo = new MathOperation();
        Assert.assertEquals("+*", mo.determineMathOperation(2, 2, 4));
    }

     @Test
    public void testMultiplication() {
        MathOperation mo = new MathOperation();
        Assert.assertEquals("*", mo.determineMathOperation(2, 3, 6));
    }

    @Test
    public void testSubstraction() {
        MathOperation mo = new MathOperation();
        Assert.assertEquals("-", mo.determineMathOperation(2, 2, 0));
    }

     @Test
     public void testDivision() {
         MathOperation mo = new MathOperation();
         Assert.assertEquals("/", mo.determineMathOperation(18, 3, 6));
     }
   
     @Test
    public void testMathOperationYieldingNone() {
        MathOperation mo = new MathOperation();
        Assert.assertEquals("None", mo.determineMathOperation(2, 3, 8));
    }

}
