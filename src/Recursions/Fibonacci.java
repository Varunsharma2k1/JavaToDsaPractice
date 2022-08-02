package Recursions;

public class Fibonacci {
    public static void main(String[] args) {
        int ans = fib(2);
        System.out.println(ans);
    }
    static int fib(int n){
        if(n==0)
            return 0;
        if(n==1)
            return 1;
        return fib(n-1) + fib(n-2);
    }
}
