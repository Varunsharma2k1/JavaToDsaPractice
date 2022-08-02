package com.Varun;

import java.util.Scanner;

public class MatchinARule {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
      String[][]  items = {{"phone","blue","pixel"},{"computer","silver","lenovo"},
                           {"phone","gold","iphone"}};
        System.out.println("Enter Key");
      String Key = in.nextLine();
        System.out.println("Enter value");
      String value = in.nextLine();
      int c=0;
        switch (Key) {
            case "type" -> {
                int j=0;
                for (int i = 0; i < 3; i++) {
                    if (items[i][j].equals(value))
                        c++;
                }
                System.out.println(c);
            }
            case "color" -> {
                for (int i = 0; i < 3; i++) {
                    if (items[i][1].equals(value))
                        c++;
                }
                System.out.println(c);
            }
            case "name" -> {
                for (int i = 0; i < 3; i++) {
                    if (items[i][2].equals(value))
                        c++;
                }
                System.out.println(c);
            }
        }


    }
}
