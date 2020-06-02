//Name: Rachel Leong
//Date: October 28, 2019
//Teacher: Ms. Krasteva
//This class animates the 3 bears entering and leaving the screen.

//the "Bear" class
import java.awt.*;
import hsa.Console;
import java.lang.*; //to access Thread class

public class Bear extends Thread
{
    private Console c; //the output console
    private int diff = 0; //default x-position difference parameter
    private Color bearColour; //private Color variable that holds the value of the bear's colour
    private Color bearBrown = new Color (158, 79, 27); //default bear colour parameter

    public void bear ()
    {
	//local colour variable for the forest floor
	Color lightBrown = new Color (166, 117, 53);
	//local colour variable for the bear's stomach, ears, and snout
	Color bearLightBrown = new Color (196, 160, 132);

	//loop used to animate the bears moving to the right
	for (int i = 0 ; i < 280 ; i++)
	{
	    //erase
	    c.setColor (lightBrown);
	    c.fillRect (-100 + i - diff, 390, 100, 100);

	    //draw bear
	    synchronized (c) //learned from: https://docs.google.com/document/d/1mgR09oneNIJhgefgkHK2vpaSQ5gZ8xDqB7rtPDQ7YHM/edit By: Andy Pham
	    {
		c.setColor (bearColour);
		c.fillRoundRect (-90 + i - diff, 435, 60, 40, 10, 10); //body
		c.fillRect (-90 + i - diff, 465, 15, 25); //right leg
		c.fillRect (-45 + i - diff, 465, 15, 25); //left leg
		c.setColor (Color.black);
		c.fillOval (-46 + i - diff, 430, 30, 30); //head outline
	    }
	    synchronized (c)
	    {
		c.setColor (bearColour);
		c.fillOval (-45 + i - diff, 431, 28, 28); //head
		c.fillOval (-45 + i - diff, 425, 10, 10); //left ear
		c.fillOval (-25 + i - diff, 425, 10, 10);  //right ear
	    }
	    synchronized (c)
	    {
		c.setColor (bearLightBrown);
		c.fillOval (-41 + i - diff, 446, 18, 13);  //snout
		c.fillArc (-80 + i - diff, 460, 40, 30, 0, 180);  //stomach
	    }
	    synchronized (c)
	    {
		c.setColor (Color.white);
		c.fillRect (-90 + i - diff, 393, 70, 30); //speech bubble
		c.drawLine (-90 + i - diff, 433, -90 + i - diff, 423);
		c.drawLine (-90 + i - diff, 433, -89 + i - diff, 423);
		c.drawLine (-90 + i - diff, 433, -88 + i - diff, 423);
		c.drawLine (-90 + i - diff, 433, -87 + i - diff, 423);
		c.drawLine (-90 + i - diff, 433, -86 + i - diff, 423);
	    }
	    synchronized (c)
	    {
		c.setColor (Color.black);
		c.fillOval (-39 + i - diff, 440, 5, 5);  //left eye
		c.fillOval (-29 + i - diff, 440, 5, 5);  //right eye
		c.fillOval (-36 + i - diff, 450, 8, 4);  //nose
		c.drawLine (-32 + i - diff, 454, -32 + i - diff, 456); //mouth
		c.drawLine (-34 + i - diff, 456, -30 + i - diff, 456);
		c.drawString ("Look! There's", -88 + i - diff, 405); //text
		c.drawString ("a monkey!", -88 + i - diff, 415);
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

	//loop used to animate the bear moving to the left
	for (int i = 280 ; i > 0 ; i--)
	{
	    //erase
	    c.setColor (lightBrown);
	    c.fillRect (-100 + i - diff, 390, 100, 100);

	    //draw bear
	    synchronized (c)
	    {
		c.setColor (bearColour);
		c.fillRoundRect (-90 + i - diff, 435, 60, 40, 10, 10); //body
		c.fillRect (-90 + i - diff, 465, 15, 25); //right leg
		c.fillRect (-45 + i - diff, 465, 15, 25); //left leg
		c.setColor (Color.black);
		c.fillOval (-46 + i - diff, 430, 30, 30); //head outline
	    }
	    synchronized (c)
	    {
		c.setColor (bearColour);
		c.fillOval (-45 + i - diff, 431, 28, 28); //head
		c.fillOval (-45 + i - diff, 425, 10, 10); //left ear
		c.fillOval (-25 + i - diff, 425, 10, 10);  //right ear
	    }
	    synchronized (c)
	    {
		c.setColor (bearLightBrown);
		c.fillOval (-41 + i - diff, 446, 18, 13);  //snout
		c.fillArc (-80 + i - diff, 460, 40, 30, 0, 180);  //stomach
	    }
	    synchronized (c)
	    {
		c.setColor (Color.white);
		c.fillRect (-90 + i - diff, 393, 70, 30); //speech bubble
		c.drawLine (-90 + i - diff, 433, -90 + i - diff, 423);
		c.drawLine (-90 + i - diff, 433, -89 + i - diff, 423);
		c.drawLine (-90 + i - diff, 433, -88 + i - diff, 423);
		c.drawLine (-90 + i - diff, 433, -87 + i - diff, 423);
		c.drawLine (-90 + i - diff, 433, -86 + i - diff, 423);
	    }
	    synchronized (c)
	    {
		c.setColor (Color.black);
		c.fillOval (-39 + i - diff, 440, 5, 5);  //left eye
		c.fillOval (-29 + i - diff, 440, 5, 5);  //right eye
		c.fillOval (-36 + i - diff, 450, 8, 4);  //nose
		c.drawLine (-32 + i - diff, 454, -32 + i - diff, 456); //mouth
		c.drawLine (-34 + i - diff, 456, -30 + i - diff, 456);
		c.drawString ("Ah, we", -88 + i - diff, 405); //text
		c.drawString ("can't help him.", -88 + i - diff, 415);
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


    //basic bear
    public Bear (Console con)
    {
	c = con;
	bearColour = bearBrown;
    }


    //bear with x-position difference parameter
    public Bear (Console con, int x)
    {
	c = con;
	diff = x;
	bearColour = bearBrown;
    }


    //bear with x-position difference parameter and a Color parameter
    public Bear (Console con, int x, Color t)
    {
	c = con;
	diff = x;
	bearColour = t;
    }


    public void run ()
    {
	bear ();
    }
} //Bear class


