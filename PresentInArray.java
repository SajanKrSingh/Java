/* Given Q queries, check if the given number is present in the array or not*/
import java.util.Scanner;
public class PresentInArray {
    static int[] makefrequencyArray(int[] arr) {
        int[] freq = new int[100005];
        for (int i = 0; i < arr.length; i++) {
            freq[arr[i]]++;
        }
        return freq;
        
    
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of array :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " Elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int [] freq = makefrequencyArray(arr);

        System.out.println("Enter the number of queries: ");
        int q = sc.nextInt();
        while(q>0){
            System.out.println("Enter the number to be searched: ");
            int num = sc.nextInt();
            if(freq[num]>0){
                System.out.println("Present");
            }
            else{                
                System.out.println("Not Present");
            }
            q--;
        }
    }
    
    
}
