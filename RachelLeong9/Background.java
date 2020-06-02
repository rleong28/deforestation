//Name: Rachel Leong
//Date: October 28, 2019
//Teacher: Ms. Krasteva
//This class draws the background.

//the "Background" class
import java.awt.*;
import hsa.Console;
import java.lang.*; //to access Thread class

public class Background
{
    private Console c; //the output console

    //method to draw background
    public void draw ()
    {
	//local colour variable for the tree trunk
	Color darkBrown = new Color (115, 52, 18);
	//local colour variable for the forest floor
	Color lightBrown = new Color (166, 117, 53);
	//local colour variable for the leaves on the trees
	Color green = new Color (43, 138, 19);
	//local colour variable for the sky
	Color skyBlue = new Color (177, 240, 233);
	//local colour variable for the small rock
	Color darkGrey = new Color (142, 148, 147);
	//local colour variable for the large rock
	Color darkerGrey = new Color (73, 82, 76);
	//local colour variable for the clouds
	Color lightGrey = new Color (223, 237, 228);
	//local colour variable for the leaves on the trees
	Color lightGreen = new Color (129, 232, 60);
	//local colour variable for the monkey's features
	Color monkeyBeige = new Color (255, 188, 125);
	//local colour variable for the monkey
	Color monkeyBrown = new Color (145, 48, 0);
	//local colour variable for the sun
	Color yellow = new Color (255, 247, 18);
	//local colour variable for the berries
	Color red = new Color (201, 10, 26);

	//loop to create the sky
	c.setColor (skyBlue);
	for (int i = 0 ; i < 320 ; i++)
	{
	    c.drawRect (i, i, 640 - (i * 2), 440 - (i * 2));
	}

	//loop to create the clouds
	c.setColor (lightGrey);
	for (int i = 0 ; i <= 50 ; i++)
	{
	    c.drawRoundRect (100 + i, 30 + i, 100 - (i * 2), 70 - (i * 2), 20, 20);
	    c.drawRoundRect (380 + i, 50 + i, 100 - (i * 2), 70 - (i * 2), 20, 20);
	}

	//loop to create the clouds
	for (int i = 0 ; i <= 30 ; i++)
	{
	    c.drawRoundRect (180 + i, 40 + i, 60 - (i * 2), 40 - (i * 2), 20, 20);
	    c.drawRoundRect (360 + i, 40 + i, 60 - (i * 2), 40 - (i * 2), 20, 20);
	    c.drawRoundRect (70 + i, 70 + i, 70 - (i * 2), 40 - (i * 2), 20, 20);
	    c.drawRoundRect (430 + i, 90 + i, 80 - (i * 2), 40 - (i * 2), 20, 20);
	}

	//loop to create the ground
	c.setColor (lightBrown);
	for (int i = 0 ; i < 160 ; i++)
	{
	    c.drawRect (i, 380 + i, 640 - (i * 2), 120 - (i * 2));
	}

	//loop to create the tree leaves
	c.setColor (green);
	for (int i = 0 ; i <= 75 ; i++)
	{
	    c.drawOval (15 + i, 120 + i, 150 - (i * 2), 180 - (i * 2));
	    c.drawOval (255 + i, 120 + i, 150 - (i * 2), 180 - (i * 2));
	    c.drawOval (475 + i, 120 + i, 150 - (i * 2), 180 - (i * 2));
	}

	//loop to create the tree leaves
	c.setColor (lightGreen);
	for (int i = 0 ; i <= 75 ; i++)
	{
	    c.drawOval (135 + i, 100 + i, 150 - (i * 2), 180 - (i * 2));
	    c.drawOval (375 + i, 100 + i, 150 - (i * 2), 180 - (i * 2));
	}

	//loop to create the tree trunks
	c.setColor (darkBrown);
	for (int i = 0 ; i < 40 ; i++)
	{
	    c.drawLine (80 + (i / 2), 260, 70 + i, 380);
	    c.drawLine (200 + (i / 2), 240, 190 + i, 380);
	    c.drawLine (320 + (i / 2), 260, 310 + i, 380);
	    c.drawLine (440 + (i / 2), 240, 430 + i, 380);
	    c.drawLine (540 + (i / 2), 260, 530 + i, 380);
	}

	//loop to create the tree stump
	for (int i = 0 ; i < 30 ; i++)
	{
	    c.drawLine (313 + (i / 2), 460, 305 + i, 495);
	}

	//loop to create the big rock
	c.setColor (darkerGrey);
	for (int i = 0 ; i <= 29 ; i++)
	{
	    c.drawArc (30 + i, 340 + i, 60 - (i * 2), 80 - (i * 2), 0, 180);
	}

	//loop to create the small rock
	c.setColor (darkGrey);
	for (int i = 0 ; i <= 14 ; i++)
	{
	    c.drawArc (68 + i, 359 + i, 30 - (i * 2), 45 - (i * 2), 0, 180);
	}

	//loop to create the sun
	c.setColor (yellow);
	for (int i = 0 ; i <= 100 ; i++)
	{
	    c.drawOval (540 + i, -100 + i, 200 - (i * 2), 200 - (i * 2));
	}

	//loop to create the bush leaves
	c.setColor (green);
	for (int i = 0 ; i < 20 ; i++)
	{
	    c.drawOval (490 + i, 340 + i, 40 - (i * 2), 40 - (i * 2));
	    c.drawOval (510 + i, 325 + i, 40 - (i * 2), 40 - (i * 2));
	    c.drawOval (540 + i, 315 + i, 40 - (i * 2), 40 - (i * 2));
	    c.drawOval (570 + i, 325 + i, 40 - (i * 2), 40 - (i * 2));
	    c.drawOval (590 + i, 340 + i, 40 - (i * 2), 40 - (i * 2));
	    c.drawRect (510 + i, 350 + i, 100 - (i * 2), 30 - (i * 2));
	}

	//loop to create the bush berries
	c.setColor (red);
	for (int i = 0 ; i < 5 ; i++)
	{
	    c.drawOval (510 + i, 360 + i, 10 - (i * 2), 10 - (i * 2));
	    c.drawOval (530 + i, 340 + i, 10 - (i * 2), 10 - (i * 2));
	    c.drawOval (580 + i, 340 + i, 10 - (i * 2), 10 - (i * 2));
	    c.drawOval (560 + i, 360 + i, 10 - (i * 2), 10 - (i * 2));
	    c.drawOval (605 + i, 360 + i, 10 - (i * 2), 10 - (i * 2));
	}

	//loopa to create the monkey
	c.setColor (monkeyBrown);
	for (int i = 0 ; i < 30 ; i++)
	{
	    c.drawOval (420 + i, 425 + i, 30 - (i * 2), 50 - (i * 2)); //body
	    c.drawOval (420 + i, 400 + i, 30 - (i * 2), 30 - (i * 2)); //head
	    c.drawOval (415 + (i / 3), 400 + (i / 3), 10 - (i / 3 * 2), 10 - (i / 3 * 2)); //left ear
	    c.drawOval (445 + (i / 3), 400 + (i / 3), 10 - (i / 3 * 2), 10 - (i / 3 * 2)); //right ear
	    c.drawRect (450 + (i / 2), 437 + (i / 2), 13 - i, 7 - i); //right arm
	    c.drawRect (457 + (i / 2), 437 + (i / 2), 7 - i, 20 - i);
	    c.drawRect (407 + (i / 2), 437 + (i / 2), 13 - i, 7 - i); //left arm
	    c.drawRect (407 + (i / 2), 437 + (i / 2), 7 - i, 20 - i);
	    c.drawRoundRect (420 + (i / 3), 467 + i, 12 - (i / 3 * 2), 30 - (i * 2), 10, 10); //left leg
	    c.drawRoundRect (438 + (i / 3), 467 + i, 12 - (i / 3 * 2), 30 - (i * 2), 10, 10); //right leg
	}

	c.setColor (monkeyBeige);
	for (int i = 0 ; i < 30 ; i++)
	{
	    c.drawOval (420 + i, 405 + i, 30 - (i * 2), 25 - (i * 2)); //face
	    c.drawOval (427 + i, 435 + i, 16 - (i * 2), 30 - (i * 2)); //inner body
	}

	c.setColor (Color.black);
	for (int i = 0 ; i <= 2 ; i++)
	{
	    c.drawOval (428 + i, 415 + i, 4 - (i * 2), 4 - (i * 2)); //left eye
	    c.drawOval (438 + i, 415 + i, 4 - (i * 2), 4 - (i * 2)); //right eye
	    c.drawOval (434 + (i / 2), 420 + (i / 2), 2 - i, 2 - i); //nose
	}

	c.drawLine (430, 425, 440, 425); //mouth

	//loop to create the speech bubble
	c.setColor (Color.white);
	for (int i = 0 ; i < 43 ; i++)
	{
	    c.drawRect (470 + i, 388 + i, 85 - (i * 2), 32 - (i * 2));
	    c.drawLine (460, 420, 470, 420 - (i / 4));
	}

	//displays the text
	c.setColor (Color.black);
	c.drawString ("Where's my tree?", 472, 402);
	c.drawString ("I lost my home...", 472, 413);
    }


    public Background (Console con)
    {
	c = con;
	draw ();
    }
} //Background class
