//Count the number of occurrences of a particular  element in an array
import java.util.Scanner;

public class Array1{
    static int CountOccurrences(int[] arr, int x) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                count++;
            }
        }
        return count;
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
        System.out.println("Enter x :");
        int x = sc.nextInt();
        System.out.println("Count of x : " + CountOccurrences(arr, x));
    }
}