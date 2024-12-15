// Decimal to Binary
import java.util.Scanner;
public class DecimalToBanary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a decimal number: ");
        int DecimalNum = sc.nextInt();
        int ans = 0;
        int pw = 1;
        while (DecimalNum > 0) {
            int unit_digits = DecimalNum % 2;
            ans += (unit_digits * pw);
            pw *= 10;
            DecimalNum /= 2;
        }
        System.out.println("Binary number is: " + ans);        
    }
    
}
