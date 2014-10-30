/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayrotation;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Zwoeler
 */
public class ArrayRotatorTest {

    /**
     * Test of rotateArray method, of class ArrayRotator.
     */
    @Test
    public void testRotateArray() {
        System.out.println("rotateArray");
        int[] array = new int[]{1, 2, 3, 4, 5, 6};
        int numSpaces = 2;
        int[] expResult = new int[]{5, 6, 1, 2, 3, 4};
        //test the "normal" case scenario
        assertArrayEquals(expResult, ArrayRotator.rotateArray(array, numSpaces));
        array = null;
        expResult = null;
        //test if NullPointerException is avoided
        assertArrayEquals(expResult, ArrayRotator.rotateArray(array, numSpaces));
        array = new int[0];
        expResult = new int[0];
        //test the funcionality for an empty array
        assertArrayEquals(expResult, ArrayRotator.rotateArray(array, numSpaces));
    }
}
