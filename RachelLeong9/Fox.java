//Name: Rachel Leong
//Date: October 28, 2019
//Teacher: Ms. Krasteva
//This class animates the fox entering and leaving the screen.

//the "Fox" class
import java.awt.*;
import hsa.Console;
import java.lang.*; //to access Thread class

public class Fox extends Thread
{
    private Console c; //the output console
    private boolean leftOrNot; //private boolean variable that checks if the fox should be moving left or right

    public void fox ()
    {
	//local colour variable for the forest floor
	Color lightBrown = new Color (166, 117, 53);
	//local colour variables for the fox
	Color foxOrange = new Color (212, 83, 19);
	Color beige = new Color (230, 174, 106);

	//executes if the fox should be moving to the left
	if (leftOrNot)
	{
	    //loop used to animate the fox moving to the left
	    for (int i = 250 ; i > 0 ; i--)
	    {
		//array of local int variables for x coordinates of fox face
		int foxBodyX[] = { - 110 + i, -70 + i, -90 + i};
		//array of local int variables for y coordinates of fox face
		int foxBodyY[] = {439, 439, 459};

		//erase
		c.setColor (lightBrown);
		c.fillRect (-120 + i, 380, 120, 120);

		//draw fox
		synchronized (c)  //learned from: https://docs.google.com/document/d/1mgR09oneNIJhgefgkHK2vpaSQ5gZ8xDqB7rtPDQ7YHM/edit By: Andy Pham
		{
		    c.setColor (foxOrange);
		    c.fillOval (-75 + i, 434, 20, 50); //tail
		    c.setColor (beige);
		    c.fillOval (-110 + i, 417, 10, 10); //left ear
		    c.fillOval (-80 + i, 417, 10, 10); //right ear
		    c.fillOval (-110 + i, 444, 40, 50); //body
		    c.setColor (foxOrange);
		    c.fillRoundRect (-103 + i, 479, 10, 20, 10, 10); //left leg
		    c.fillRoundRect (-87 + i, 479, 10, 20, 10, 10); //right leg
		    c.fillRect (-110 + i, 424, 40, 15); //face
		    c.fillPolygon (foxBodyX, foxBodyY, 3);
		}
		synchronized (c)
		{
		    c.setColor (Color.white);
		    c.fillArc (-74 + i, 434, 18, 20, 0, 180); //tail tip
		    c.fillRect (-118 + i, 382, 110, 30); //speech bubble
		    c.drawLine (-118 + i, 422, -118 + i, 408);
		    c.drawLine (-118 + i, 422, -117 + i, 408);
		    c.drawLine (-118 + i, 422, -116 + i, 408);
		    c.drawLine (-118 + i, 422, -115 + i, 408);
		    c.drawLine (-118 + i, 422, -114 + i, 408);
		}
		synchronized (c)
		{
		    c.setColor (Color.black);
		    c.drawLine (-74 + i, 444, -55 + i, 444); //line separating tail tip and rest of tail
		    c.fillOval (-104 + i, 434, 5, 5); //left eye
		    c.fillOval (-82 + i, 434, 5, 5); //right eye
		    c.fillOval (-93 + i, 454, 7, 7); //nose
		    c.drawString ("They're cutting down", -116 + i, 396); //text
		    c.drawString ("all the trees! Run!!", -116 + i, 406);
		}

		//used to delay animation
		try
		{
		    sleep (30);
		}
		catch (Exception e)
		{
		}
	    }
	}
	//executes if the fox should be moving to the right
	else
	{
	    //loop used to animate the fox moving to the right
	    for (int i = 0 ; i < 250 ; i++)
	    {
		//array of local int variables for x coordinates of fox face
		int foxBodyX[] = { - 110 + i, -70 + i, -90 + i};
		//array of local int variables for y coordinates of fox face
		int foxBodyY[] = {439, 439, 459};

		//erase
		c.setColor (lightBrown);
		c.fillRect (-120 + i, 380, 120, 120);

		//draw fox
		synchronized (c)
		{
		    c.setColor (foxOrange);
		    c.fillOval (-75 + i, 434, 20, 50); //tail
		    c.setColor (beige);
		    c.fillOval (-110 + i, 417, 10, 10); //left ear
		    c.fillOval (-80 + i, 417, 10, 10); //right ear
		    c.fillOval (-110 + i, 444, 40, 50); //body
		    c.setColor (foxOrange);
		    c.fillRoundRect (-103 + i, 479, 10, 20, 10, 10); //left leg
		    c.fillRoundRect (-87 + i, 479, 10, 20, 10, 10); //right leg
		    c.fillRect (-110 + i, 424, 40, 15); //face
		    c.fillPolygon (foxBodyX, foxBodyY, 3);
		}
		synchronized (c)
		{
		    c.setColor (Color.white);
		    c.fillArc (-74 + i, 434, 18, 20, 0, 180); //tail tip
		    c.fillRect (-118 + i, 382, 110, 30); //speech bubble
		    c.drawLine (-118 + i, 422, -118 + i, 408);
		    c.drawLine (-118 + i, 422, -117 + i, 408);
		    c.drawLine (-118 + i, 422, -116 + i, 408);
		    c.drawLine (-118 + i, 422, -115 + i, 408);
		    c.drawLine (-118 + i, 422, -114 + i, 408);
		}
		synchronized (c)
		{
		    c.setColor (Color.black);
		    c.drawLine (-74 + i, 444, -55 + i, 444); //line separating tail tip and rest of tail
		    c.fillOval (-104 + i, 434, 5, 5); //left eye
		    c.fillOval (-82 + i, 434, 5, 5); //right eye
		    c.fillOval (-93 + i, 454, 7, 7); //nose
		    c.drawString ("They're cutting down", -116 + i, 396); //text
		    c.drawString ("all the trees! Run!!", -116 + i, 406);
		}

		//used to delay animation
		try
		{
		    sleep (30);
		}
		catch (Exception e)
		{
		}
	    }
	}
    }


    public Fox (Console con, boolean left)
    {
	c = con;
	leftOrNot = left;
    }


    public void run ()
    {
	fox ();
    }
} //Fox class
