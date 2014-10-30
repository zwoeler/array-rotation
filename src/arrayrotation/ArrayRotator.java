/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayrotation;

/**
 *
 * @author Zwoeler
 */
public class ArrayRotator {

    /**
     *
     * @param array The input array to be rotated
     * @param numSpaces Number of spaces to be rotated
     * @return The rotated array
     */
    public static int[] rotateArray(int[] array, int numSpaces) {
        if (array == null || array.length == 0) {
            return array;
        }
        //a new blank array is created which later on is filled with elements from the input array
        int[] rotatedArray = new int[array.length];
        //covers the cases when the number of spaces is higher than the total number of elements, in which case the rotating is circular
        numSpaces = numSpaces % array.length;
        //copies the elements of the input array that come after the rotating number to the result array 
        System.arraycopy(array, 0, rotatedArray, numSpaces, array.length - numSpaces);
        //copies the elements of the input array that come before the rotating number to the result array 
        System.arraycopy(array, array.length - numSpaces, rotatedArray, 0, numSpaces);
        return rotatedArray;
    }
}
