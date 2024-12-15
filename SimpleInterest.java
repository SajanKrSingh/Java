import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Principal Amount: ");
        float p = sc.nextFloat();
        System.out.println("Enter Rate of Interest: ");
        float r = sc.nextFloat();
        System.out.println("Enter Time: ");
        float t = sc.nextFloat();
        float si = (p * r * t) / 100;
        System.out.println("Principal Amount is: " + p);
        System.out.println("Rate of Interest is: " + r);
        System.out.println("Time is: " + t);
        System.out.println("Simple Interest is: " + si);
    }
}
