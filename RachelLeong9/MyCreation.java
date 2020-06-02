//Name: Rachel Leong
//Date: October 28, 2019
//Teacher: Ms. Krasteva
/*This class runs the other classes. A squirrel runs down from a tree stump. A monkey is in search of its tree and is very agitated because 
it can't seem to find it. It doesn't realize that it's actually reduced to a stump due to deforestation. A family of 3 bears come by and ask 
the monkey why it's so sad, the monkey explains its situation, but the bears can't do anything. The family of bears leave. A deer and a mouse
come by, and the monkey explains that he lost his tree. The deer tells him that it's right there, that it's now a stump. The mouse tells the 
monkey that this was due to deforestation and that it should find a new tree to live in. The deer and the mouse leave. A fox comes running in 
while bringing horrible news - the harvester is here and has started to cut down all of the trees! They both run away. The screen switches to 
a small paragraph about deforestation.
*/

//the "MyCreation" class
import java.awt.*;
import hsa.Console;

public class MyCreation
{
    Console c; // The output console

    //adds the Background thread to MyCreation
    public void background ()
    {
	Background b = new Background (c);
    }


    //adds the Squirrel thread to MyCreation
    public void squirrel ()
    {
	//creates the thread
	Squirrel s = new Squirrel (c);
	//starts the thread
	s.run ();
    }


    //adds the Bear thread to MyCreation
    public void bear ()
    {
	//creats the thread
	Bear g = new Bear (c);
	//starts the thread
	g.start ();
	Bear h = new Bear (c, 90);
	//starts the thread
	h.start ();
	Bear i = new Bear (c, 180, Color.yellow);
	//starts the thread
	i.start ();

	//joins with the Mouse thread so that it only executes when the Bear thread is done
	try
	{
	    i.join ();
	}
	catch (InterruptedException e)
	{
	}
    }


    //adds the Mouse thread to MyCreation
    public void mouse ()
    {
	//creates the thread
	Mouse m = new Mouse (c);
	//starts the thread
	m.start ();

    }


    //adds the Deer thread to MyCreation
    public void deer ()
    {
	//creates the thread
	Deer d = new Deer (c);
	//starts the thread
	d.start ();

	//joins with Fox thread so that it only executes when the Deer thread is done
	try
	{
	    d.join ();
	}
	catch (InterruptedException e)
	{
	}
    }


    //adds the Fox thread to MyCreation; takes a boolean parameter to determine if the Monkey thread should be joined to this one
    public void fox (boolean left)
    {
	//creates the thread
	Fox f = new Fox (c, left);
	//starts the thread
	f.start ();
	//executes if the fox isn't moving to the left
	if (!left)
	{
	    //joins with Monkey thread so that it only executes when Fox thread is done
	    try
	    {
		f.join ();
	    }
	    catch (InterruptedException e)
	    {
	    }
	}
    }


    //adds Monkey thread to MyCreation
    public void monkey ()
    {
	//creates the thread
	Monkey m = new Monkey (c);
	//starts the thread
	m.start ();

	//joins with the Background2 thread so that it only executes when the Monkey thread is done
	try
	{
	    m.join ();
	}
	catch (InterruptedException e)
	{
	}
    }


    //adds Background2 thread to MyCreation
    public void background2 ()
    {
	Background2 a = new Background2 (c);
    }


    //creates a new window and gives window a title
    public MyCreation ()
    {
	c = new Console ("Deforestation");
    }


    public static void main (String[] args)
    {
	MyCreation z = new MyCreation ();
	z.background ();
	z.squirrel ();
	z.bear ();
	z.mouse ();
	z.deer ();
	z.fox (false);
	z.fox (true);
	z.monkey ();
	z.background2 ();
    } //main method
} // MyCreation class

