
package MathMaticalTerm;
//Write a Java program to find the duplicate values of an array of integer values.
public class FindArrayDuplicate {
    public static void main(String[] args) {
        int []arr={12,22,3,5,44,21,22};
        for(int i=0;i<arr.length;i++){
        for(int j=i+1;j<arr.length;j++){
        if(arr[i]==arr[j])
                System.out.println(arr[j]);
        }
        }
    }
}
