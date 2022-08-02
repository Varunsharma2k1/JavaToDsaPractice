package Recursions;

public class BinarySearchR {
    public static void main(String[] args) {
        int[] arr={1,2,4,5,6,7};
        int ans= Bs(arr,0,arr.length-1,1);
        System.out.println(ans);
    }
    static int Bs(int[] arr ,int s, int e,int t){
        int m = s+(e-s)/2;
        if(arr[m]==t)
            return m;
        if(t>arr[m])
            return Bs(arr,m+1,e,t);
        else
            return Bs(arr,s,m-1,t);
    }
}
