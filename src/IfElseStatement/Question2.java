package IfElseStatement;

import java.util.Scanner;

public class Question2 {

    public static void main(String[] args) {
   
        //Write a program to find out whether a student
        //is pass or fail if it requires total 40% and
        //at least 33% in each subject to pass.Assume 3 subject
        //and take marks as an input from the user.
        byte m1, m2, m3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks Physics");
        m1 = sc.nextByte();
        System.out.println("Enter your marks Chemestry");
        m2 = sc.nextByte();
        System.out.println("Enter your marks Mathemetics");
        m3 = sc.nextByte();

        float avg = (m1 + m2 + m3) / 3.0f;
        System.out.println("Your Average number is " + avg);
        if (avg >= 40 && m1 >= 33 && m2 >= 33 && m3 >= 33) {
            System.out.println("Congratulations, you have been promoted");
        } else {
            System.out.println("Sorry, You have been not promoted");
        }

    }
}
