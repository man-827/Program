package ao;

import java.awt.Graphics;
import java.applet.Applet;
public class AppletPara extends Applet{
	String s1,s2;
	public void init(){
		s1="û��ʲô����������";
		s2="�ǵ�";
	}
	public void paint(Graphics g){
		g.drawString(s1,10,10);
		g.drawString(s2,10,30);
	}
}
