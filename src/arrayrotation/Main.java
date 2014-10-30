package arrayrotation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Zwoeler
 */
public class Main {

    public static void main(String[] args) {
        try {
            System.out.println("Please enter the array integer elements, separated by space and press Enter when finished...");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            //reads the array elements separated by space
            String elementsInput = br.readLine();
            if (elementsInput.trim().isEmpty()) {
                System.out.println("Wrong array input! An array with at least one element must be inputted!");
                return;
            }
            System.out.println("Please enter the number of spaces rotated...");
            String spacesInput = br.readLine();
            int numSpaces = Integer.parseInt(spacesInput);
            //creating an array from the input line
            String[] elementsArray = elementsInput.split("\\s+");
            int[] integerArray = new int[elementsArray.length];
            //converting the input array to int array
            for (int i = 0; i < integerArray.length; i++) {
                integerArray[i] = Integer.parseInt(elementsArray[i]);
            }
            int[] rotatedArray = ArrayRotator.rotateArray(integerArray, numSpaces);
            System.out.println("The rotated array is: ");
            //printing the elements
            for (int elem : rotatedArray) {
                System.out.print(elem + " ");
            }      
        } catch (IOException ex) {
            System.out.println("An IO Exception has occured!");
        } catch (NumberFormatException ex) {
            //if any of the parameters is not integer
            System.out.println("Wrong input parameter type! Should be Integer!");
        }
    }
}
