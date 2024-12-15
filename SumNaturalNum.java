import java.util.Scanner;

public class SumNaturalNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int sum = 0;
        int num = 1;
        while (num<=n) {
            sum = sum + num;
            num++;  
            
        }
        System.out.println("Sum of "+n+" natural numbers is "+sum);
    }
}
