package ao;
import java.awt.Graphics;
import java.applet.Applet;
public class HelloWorld extends Applet {
       String hw_text;
       public void init(){
    	   hw_text="Hello World";
       }
       public void paint(Graphics g){
    	   g.drawString(hw_text,25,25);
       }
}
