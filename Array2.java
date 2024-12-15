// check if the given array is sorted or not

import java.util.Scanner;
public class Array2 {
    static boolean isSorted(int[] arr){
        boolean check = true;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i-1]) {
                check = false;
                break;
            }
        }
        return check;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        
        System.out.println("Enter Size of array :");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter " + n + " Elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Is the array sorted? " + isSorted(arr));
    }

}
