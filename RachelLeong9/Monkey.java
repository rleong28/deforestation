//Name: Rachel Leong
//Date: October 28, 2019
//Teacher: Ms. Krasteva
//This class amimates the monkey leaving the screen.

//the "Monkey" class
import java.awt.*;
import hsa.Console;
import java.lang.*; //to access Thread class

public class Monkey extends Thread
{
    private Console c; //the output console

    public void monkey ()
    {
	//local colour variable for the forest floor
	Color lightBrown = new Color (166, 117, 53);
	//local colour variables for the monkey
	Color monkeyBeige = new Color (255, 188, 125);
	Color monkeyBrown = new Color (145, 48, 0);

	//loop used to animate the monkey moving to the right
	for (int i = 0 ; i < 250 ; i++)
	{
	    //erase
	    c.setColor (lightBrown);
	    c.fillRect (405, 385, 170, 115);
	    c.fillRect (405 + i, 385, 150, 115);

	    //draw monkey
	    synchronized (c)  //learned from: https://docs.google.com/document/d/1mgR09oneNIJhgefgkHK2vpaSQ5gZ8xDqB7rtPDQ7YHM/edit By: Andy Pham
	    {
		c.setColor (monkeyBrown);
		c.fillOval (420 + i, 425, 30, 50); //body
		c.fillOval (420 + i, 400, 30, 30); //head
		c.fillOval (415 + i, 400, 10, 10); //left ear
		c.fillOval (445 + i, 400, 10, 10); //right ear
		c.fillRect (450 + i, 437, 13, 7);  //right arm
		c.fillRect (457 + i, 437, 7, 20);
		c.fillRect (407 + i, 437, 13, 7);  //left arm
		c.fillRect (407 + i, 437, 7, 20);
		c.fillRoundRect (420 + i, 467, 12, 30, 10, 10); //left leg
		c.fillRoundRect (438 + i, 467, 12, 30, 10, 10); //right leg
	    }
	    synchronized (c)
	    {
		c.setColor (monkeyBeige);
		c.fillOval (420 + i, 405, 30, 25);    //face
		c.fillOval (427 + i, 435, 16, 30);   //inner body
		c.setColor (Color.black);
		c.fillOval (428 + i, 415, 4, 4);    //left eye
		c.fillOval (438 + i, 415, 4, 4);  //right eye
		c.fillOval (434 + i, 420, 2, 2);  //nose
		c.drawLine (430 + i, 425, 440 + i, 425); //mouth
	    }
	    synchronized (c)
	    {
		//speech bubble
		c.setColor (Color.white);
		c.fillRect (470 + i, 388, 80, 40);
		c.drawLine (460 + i, 427, 470 + i, 427);
		c.drawLine (460 + i, 427, 470 + i, 426);
		c.drawLine (460 + i, 427, 470 + i, 425);
		c.drawLine (460 + i, 427, 470 + i, 424);
		c.drawLine (460 + i, 427, 470 + i, 423);
	    }
	    synchronized (c)
	    {
		//text
		c.setColor (Color.black);
		c.drawString ("Oh no! I guess", 472 + i, 400);
		c.drawString ("I have to leave", 472 + i, 410);
		c.drawString ("my home...", 472 + i, 420);
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


    public Monkey (Console con)
    {
	c = con;
    }


    public void run ()
    {
	monkey ();
    }
} //Monkey class
