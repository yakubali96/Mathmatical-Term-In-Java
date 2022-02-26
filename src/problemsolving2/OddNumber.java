package problemsolving2;

//print the odd number less than 100
import java.util.Scanner;

public class OddNumber {

    public static void main(String[] args) {
//        for (int i = 1; i <= 100; i += 2) {
//            System.out.println(i);
//        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your number: ");
        int num = sc.nextInt();
        if (num % 2 == 1) {
            System.out.println(num + " is odd number");
        } else {
            System.out.println(num + " is even number");
        }

    }
}
