package MathMaticalTerm;
//Write a Java program to reverse an array of integer values.

public class ReverseArray {

    public static void main(String[] args) {
//        int[] arr = {12,13,14,15,16,17,18};
//        System.out.println("Orginal Array: "+arr);
//        for(int i=0;i<arr.length;i++){
//            System.out.println(arr[i]+" ");
//        }
//        System.out.println();
//        for(int i=arr.length-1;i>=0;i--){
//            System.out.println(arr[i]+" ");
//        }

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
        System.out.println();
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i] + " ");
        }
    }
}
