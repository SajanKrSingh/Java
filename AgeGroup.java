import java.util.Scanner;
public class AgeGroup {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        if (age <= 12) {
            System.out.println("You are a child.");
        } else if (age <= 18) {
            System.out.println("You are a teenager.");
        } else {
            System.out.println("You are an adult.");
        }
    }
}
