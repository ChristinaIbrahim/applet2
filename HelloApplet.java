import java.applet.Applet;
import java.awt.Graphics;


public class HelloApplet extends Applet
{
	public void paint(Graphics d)
	{
		d.drawString("Hello java",100,100);
	}
}