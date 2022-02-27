package SirProject;

//Write a Java program to reverse a string.
public class ReverseString {

    public static void main(String[] args) {
        String n = "yakub";
        String reverse = "";
        for (int i = n.length() - 1; i >= 0; i--) {
            reverse = reverse + n.charAt(i);
        }
        System.out.println(reverse);
    }
}
