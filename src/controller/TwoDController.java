package controller;

import java.awt.Color;
import model.Raptor;

public class TwoDController
{
	private TwoDFrame baseFrame;
	private Raptor [][] myRaptors;
	
	public TwoDController()
	{
		myRaptors = new Raptor [3][3];
		baseFrame = new TwoDFrame(this);
	}
	
	public void start()
	{
		setupArray();
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
}
