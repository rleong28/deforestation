//Name: Rachel Leong
//Date: October 28, 2019
//Teacher: Ms. Krasteva
//This class draws the ending screen.

//the "Background2" class
import java.awt.*;
import hsa.Console;
import java.lang.*; //to access Thread class

public class Background2
{
    private Console c; //the output console

    //method to draw the background
    public void draw ()
    {
	//local colour variable for the background
	Color green = new Color (166, 245, 193);
	//local font variable for the title
	Font title = new Font ("Serif", Font.BOLD, 30);
	//local font variable for the text
	Font text = new Font ("Serif", Font.PLAIN, 15);

	//loop to create the background colour
	c.setColor (green);
	for (int i = 0 ; i < 320 ; i++)
	{
	    c.drawRect (i, i, 640 - (i * 2), 500 - (i * 2));
	}

	//displays a paragraph about deforestation
	c.setFont (title);
	c.setColor (Color.black);
	c.drawString ("MY CREATION", 215, 100);
	c.drawString ("Deforestation", 240, 150);
	c.setFont (text);
	c.drawString ("Almost half of all of the world's forests have been cleared, and the Earth", 100, 210);
	c.drawString ("loses 18.7 million of acres of forest every year. At this rate, we may lose", 100, 230);
	c.drawString ("our rainforests in as little as 100 years, and deforestation is steadily", 100, 250);
	c.drawString ("contributing to this. About 70% of the world's plants and animals live in", 100, 270);
	c.drawString ("forests and they're all losing their habitats due to deforestation. We need", 100, 290);
	c.drawString ("to be more aware of this imminent threat to our environment and start", 100, 310);
	c.drawString ("to take precautionary measures against it.", 100, 330);

	//displays my name
	c.drawString ("By: Rachel Leong", 270, 400);
    }


    public Background2 (Console con)
    {
	c = con;
	draw ();
    }
} //Background2 class
