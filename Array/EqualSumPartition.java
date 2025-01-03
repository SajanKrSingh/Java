import java.util.Scanner;

public class EqualSumPartition {

    static int findArraySum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
    static boolean equalSumArrayPartition(int[] arr) {
        int totalSum=findArraySum(arr);
        int prefixSum=0;
        for (int i = 0; i < arr.length; i++) {
            prefixSum+=arr[i];
            int suffixSum=totalSum-prefixSum;
            if (prefixSum==suffixSum) {
                return true;
            }
        }
        return false;
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
        System.out.println("Equal sum partition possible:" + equalSumArrayPartition(arr));
        
    }      
}   

