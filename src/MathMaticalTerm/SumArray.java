package MathMaticalTerm;
//Write a java program to sum values of an array.

public class SumArray {

    public static void main(String[] args) {
        int arr[] = {1, 4, 5, 5, 6, 3, 5, 6};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += i;
        }
        System.out.println("The array sum is : " + sum);
    }

}
