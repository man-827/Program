package ao;

import java.awt.Graphics;
import java.applet.Applet;
public class AppletPara extends Applet{
	String s1,s2;
	public void init(){
		s1="没有什么会永垂不朽";
		s2="是的";
	}
	public void paint(Graphics g){
		g.drawString(s1,10,10);
		g.drawString(s2,10,30);
	}
}
