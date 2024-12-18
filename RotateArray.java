// Rotate the array a by k steps , where k is non-negative.
// note : k can be greater than n as well.

import java.util.Scanner;

public class RotateArray {
    static int[] rotate(int[] arr, int k) {
        int n = arr.length;
        int[] ans = new int[n];
       int  j = 0;
        for (int i = n - k; i < n; i++) {
            ans[j++] = arr[i];
        }
        for (int i = 0; i < n - k; i++) {
            ans[j++] = arr[i];
        }
        return ans;
    }
    // without using extra space
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void reverse(int[] arr, int i, int j) { //i =start , j=end
        while (i < j) {
            swap(arr,i,j);
            i++;
            j--;
        }
        
    }
    static void rotateInPlace(int[] arr, int k) {
        int n = arr.length;
        k = k % n;
        reverse(arr, 0, n - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);
        
    }
    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {    
        System.out.println("Enter the number of elements: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the number of rotations: ");
        int k = sc.nextInt();
        System.out.println("Original array: ");
         printArray(arr);
    //     int[] ans = rotate(arr, k); // with extra space
    //     System.out.println("Rotated array: ");
    //     printArray(ans);
        rotateInPlace(arr, k);
        System.out.println("Rotated array: ");
        printArray(arr);
    }
    
}
