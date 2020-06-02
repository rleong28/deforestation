//Name: Rachel Leong
//Date: October 28, 2019
//Teacher: Ms. Krasteva
//This class amimates the squirrel entering and leaving the screen.

//the "Squirrel" class
import java.awt.*;
import hsa.Console;
import java.lang.*; //to access Thread class

public class Squirrel implements Runnable
{
    private Console c; //the output console

    public void squirrel ()
    {
	//local colour variable for the forest floor
	Color lightBrown = new Color (166, 117, 53);
	//local colour variables for the squirrel
	Color squirrelBrown = new Color (176, 90, 11);
	Color squirrelBeige = new Color (245, 175, 95);
	Color squirrelDarkBeige = new Color (209, 134, 48);

	//loop used to animate the squirrel moving to the left
	for (int i = 0 ; i <= 50 ; i++)
	{
	    //erase
	    c.setColor (lightBrown);
	    c.fillRect (290 - i, 380, 60, 80);

	    //draw squirrel
	    synchronized (c)  //learned from: https://docs.google.com/document/d/1mgR09oneNIJhgefgkHK2vpaSQ5gZ8xDqB7rtPDQ7YHM/edit By: Andy Pham
	    {
		c.setColor (squirrelBrown);
		c.fillOval (317 - i, 390, 30, 55); //tail
		c.setColor (squirrelDarkBeige);
		c.fillOval (297 - i, 405, 15, 15); //left ear
		c.fillOval (327 - i, 405, 15, 15); //right ear
		c.fillRect (312 - i, 425, 15, 30); //body
	    }
	    synchronized (c)
	    {
		c.setColor (squirrelBeige);
		c.fillOval (302 - i, 410, 35, 30); //head
		c.setColor (squirrelBrown);
		c.fillArc (300 - i, 447, 20, 20, 0, 180); //left foot
		c.fillArc (320 - i, 447, 20, 20, 0, 180); //right foot
	    }
	    synchronized (c)
	    {
		c.setColor (Color.black);
		c.fillOval (312 - i, 420, 5, 5); //left eye
		c.fillOval (322 - i, 420, 5, 5); //right eye
		c.fillOval (318 - i, 430, 3, 3); //nose
		c.drawLine (319 - i, 433, 319 - i, 435); //mouth
		c.drawLine (318 - i, 435, 320 - i, 435);
	    }

	    //used to delay animation
	    try
	    {
		Thread.sleep (20);
	    }
	    catch (Exception e)
	    {
	    }
	}

	//loop used to animate the squirrel moving down
	for (int i = 0 ; i <= 30 ; i++)
	{
	    //erase
	    c.setColor (lightBrown);
	    c.fillRect (240, 380 + i, 60, 80);

	    //draw squirrel
	    synchronized (c)
	    {
		c.setColor (squirrelBrown);
		c.fillOval (267, 390 + i, 30, 55); //tail
		c.setColor (squirrelDarkBeige);
		c.fillOval (247, 405 + i, 15, 15); //left ear
		c.fillOval (277, 405 + i, 15, 15); //right ear
		c.fillRect (262, 425 + i, 15, 30); //body
	    }
	    synchronized (c)
	    {
		c.setColor (squirrelBeige);
		c.fillOval (252, 410 + i, 35, 30); //head
		c.setColor (squirrelBrown);
		c.fillArc (250, 447 + i, 20, 20, 0, 180); //left foot
		c.fillArc (270, 447 + i, 20, 20, 0, 180); //right foot
	    }
	    synchronized (c)
	    {
		c.setColor (Color.black);
		c.fillOval (262, 420 + i, 5, 5); //left eye
		c.fillOval (272, 420 + i, 5, 5); //right eye
		c.fillOval (268, 430 + i, 3, 3); //nose
	    }

	    //used to delay animation
	    try
	    {
		Thread.sleep (10);
	    }
	    catch (Exception e)
	    {
	    }
	}

	//loop used to animate the squirrel moving to the left
	for (int i = 0 ; i <= 300 ; i++)
	{
	    //erase
	    c.setColor (lightBrown);
	    c.fillRect (240 - i, 410, 60, 80);

	    //draw squirrel
	    synchronized (c)
	    {
		c.setColor (squirrelBrown);
		c.fillOval (267 - i, 420, 30, 55); //tail
		c.setColor (squirrelDarkBeige);
		c.fillOval (247 - i, 435, 15, 15); //left ear
		c.fillOval (277 - i, 435, 15, 15); //right ear
		c.fillRect (262 - i, 455, 15, 30); //body
	    }
	    synchronized (c)
	    {
		c.setColor (squirrelBeige);
		c.fillOval (252 - i, 440, 35, 30); //head
		c.setColor (squirrelBrown);
		c.fillArc (250 - i, 477, 20, 20, 0, 180); //left foot
		c.fillArc (270 - i, 477, 20, 20, 0, 180); //right foot
	    }
	    synchronized (c)
	    {
		c.setColor (Color.black);
		c.fillOval (262 - i, 450, 5, 5); //left eye
		c.fillOval (272 - i, 450, 5, 5); //right eye
		c.fillOval (268 - i, 460, 3, 3); //nose
		c.drawLine (269 - i, 463, 269 - i, 465); //mouth
		c.drawLine (268 - i, 465, 270 - i, 465);
	    }

	    //used to delay the animation
	    try
	    {
		Thread.sleep (20);
	    }
	    catch (Exception e)
	    {
	    }
	}
    }


    public Squirrel (Console con)
    {
	c = con;
    }


    public void run ()
    {
	squirrel ();
    }
} //Squirrel class
