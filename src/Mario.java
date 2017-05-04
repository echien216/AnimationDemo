

import java.awt.*;
import javax.swing.*;
import java.awt.image.*;
import java.util.*;

public class Mario extends MovingImage 
{	
	public static final int MARIO_WIDTH = 40;
	public static final int MARIO_HEIGHT = 60;
	
	private double vx, vy;
	
	public Mario(int x, int y) 
	{
		super("mario.png", x, y, MARIO_WIDTH, MARIO_HEIGHT);
		vx = 0;
		vy = 0;
	}

	// METHODS
	public void walk(int dir) 
	{
		x += dir * 10;
	}

	public void jump() 
	{
		// JUMP!
	}

	public void act(ArrayList<Shape> obstacles) 
	{
		vy += 0.5;
		super.y += vy;
	}


}
