//Find the sum of digits in a given number

import java.util.Scanner;
public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int SumOfDigits= 0;
        int originalNum = n;
        while (n > 0) {
            SumOfDigits += n % 10;
            n = n / 10;
        }
        System.out.println("Sum of digits in " + originalNum + " is " + SumOfDigits);
    }
}
