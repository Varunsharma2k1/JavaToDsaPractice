package com.Varun;
import java.util.Scanner;
public class NestedSwitchCase {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter Course");
        String course = in.nextLine();

        switch (course) {
            case "B.tech":
                System.out.println("Enter field");
                String Field = in.nextLine();
                switch (Field) {
                    case "civil" -> System.out.println("B.tech civil");
                    case "ME" -> System.out.println("B.tech ME");
                    case "CSE" -> System.out.println("B.tech CSE");
                }
                break;
            case "M.tech":
                System.out.println("Enter field");
                String Field1 = in.nextLine();
                switch (Field1) {
                    case "AI" -> System.out.println("M.tech AI");
                    case "DS" -> System.out.println("M.tech DS");
                    case "ML" -> System.out.println("M.tech ML");
                }
                break;
            case "MBA":
                System.out.println("Enter field");
                String Field2 = in.nextLine();
                switch (Field2) {
                    case "HR" -> System.out.println("MBA HR");
                    case "Management" -> System.out.println("MBA Management");
                    case "" -> System.out.println("MBA ML");
                }
                break;
        }
    }



}
