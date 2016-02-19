package view;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import controller.TwoDController;

public class RaptorPanel extends JPanel
{
	private TwoDController baseController;
	private SpringLayout baseLayout;
	private JTextField rowField;
	private JTextField columnField;
	private JLabel currentRaptorLabel;
	private JTextField editField;
	private JButton changeButton;
	private JButton displayButton;
	private JTable raptorTable;
	
	public RaptorPanel(TwoDController baseController)
	{
		this.baseController = baseController;
		baseLayout = new SpringLayout();
		rowField = new JTextField(5);
		columnField = new JTextField(5);
		editField = new JTextField(20);
		currentRaptorLabel = new JLabel("The current Raptor");
		changeButton = new JButton("Change the indicated Raptor");
		displayButton = new JButton("Display the indicated Raptor");
		
		
		
		setupTable();
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	/**
	 * Helper method to load information from the Model into the GUI as a 2D array.
	 */
	private void setupTable()
	{
		String [] columnHeaders = {"Column 0", "Column 1", "Column 2"};
		DefaultTableModel tableModel = new DefaultTableModel(baseController.getMyRaptors(), columnHeaders);
		raptorTable = new JTable(tableModel);
		
	}
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.add(raptorTable);
		this.add(currentRaptorLabel);
		this.add(columnField);
		this.add(rowField);
		this.add(editField);
		this.add(displayButton);
		this.add(changeButton);
		
	}
	
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.WEST, columnField, 10, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, rowField, -6, SpringLayout.NORTH, columnField);
		baseLayout.putConstraint(SpringLayout.EAST, rowField, 0, SpringLayout.EAST, columnField);
		baseLayout.putConstraint(SpringLayout.SOUTH, columnField, -6, SpringLayout.NORTH, editField);
		baseLayout.putConstraint(SpringLayout.WEST, editField, 10, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, editField, -10, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, changeButton, 10, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, changeButton, -6, SpringLayout.NORTH, rowField);
		baseLayout.putConstraint(SpringLayout.SOUTH, displayButton, -6, SpringLayout.NORTH, changeButton);
		baseLayout.putConstraint(SpringLayout.EAST, displayButton, 0, SpringLayout.EAST, changeButton);
		baseLayout.putConstraint(SpringLayout.NORTH, currentRaptorLabel, 6, SpringLayout.SOUTH, raptorTable);
		baseLayout.putConstraint(SpringLayout.WEST, currentRaptorLabel, 10, SpringLayout.WEST, raptorTable);
	}
	
	private void setupListeners()
	{
		
	}
}
