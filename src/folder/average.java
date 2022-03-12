package folder;

public class average {

    public static void main(String[] args) {
        int[] arr = {5, 7, 9, 5, 6, 4, 8};
        double sum = 0;
        double avg;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("sum: " + sum);
        avg = sum / arr.length;
        System.out.println("average: " + avg);

    }
}
