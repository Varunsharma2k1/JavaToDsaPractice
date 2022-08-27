package com.Varun;

import java.util.List;
import java.util.ArrayList;
public class FibonacciCheck {
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<Integer>();
        a.add(5);
        a.add(1);
        a.add(4);
        a.add(6);
        a.add(7);
        a.add(8);
        a.add(10);
        a.add(7);
        a.add(9);
      int i,j=0,k=0;
      for(i=1;i<a.size();i++){
          int flag =0;
          for(j=0;j<i;j++){
              if(a.get(i)>a.get(j))
                  continue;
              else{
                  flag=1;
                  break;
              }

          }
          if(flag==1)
              continue;
          if(flag==0){
              for(k=i+1;k<a.size();k++){
                  if(a.get(i)<a.get(k))
                      continue;
                  else
                      break;
              }
          }
          if(j==i && k==a.size()) {
              System.out.println(i);
          break;
          }
      }

    }
}
