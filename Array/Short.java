import java.rmi.server.RemoteServer;
import java.util.Scanner;


public class Short {
    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    static void reverse(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            swap(arr, left, right);
            left++;
            right--;
        }
    }
    
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    //Input:1 0 1 0 1 0
    //Output:0 0 0 1 1 1
    static void sortZeroAndOne(int[] arr) {
        int n = arr.length;
        int left = 0;
        int right = n - 1;
        while (left < right) {
            if (arr[left] == 1 && arr[right] == 0) {
                swap(arr, left, right);
                left++;
                right--;
            } else if (arr[left] == 0) {
                left++;
            } else if (arr[right] == 1) {
                right--;
                
            }
            
        }
    }

    /* Given an array of inetgers 'a', move all the even integer at 
    the begining of the array followed by all the odd integers. 
    The relative order of odd or even integer does not matter. 
    Return any array that satisfies this condition. */
    static void sortEvenOdd(int[] arr) { 
        int n = arr.length;
        int left = 0;
        int right = n - 1;
        while (left < right) {
            if (arr[left] % 2 == 1 && arr[right] % 2 == 0) {
                swap(arr, left, right);
                left++;
                right--;
            } 
            if (arr[left] % 2 == 0) {
                left++;
            } 
        if (arr[right] % 2 == 1) {
                right--;
            }
        }
    }

    /*Given an itegers 'a' sorted in non-decreasing order, 
    return an array of the squares of each number sorted in non-decreasing order */ 

    static int[] sortSquares(int[] arr) {
        int n= arr.length;
        int left = 0;
        int right = n - 1;
        int[] ans = new int[n];
        int k = 0;
        while (left <= right) {
            if(Math.abs(arr[left]) > Math.abs(arr[right])){
                ans[k++] = arr[left] * arr[left];
                left++;
            } else {
                ans[k++] = arr[right] * arr[right];
                right--;
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
        System.out.println("Original array :");
        printArray(arr);
        // sortZeroAndOne(arr);
        // System.out.println("Sorted array :");
        // printArray(arr); 
        // System.out.println("Sorting Even and Odd integers :");
        // sortEvenOdd(arr);
        // System.out.println("Sorted array :");
        // printArray(arr);
        int[] ans = sortSquares(arr);
        System.out.println("Squares of sorted array :");
        reverse(ans);
        printArray(ans);

    }
}
