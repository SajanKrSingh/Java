//find the following series  s = 1-2+3-4+5............n
import java.util.Scanner;
public class SumSeries {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                sum = sum - i;
            } else {
                sum = sum + i;
            }
        }
        System.out.println("Sum of series is: " + sum);
    }

    
}
