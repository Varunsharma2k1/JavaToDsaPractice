package com.Varun;

public class NoOfStrAppInStr {
    public static void main(String[] args) {
        int c=0;
        String[] patterns = {"a","abc","bc","d"};
        String word = "abc";
        for(String s : patterns){
            for(int i=1;i<word.length();i++){
                if(word.substring(0,i).equals(s)){
                    c++;
                    break;
                }
            }
        }
        System.out.println(c);
    }
}
