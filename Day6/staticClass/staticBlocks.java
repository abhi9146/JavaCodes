class My{
    static int x;
    static{
        x=20;
        System.out.println("Block 1");
    }
    static{
        x=30;
        System.out.println("Block 2");
    }
}
public class staticBlocks {
    public static void main(String[] args) {
        My m=new My();
    }
}
