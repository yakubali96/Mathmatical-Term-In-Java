package SirProject;

import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        int year;
        System.out.println("Enter a year");
        Scanner sc = new Scanner(System.in);
        year = sc.nextInt();

        if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("Specified year is a leap year");
        } else {
            System.out.println("specified year is not a leap year");
        }

    }

}
