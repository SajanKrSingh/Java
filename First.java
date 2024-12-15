import java.util.Scanner;
public class First{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Name");
        String name = sc.nextLine();
        System.out.println("Hello "+name);
        System.out.println("Enter Your lucky Number");
        int num = sc.nextInt();
        System.out.println("Your lucky number is "+num);
    }
}