package view;

import javax.swing.JFrame;
import view.RaptorPanel;
import controller.TwoDController;

public class RaptorFrame extends JFrame
{
	private TwoDController baseController;
	private RaptorPanel basePanel;
	
	public RaptorFrame(TwoDController baseController)
	{
		this.baseController = baseController;
	}
}
