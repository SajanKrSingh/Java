public class RevArray {
    static int[] revArray(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];
        int j = 0;
        for (int i = n - 1; i >= 0; i--) {
            ans[j++] = arr[i];
        }
        return ans;
       
    }
    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    //Without using extra space (inplace) or without using another array
    static void swapInArray(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static void revArrayInPlace(int[] arr) {
        int i =0 ,j = arr.length-1;
        while(i<j){
            swapInArray(arr,i,j);
            i++;
            j--;
        }
        
    }


    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int[] ans   = revArray(arr);
        printArray(ans);

        System.out.println("Without using extra space (inplace) or without using another array");
        revArrayInPlace(arr);
        printArray(arr);
    }
}
