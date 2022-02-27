package SirProject;
//1. Swapping the Values Without Using Third Variable by using sum and differences concepts of maths.

public class Swaping {

    public static void main(String[] args) {
        int x = 8;
        int y = 9;
        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println("After swapping:" + "x= " + x + ", y = " + y);
    }
}
