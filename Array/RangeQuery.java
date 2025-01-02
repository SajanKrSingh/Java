import java.util.Scanner;

public class RangeQuery {
    public static void printArray(int[] arr) {
        for (int i = 1; i < arr.length; i++) { // Start from index 1
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static int[] makePrefixSum(int[] arr) {
        int n = arr.length - 1; // Adjust for 1-based indexing
        int[] prefixSum = new int[n + 1];
        prefixSum[1] = arr[1];
        for (int i = 2; i <= n; i++) {
            prefixSum[i] = prefixSum[i - 1] + arr[i];
        }
        return prefixSum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Size of array:");
        int n = sc.nextInt();
        int[] arr = new int[n + 1]; // Declare the array (1-based indexing)

        System.out.println("Enter " + n + " Elements:");
        for (int i = 1; i <= n; i++) { // Start from index 1
            arr[i] = sc.nextInt();
        }

        System.out.println("Original array:");
        printArray(arr);

        int[] preSum = makePrefixSum(arr);

        System.out.println("Prefix Sum array:");
        printArray(preSum);

        System.out.println("Enter the number of queries:");
        int q = sc.nextInt();
        while (q-- > 0) {
            System.out.println("Enter the range (1-based indexing):");
            int l = sc.nextInt();
            int r = sc.nextInt();
            int ans = preSum[r] - preSum[l - 1];
            System.out.println("Sum is: " + ans);
        }
    }
}
