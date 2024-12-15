import java.util.Scanner;

public class NaturalNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int num = 1;
        while (num<=n){
            System.out.println(num);
            num++;            
        }
    }
}
