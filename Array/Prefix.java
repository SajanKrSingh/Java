import java.util.Scanner;

public class Prefix {
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();   
    }
    /*Given an integer array 'a', 
    return the prefix sum/running sum 
    in the same array without creating a new array */

    static int[] makePrefixSum(int[] arr) {
        int n= arr.length;
        for(int i=1;i<n;i++){
            arr[i]=arr[i-1]+arr[i];
        }
        return arr;
    }
    public static void main(String[] args) {    
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of array :");
        int n = sc.nextInt();
        int[] arr = new int[n]; // Declare the array
        System.out.println("Enter " + n + " Elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Original array :");
        printArray(arr);

        int[] ans = makePrefixSum(arr);
        System.out.println("Prefix sum array :");
        printArray(ans);
    }

    
}
