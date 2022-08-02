package Oops;

import java.util.Arrays;

public class main {
    public static void main(String[] args) {
    Box box1 = new Box();
    Box box2 = new Box(4);
    BoxWeight box3 = new BoxWeight(4,5);
        System.out.println(box1.h);
        System.out.println(box2.h);
        System.out.println(box3.h+" "+box3.weight);
    }
}
