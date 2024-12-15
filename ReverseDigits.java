//Reverse the digits of a number
import java.util.Scanner;
public class ReverseDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int ans = 0;
        while (n > 0) {
            ans = ans * 10 + n % 10;
            n/= 10;
        }
        System.out.println("Reverse of is " + ans);
    }       
    
}
