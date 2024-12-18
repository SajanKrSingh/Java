public class SwapTwoInt {
    
    static void swap(int a, int b) {
        System.out.println("Before swap: a = " + a + ", b = " + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swap: a = " + a + ", b = " + b);
    }

    // given 2 integers a and b, swap the 2 given value using sum and difference
    static void swapWithoutTemp(int a, int b) {
        System.out.println("Before swap: a = " + a + ", b = " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After swap: a = " + a + ", b = " + b);
        
    }
    public static void main(String[] args) {
        int a = 10, b = 20;
        swap(a, b);
        System.out.println("Without Temp");
        swapWithoutTemp(a, b);
    }
    
}
