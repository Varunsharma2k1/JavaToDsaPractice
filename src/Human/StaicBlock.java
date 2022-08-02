package Human;

public class StaicBlock {

    static int a=4;
    static int b;

    static {
        System.out.println("Tam int the static block");
        b=a*5;
    }

    public static void main(String[] args) {
        StaicBlock obj = new StaicBlock();
        System.out.println(StaicBlock.a +""+ StaicBlock.b);
    }
}
