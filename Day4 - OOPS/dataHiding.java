
class rectangle{
    private int length=0;
    private int breadth=0;
    
    // method to get the length 
    public int getLength(){
        return length;
    }
    public int getBreadth(){
        return breadth;
    }
    public void setLength(int len){
        if(len>0) length=len;
    }
    public void setBreadth(int bre){
         if(bre>0) breadth=bre;
    }
    public int area(){
        return (length*breadth);
    }
}

public class dataHiding {
    public static void main(String[] args) {
        rectangle r=new rectangle();
        r.setLength(8);
        r.setBreadth(10);

        System.out.println("Length is : "+r.getLength());
        System.out.println("breadth is : "+r.getBreadth());
        System.out.println("Area is : "+r.area());
    }
}
