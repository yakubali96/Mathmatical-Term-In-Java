package MathMaticalTerm;
//write a java program to test if an array contains a specific value

public class ArraySpecifiqValue {

    public static void main(String[] args) {
        int[] num = {4, 5, 6, 3, 0, 2, 6, 7, 9};

        int toFind = 11;
        boolean found = false;

        for (int i : num) {
            if (i == toFind) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println(toFind + " is found");
        } else {
            System.out.println(toFind + " is not found");
        }

    }

}
