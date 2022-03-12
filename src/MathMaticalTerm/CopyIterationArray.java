package MathMaticalTerm;
//Write a java program to copy an array by iterating the array

import java.util.Arrays;

public class CopyIterationArray {
    
    public static void main(String[] args) {
        int[] arr = {9, 5, 3, 2, 5, 8, 1};
        int[] arr3 = new int[7];
        System.out.println("Source Array: " + Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            arr3[i] = arr[i];
        }
        System.out.println("New Array: " + Arrays.toString(arr3));
        
    }
    
}
