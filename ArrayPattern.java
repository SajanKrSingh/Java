// Find the total number of pairs in the array whose sum is equal to the given number x.
import java.util.Scanner;
public class ArrayPattern{
    public static int countPairs(int[] arr, int target) {    
    int n = arr.length;
    int ans = 0;
    for (int i = 0; i < n; i++) {
        for (int j = i + 1; j < n; j++) {
            if (arr[i] + arr[j] == target) {
                ans++;
            }
        }
    }
    return ans;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of array :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " Elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter Target :");
        int x = sc.nextInt();
        System.out.println("Number of pairs are: " + countPairs(arr, x));
    }
    
}
