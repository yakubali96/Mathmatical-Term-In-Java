package MathMaticalTerm;
//Write a java program to remove a specific element from an array.

import java.util.Arrays;

public class RemoveSpecificAnArray {

    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 6, 3, 2, 1, 6, 7, 44, 34, 11, 33};
        System.out.println("Orginal Array " + Arrays.toString(arr));
        int removeIndex = 1;
        for (int i = removeIndex; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        System.out.println("After removing the second element: " + Arrays.toString(arr));
    }

}
