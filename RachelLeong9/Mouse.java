//Name: Rachel Leong
//Date: October 28, 2019
//Teacher: Ms. Krasteva
//This class amimates the mouse entering and leaving the screen.

//the "Mouse" class
import java.awt.*;
import hsa.Console;
import java.lang.*; //to access Thread class

public class Mouse extends Thread
{
    private Console c; //the output console

    public void mouse ()
    {
	//local colour variable for the forest floor
	Color lightBrown = new Color (166, 117, 53);
	//local colour variables for the mouse
	Color beige = new Color (230, 174, 106);
	Color pink = new Color (253, 204, 255);

	//loop used to animate the mouse moving to the right
	for (int i = -100 ; i < 130 ; i++)
	{
	    //erase
	    c.setColor (lightBrown);
	    c.fillRect (-90 + i, 425, 90, 75);

	    //draw mouse
	    synchronized (c)  //learned from: https://docs.google.com/document/d/1mgR09oneNIJhgefgkHK2vpaSQ5gZ8xDqB7rtPDQ7YHM/edit By: Andy Pham
	    {
		c.setColor (beige);
		c.fillArc (-55 + i, 473, 45, 40, 0, 180); //body
		c.setColor (pink);
		c.fillRect (-70 + i, 490, 15, 4); //tail
		c.fillArc (-32 + i, 468, 15, 15, 10, 210); //ear
	    }
	    synchronized (c)
	    {
		c.setColor (Color.white);
		c.fillRect (-65 + i, 430, 60, 30); //speech bubble
		c.drawLine (-65 + i, 470, -65 + i, 460);
		c.drawLine (-65 + i, 470, -64 + i, 460);
		c.drawLine (-65 + i, 470, -63 + i, 460);
		c.drawLine (-65 + i, 470, -62 + i, 460);
		c.drawLine (-65 + i, 470, -61 + i, 460);
	    }
	    synchronized (c)
	    {
		c.setColor (Color.black);
		c.fillOval (-25 + i, 479, 5, 5); //eye
		c.fillOval (-13 + i, 489, 7, 7); //nose
		c.drawLine (-20 + i, 485, -17 + i, 482); //whiskers
		c.drawLine (-18 + i, 488, -15 + i, 485);
		c.drawString ("Let's try to", -63 + i, 442); //text
		c.drawString ("help him!", -63 + i, 452);
	    }

	    //used to delay animation
	    try
	    {
		sleep (40);
	    }
	    catch (Exception e)
	    {
	    }
	}

	//loop used to animate the mouse moving to the left
	for (int i = 130 ; i > -100 ; i--)
	{
	    //erase
	    c.setColor (lightBrown);
	    c.fillRect (-90 + i, 425, 120, 75);

	    //draw mouse
	    synchronized (c)
	    {
		c.setColor (beige);
		c.fillArc (-55 + i, 473, 45, 40, 0, 180); //body
		c.setColor (pink);
		c.fillRect (-70 + i, 490, 15, 4); //tail
		c.fillArc (-32 + i, 468, 15, 15, 10, 210); //ear
	    }
	    synchronized (c)
	    {
		c.setColor (Color.white);
		c.fillRect (-65 + i, 430, 107, 30); //speech bubble
		c.drawLine (-65 + i, 470, -65 + i, 460);
		c.drawLine (-65 + i, 470, -64 + i, 460);
		c.drawLine (-65 + i, 470, -63 + i, 460);
		c.drawLine (-65 + i, 470, -62 + i, 460);
		c.drawLine (-65 + i, 470, -61 + i, 460);
	    }
	    synchronized (c)
	    {
		c.setColor (Color.black);
		c.fillOval (-25 + i, 479, 5, 5); //eye
		c.fillOval (-13 + i, 489, 7, 7); //nose
		c.drawLine (-20 + i, 485, -17 + i, 482); //whiskers
		c.drawLine (-18 + i, 488, -15 + i, 485);
		c.drawString ("His tree got cut down,", -63 + i, 442); //text
		c.drawString ("it's a stump now.", -63 + i, 452);
	    }

	    //used to delay the animation
	    try
	    {
		sleep (40);
	    }
	    catch (Exception e)
	    {
	    }
	}
    }


    public Mouse (Console con)
    {
	c = con;
    }


    public void run ()
    {
	mouse ();
    }
} //Mouse class
