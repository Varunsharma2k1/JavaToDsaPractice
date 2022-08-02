package com.Varun;

import java.util.Arrays;
import java.util.Scanner;


public class Code {
    public static void main(String[] args) {
//
//        Scanner in = new Scanner(System.in);
//        int n= in.nextInt();
//        int i =2;
//        while(i<n){
//            int j =2;
//            while(j<i){
//                if(i%j==0)
//                    break;
//                j++;
//            }
//            if(j==i){
//                System.out.println(i);
//            }
//        i++;
//        }

//        FIBONACCI NUMBER
//        Scanner in = new Scanner(System.in);
//          int n= in.nextInt();
//          int a=1,b=1,c=0;
//          for(int i = 0;i<n;i++){
//
//              a=b;
//              b=c;
//              c = a+b;
//
//
//          }
//        System.out.println(c);

//        Scanner in = new Scanner(System.in);
//        int n= in.nextInt();
//        int c = in.nextInt();
//        if(c==1){
//            int sum=0;
//            for(int i = 1;i<=n;i++){
//                sum += i ;
//            }
//            System.out.println(sum);
//        }
//        else if(c==2){
//            int p = 1;
//            for(int j=1;j<=n;j++){
//                p*=j;
//            }
//            System.out.println(p);
//        }
//        else
//            System.out.println("-1");

//        Scanner s = new Scanner(System.in);
//        int n = s.nextInt();
//        int count = 0;
//        for (int i = 1; count < n; i++) {
//            int ap = 3 * i + 2;
//            if (ap % 4 != 0) {
//                System.out.print(ap + " ");
//                count++;
//            }
//
//
//        }
//        Scanner s = new Scanner(System.in);
//        int n = s.nextInt();
//        int r=0,p=0;
//        while(n>0){
//            r=n%10;
//            p=p*10+r;
//            n/=10;
//        }
//        System.out.println(p);

//        Scanner s = new Scanner(System.in);
//        int n = s.nextInt();
//        int d= 0 ,l=0,base=1;
//        while(n>0){
//            l=n%10;
//            n/=10;
//            d += l*base;
//            base*=2;
//        }
//        System.out.println(d);
//        Scanner in = new Scanner(System.in);
//        int n =in.nextInt();
//        int[] binaryNum = new int[10];
//
//        // counter for binary array
//        int i = 0;
//        while (n > 0)
//        {
//            // storing remainder in binary array
//            binaryNum[i] = n % 2;
//            n = n / 2;
//            i++;
//        }
//
//        // printing binary array in reverse order
//        for (int j = i - 1; j >= 0; j--)
//            System.out.print(binaryNum[j]);
//        Scanner s = new Scanner (System.in);
//        int N = s.nextInt();
//
//
//        int[] a= new int[N];
//        for (int i =0; i<N;i++)
//        {
//            a[i]= s.nextInt();
//        }
//        int [] A= new int [N-1];
//
//        for ( int i =0;i<N-1;i++)
//        {
//            if ( a[i]==a[i+1])
//            {
//                System.out.println("false");
//                return ;
//            }
//            A[i]= a[i] -a[i+1];
//        }
//        int i =0;
//        while (i<N-2)
//        {
//            if (A[i]<0 && A[i+1]>0)
//            {
//                System.out.println("false");
//                return ;
//            }
//            i++;
//        }
//        System.out.println("true");
//        printFahrenheitTable(36,618,78);

    }
//    public static void printFahrenheitTable(int start, int end, int step) {
//
//        int ans=0;
//        for(int i =start ;i<=end;i+=step){
//            ans = con(i);
//            System.out.println(i+" "+ans);
//        }
//
//    }
//    static int con(int f){
//        int c = (f-32)*5/9;
//        return c;
//   }
static boolean checkMember(int n){

    return isPerfectSq(5*n*n+4) || isPerfectSq( 5*n*n-4);



}

    static boolean isPerfectSq(int i) {
        int s = (int)Math.sqrt(i);
        return (s*s==i);
    }

}
