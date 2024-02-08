import javax.sound.midi.ShortMessage;

class phone{
    public void call(){System.out.println("call method of phone class");}
    public void sms(){System.out.println("sms method of phone class");}
}
interface camera{
    void click();
    void videoRecord();
}
interface musicPlayer{
    void play();
    void stop();
}

class smartPhone extends phone implements camera , musicPlayer{
   public void click(){System.out.println("photo clicked");}
   public void videoRecord(){System.out.println("recording taken");}

   public void play(){System.out.println("method to play music");}
   public void stop(){System.out.println("method to stop music");}
}
public class example {
    public static void main(String[] args) {System.out.println("SmartPhone functions");

        smartPhone s=new smartPhone();
        s.click();s.videoRecord();s.play();s.stop(); s.call();s.sms();

        System.out.println("\nphone functions");

        phone p=new smartPhone();
        p.call();p.sms();

        System.out.println("\nmusic player functions");

        musicPlayer m=new smartPhone();
        m.play();m.stop();

        System.out.println("\ncamera functions");

        camera c=new smartPhone();
        c.click();c.videoRecord();

    }
}
