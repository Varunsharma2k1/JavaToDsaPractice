package Recursions;

public class Palindrome {
    public static void main(String[] args) {
        int n =  123;
        int ans1= Reverse(123);
        System.out.println(ans1);
//        boolean ans = isPalindrome(n);
// int s=0;
    }
    static int Reverse(int n){
        int r =n%10;
        if(n<10)
            return n;
        return r*10 + Reverse(n/10);
    }

}
