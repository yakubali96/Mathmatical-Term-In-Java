package MathMaticalTerm;
//Write a java program to find the index of an array element

public class FindIndexArray {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 11, 33, 22, 12, 66, 77, 44};
        int find = 12;
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == find) {
                index = i;
                break;
            }
        }
        System.out.println("Index of " + find + " is: " + index);
    }
}
