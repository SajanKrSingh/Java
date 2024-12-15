import java.util.Scanner;

public class ConditionalOperators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  Number: ");
        int num1 = sc.nextInt();
        if(num1 %2 == 0 && num1 %3 == 0){
            System.out.println("Number is divisible by 2 and 3");
        }
        else{
            System.out.println("Number is not divisible by 2 and 3");
        }
    }      
}
