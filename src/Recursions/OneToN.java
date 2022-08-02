package Recursions;

public class OneToN {
    public static void main(String[] args) {
        Print(10);
    }
    static void Print(int n){
        if(n<1)
            return;
        else{

        Print(n-1);
            System.out.print(n+" ");
    }}

}
