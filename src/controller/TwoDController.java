package controller;

import java.awt.Color;
import model.Raptor;
import view.RaptorFrame;

public class TwoDController
{
	private RaptorFrame baseFrame;
	private Raptor [][] myRaptors;
	
	public TwoDController()
	{
		myRaptors = new Raptor [3][3];
		setupArray();
		baseFrame = new RaptorFrame(this);
	}
	
	public void start()
	{
		
	}
	
	private void setupArray()
	{
		for(int row = 0; row < myRaptors.length; row++)
		{
			for(int col = 0; col < myRaptors[0].length; col++)
			{
				myRaptors[row][col] = new Raptor();
				if(col % 2 == 0)
				{
					myRaptors[row][col].setRaptorColor(Color.GREEN);
				}
				else
				{
					myRaptors[row][col].setFeathers(false);
				}
			}
		}
	}
	
	public Raptor [][] getMyRaptors()
	{
		return myRaptors;
	}
}
