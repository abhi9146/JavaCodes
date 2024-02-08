class TV{
    public void switchOn(){
        System.out.println("Tv switched on");
    }
    public void changeChannel(){
        System.out.println("TV Channel changed");
    }
}
class smartTv extends TV{
    public void switchOn(){
        System.out.println("smartTv switched on");
    }
    public void changeChannel(){
        System.out.println("smartTv Channel changed");
    }
    public void browse(){
        System.out.println("smartTv browse");
    }
}
public class methodOverridng2 {
    public static void main(String[] args) {
        // TV t=new TV();
        // t.switchOn();
        // t.changeChannel();

        // smartTv t=new smartTv();
        // t.switchOn();
        // t.changeChannel();
        // t.browse();

        TV t=new smartTv();
        t.switchOn();
        t.changeChannel();
    }

}
