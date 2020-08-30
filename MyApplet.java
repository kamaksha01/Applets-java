import java.applet.*;
import java.awt.*;

public class MyApplet extends Applet
{

	public void init()
	{
		System.out.println("init called");
	}
	public void start()
	{
		System.out.println("start called");
	}
	public void stop()
	{
		System.out.println("stop called");
	}
	public void destroy()
	{
		System.out.println("destroy called");
	}
	public void paint(Graphics g)
	{
		for(int r=0;r<=7;r++)
		{
			for(int c=0;c<=7;c++)
			{
				if((r+c)%2==0)
					g.setColor(Color.black);
				else
					g.setColor(Color.white);
				g.fillRect(r*50,c*50,50,50);
			}
		}
	}
}