package MathMaticalTerm;

import java.util.Arrays;

public class InsertElementSpecificPosition {
    
    public static void main(String[] args) {
        int[] arr = {11, 22, 33, 43, 12, 45, 66};
        int index_position = 2;
        int newValue = 6;
        System.out.println("Orginal Array: " + Arrays.toString(arr));
        for (int i = arr.length - 1; i > index_position; i--) {
            arr[i] = arr[i - 1];
        }
        arr[index_position] = newValue;
        System.out.println("New Array: " + Arrays.toString(arr));
        
    }
    
}


