package MathMaticalTerm;
//write a java program to claculate the average value of array element.

public class ArrayAverage {

    public static void main(String[] args) {
        int[] arr = {20, 30, 25, 35, -16, 60, -100};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum =sum +arr[i];
        }

        double average = sum / arr.length;
        System.out.println("Average: " + average);

    }

}
