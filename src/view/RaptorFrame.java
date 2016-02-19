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
		basePanel = new RaptorPanel(baseController);
		setupFrame();
	}
	
	public void setupFrame()
	{
		this.setContentPane(basePanel);
		this.setSize(600, 600);
		this.setTitle("Raptor");
		this.setResizable(true);
		this.setVisible(true);
	}

	public TwoDController getBaseController()
	{
		return baseController;
	}

	public void setBaseController(TwoDController baseController)
	{
		this.baseController = baseController;
	}

	public RaptorPanel getBasePanel()
	{
		return basePanel;
	}

	public void setBasePanel(RaptorPanel basePanel)
	{
		this.basePanel = basePanel;
	}
	
}
