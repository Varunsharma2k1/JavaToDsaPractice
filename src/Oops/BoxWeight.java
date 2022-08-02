package Oops;

public class BoxWeight extends Box{
    int weight;

    public BoxWeight(){
        this.weight=-1;
    }

    public BoxWeight(int side, int weight) {
        super(side);
        this.weight = weight;
    }
}
