public class Fibonacci {
    public static int fibonacci(int n){
        if (n < 0){
            throw new IllegalArgumentException("Input must be non-negativenumber.");

        }
        if (n ==0){
            return 0;
        }else if ( n== 1){
            return 1;
        }else{
            return fibonacci (n - 1) + fibonacci(n - 2);
        }
    }
    public static void main(String[] args) {
        int n = 45;
        int result = fibonacci(n);
        System.out.println("Fibonacci of " + n + " is: " + result);
    }
}
