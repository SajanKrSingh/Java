// Count the number of triplets in an array whose sum is equal to the given number target.

import java.util.Scanner;
public class ArrayPattern2 {
    static int tripletSum(int[] arr, int target) {
        int n = arr.length;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (arr[i] + arr[j] + arr[k] == target) {
                        ans++;
                    }
                }
            }
        }
        return ans;
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
        System.out.println("Enter Target :");
        int x = sc.nextInt();
        System.out.println("Number of triplets are: " + tripletSum(arr, x));
    }
    
}
