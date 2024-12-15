/* Given an array 'a' consisting of integers, return the first value 
that is repeating in this array 
if no value is being repeated return -1
 */

 import java.util.Scanner;
public class FirstRepeatingNumArr {
    static int firstRepeatingNum(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    return arr[i];
                }
            }
        }
        return -1;
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
        System.out.println("First repeating number is: " + firstRepeatingNum(arr)); 
        }
    
}
