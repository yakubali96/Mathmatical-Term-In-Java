package SecondProblem;

//Write a Java program to calculate the average value of array elements
public class Average {

    public static void main(String[] args) {
        int[] numbers = new int[]{5, 7, 9, 5, 6, 4, 8};
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }

        double average = sum / numbers.length;
        System.out.println("Average value of the array elements is : " + average);
    }
}
