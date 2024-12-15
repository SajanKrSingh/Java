// Find the second largest element in the given array(ans will always exist)
import java.util.Scanner;
public class SecondLargestEle {
    static int findMax(int[] arr) {
        int mx =Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > mx) {
                mx = arr[i];
            }
        }
        return mx;
    }
    static int findSecondLargest(int[] arr) {
        int mx = findMax(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == mx) {
                arr[i] = Integer.MIN_VALUE;
            }
        }
        int secondLargest = findMax(arr);
        return secondLargest;
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
        System.out.println("Second largest element is: " + findSecondLargest(arr));
    }
}
