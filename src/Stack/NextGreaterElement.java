package Stack;

import java.util.*;

public class NextGreaterElement {
    public static void main(String[] args) {
        int[] a1 = {4,1,2};
        int[] a2 = {1,3,4,2};
        int[] ans  = new int[a1.length];
       Stack<Integer> stack1= new Stack<>();

       for(int i = a1.length-1;i>=0;i--){
           stack1.push(a1[i]);
       }

        for(int i = 0 ;i< a1.length;i++){
            Stack<Integer> stack2= new Stack<>();
            for(int j = a2.length-1;j>=0;j--){
                stack2.push(a2[j]);
            }
            if(!stack1.peek().equals(stack2.peek()))
                stack2.pop();

            else{
                stack2.pop();

                if(stack1.peek() > (stack2.peek()))
                    ans[i] = -1;
                else
                {
                    System.out.println(stack2.peek());
                    ans[i] = stack2.peek();
            }}
        }
        System.out.println(Arrays.toString(ans));

    }
}
