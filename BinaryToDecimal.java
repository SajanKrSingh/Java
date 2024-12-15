//Write a program to convert Binary to Decimal number.

import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a binary number: ");
        int BinaryNum = sc.nextInt();
        int ans = 0;
        int pw = 1;
        while (BinaryNum > 0) {
            int unit_digits = BinaryNum % 10;
            ans += (unit_digits * pw);
            pw *= 2;
            BinaryNum /= 10;
        }
        System.out.println("Decimal number is: " + ans);        
    }
    
}
