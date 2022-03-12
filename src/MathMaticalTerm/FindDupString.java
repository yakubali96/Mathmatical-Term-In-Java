package MathMaticalTerm;
//Write a Java program to find the duplicate values of an array of string values.

public class FindDupString {

    public static void main(String[] args) {
        String[] arr = {"Apple", "Mango", "Apple'", "PineApple", "Orange"};
        for (int i = 0; i < arr.length - 1; i++) {
            // System.out.println(arr[i]);

            for (int j = i + 1; j < arr.length; j++) {
//                System.out.println(arr[j]);
                if (arr[i].equals(arr[j]) && (i != j)) {
                    System.out.println("Duplicate Element: " + arr[j]);

                }
            }
        }

    }

}
