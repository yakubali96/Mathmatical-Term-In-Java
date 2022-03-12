package SecondProblem;
//Find the Largest of three Numbers

public class LargestNumber {

    public static void main(String[] args) {
        int largest = 0;
        int x = 7;
        int y = 20;
        int z = 56;
        if (x > largest) {
            largest = x;
        }
        if (y > largest) {
            largest = y;
        }
        if (z > largest) {
            largest = z;
            System.out.println("Largest number is: " + z);
        }
    }
}
