package SirProject;

public class LargestNumber {

    public static void main(String[] args) {
        int x = 65;
        int y = 31;
        int z = 35;

        if (x > y && x > z) {
            System.out.println("the largest number is " + x);
        } else if (y > x && y > z) {
            System.out.println("the largest number is " + y);
        } else {
            System.out.println("the largest number is " + z);
        }
    }
}
