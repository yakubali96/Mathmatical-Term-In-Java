package problemsolving2;

import java.util.Scanner;

public class Summation {

    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your number: ");
        for (int i = 0; i > -1; i++) {
            int num = sc.nextInt();
            if (num == -1) {
                sum =+ num;
                System.out.println("total sum " + sum);
            }

        }

    }

}
