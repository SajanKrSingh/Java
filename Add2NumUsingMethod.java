//java program to add two numbers using method

import java.util.Scanner;

class Add{
    int sum(int a,int b){
        int ans = a + b;
        return ans;
    }
}

public class Add2NumUsingMethod {
    public static void main(String[] args) {
        Add obj = new Add(); 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number: ");        
        int a = sc.nextInt();
        System.out.println("Enter Second Number: ");
        int b = sc.nextInt();
        System.out.println("Sum is of input number is : "+obj.sum(a,b));
    }
    
}
