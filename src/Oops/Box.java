package Oops;

public class Box {
    int l;
    int w;
    int h;

    Box(){
        this.w=-1;
        this.h=-1;
        this.l=1;
    }
    Box(int side){
        this.l=side;
        this.w=side;
        this.h=side;
    }
}
