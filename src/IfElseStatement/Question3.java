package IfElseStatement;
//Question 3 :Calculate income tax paid by an employee to the government as per the slabs mentioned below:
//Income Slab	Tax

import java.util.Scanner;

//2.5L – 5.0L  	5%
//5.0L – 10.0L 	20%
//Above 10.0L	30%
//Note that there is not tax below 2.5L. Take the input amount as input from the user.
public class Question3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your income in lakhs per annum");
        float tax = 0;
        float income = sc.nextFloat();
        if (income <= 2.5) {
            tax = tax + 0;
        } else if (income > 2.5f && income <= 5f) {
            tax = tax + 0.05f * (income - 2.5f);
        } else if (income > 5f && income <= 10.0f) {
            tax = tax + 0.05f * (5.0f - 2.5f);
            tax = tax + 0.02f * (income - 5f);
        } else if (income > 10.0f) {
            tax = tax + 0.5f * (5.0f - 2.5f);
            tax = tax + 0.2f * (10.0f - 5f);
            tax = tax + 0.3f * (income - 10.0f);

        }
        System.out.println("The total tax paid by the employee is : " + tax);

    }
}
