
import java.awt.*;

public class App2 extends Frame
{
    Label l;
    TextField tf;
    Button b;
    
    public App2()
    {
        super("My App");
        
        setLayout(new FlowLayout());
        
        l=new Label("Name");
        tf=new TextField(20);
        b=new Button("OK");
        
        add(l);
        add(tf);
        add(b);   
        
    }  
    public static void main(String[] args) 
    {
        App2 f=new App2();
        f.setSize(400,400);
        f.setVisible(true);
    } 
}
