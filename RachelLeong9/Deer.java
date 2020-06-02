//Name: Rachel Leong
//Date: October 28, 2019
//Teacher: Ms. Krasteva
//This class animates the deer entering and leaving the screen.

//the "Deer" class
import java.awt.*;
import hsa.Console;
import java.lang.*; //to access Thread class

public class Deer extends Thread
{
    private Console c; //the output console

    public void deer ()
    {
	//local colour variable for the forest floor
	Color lightBrown = new Color (166, 117, 53);
	//local colour variables for the deer
	Color deerBrown = new Color (209, 124, 44);
	Color deerLightBrown = new Color (209, 185, 117);

	//loop used to animate the deer moving to the right
	for (int i = 0 ; i < 240 ; i++)
	{
	    //erase
	    c.setColor (lightBrown);
	    c.fillRect (-100 + i, 380, 100, 120);

	    //draw deer
	    synchronized (c) //learned from: https://docs.google.com/document/d/1mgR09oneNIJhgefgkHK2vpaSQ5gZ8xDqB7rtPDQ7YHM/edit By: Andy Pham
	    {
		c.setColor (deerLightBrown);
		c.fillRect (-26 + i, 447, 15, 15); //neck
		c.fillRect (-75 + i, 485, 10, 13); //left leg
		c.fillRect (-15 + i, 485, 10, 13); //right leg
		c.fillOval (-26 + i, 420, 5, 10); //left ear
		c.fillOval (-6 + i, 420, 5, 10); //right ear
	    }
	    synchronized (c)
	    {
		c.setColor (deerBrown);
		c.fillOval (-26 + i, 424, 25, 30); //face
		c.fillRoundRect (-75 + i, 460, 70, 25, 10, 10); //body
		c.setColor (Color.white);
		c.fillRect (-75 + i, 395, 60, 25); //speech bubble
		c.drawLine (-75 + i, 420, -75 + i, 430);
		c.drawLine (-74 + i, 420, -75 + i, 430);
		c.drawLine (-73 + i, 420, -75 + i, 430);
		c.drawLine (-72 + i, 420, -75 + i, 430);
		c.drawLine (-71 + i, 420, -75 + i, 430);
	    }
	    synchronized (c)
	    {
		c.setColor (Color.black);
		c.drawLine (-73 + i, 462, -78 + i, 458); //tail
		c.fillOval (-21 + i, 433, 5, 5); //left eye
		c.fillOval (-12 + i, 433, 5, 5); //right eye
		c.fillOval (-17 + i, 439, 7, 7); //nose
		c.drawLine (-14 + i, 445, -17 + i, 447); //mouth
		c.drawLine (-14 + i, 445, -11 + i, 447);
		c.drawString ("Oh no, he", -73 + i, 407); //text
		c.drawString ("lost his tree.", -73 + i, 417);
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

	//loop used to animate the deer moving to the left
	for (int i = 240 ; i > -40 ; i--)
	{
	    //erase
	    c.setColor (lightBrown);
	    c.fillRect (-100 + i, 380, 160, 120);

	    //draw deer
	    synchronized (c)
	    {
		c.setColor (deerLightBrown);
		c.fillRect (-26 + i, 447, 15, 15); //neck
		c.fillRect (-75 + i, 485, 10, 13); //left leg
		c.fillRect (-15 + i, 485, 10, 13); //right leg
		c.fillOval (-26 + i, 420, 5, 10); //left ear
		c.fillOval (-6 + i, 420, 5, 10); //right ear
	    }
	    synchronized (c)
	    {
		c.setColor (deerBrown);
		c.fillOval (-26 + i, 424, 25, 30); //face
		c.fillRoundRect (-75 + i, 460, 70, 25, 10, 10); //body
		c.setColor (Color.white);
		c.fillRect (-75 + i, 385, 110, 35); //speech bubble
		c.drawLine (-75 + i, 420, -75 + i, 430);
		c.drawLine (-74 + i, 420, -75 + i, 430);
		c.drawLine (-73 + i, 420, -75 + i, 430);
		c.drawLine (-72 + i, 420, -75 + i, 430);
		c.drawLine (-71 + i, 420, -75 + i, 430);
	    }
	    synchronized (c)
	    {
		c.setColor (Color.black);
		c.drawLine (-73 + i, 462, -78 + i, 458); //tail
		c.fillOval (-21 + i, 433, 5, 5); //left eye
		c.fillOval (-12 + i, 433, 5, 5); //right eye
		c.fillOval (-17 + i, 439, 7, 7); //nose
		c.drawLine (-14 + i, 445, -17 + i, 447); //mouth
		c.drawLine (-14 + i, 445, -11 + i, 447);
		c.drawString ("I didn't know", -73 + i, 397); //text
		c.drawString ("deforestation affected", -73 + i, 407);
		c.drawString ("our habitat this much...", -73 + i, 417);
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


    public Deer (Console con)
    {
	c = con;
    }


    public void run ()
    {
	deer ();
    }
} //Deer class


