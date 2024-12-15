// Count the number of digits for given number n 
import java.util.Scanner;
public class NumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int NumOfDigits = 0;
        int originalNum = n;
        while (n > 0) {
            n = n / 10;
            NumOfDigits++;
        }
        System.out.println("Number of digits in " + originalNum + " is " + NumOfDigits);
        
    }
}
