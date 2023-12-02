package com.jjbae.app.chart;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ChartPanel extends JPanel {
	
	private JPanel jPanel_ChartTop = new JPanel();
	private JPanel jPanel_ChartMiddle = new JPanel();
	private JPanel jPanel_ChartGraph = new JPanel();
	private JPanel jPanel_ChartBottom =  new JPanel();
	
	// Top
	private JLabel jLabel_Name = new JLabel("UBMI");
	private JLabel jLabel_MarketProfile = new JLabel("Upbit Market Index");
	private JLabel jLabel_Price = new JLabel("7.480.20");
	private JLabel jLabel_Rate = new JLabel("^ 45.69 0.61%");
	private JLabel jLabel_Date = new JLabel("2023.11.05");
	private JLabel jLabel_DetailDate = new JLabel("11:55 AM, KST");
	
	// Middle
	private JLabel jLabel_MiddleDate = new JLabel("기간");
	private JButton jButton_Day = new JButton("1일");
	private JButton jButton_Week = new JButton("1주");
	private JButton jButton_Month = new JButton("1개월");
	
	// Graph
	private JButton jButton_Graph = new JButton();
	
	// Bottom
	private JButton jButton_Buy = new JButton("upbit Market Index Methodology Book");
	
	// Layout
	private GridBagLayout gridBagLayout = new GridBagLayout();
	
	public ChartPanel() {
		initLayout();
		initPrefferedSize();
		initComponent();
	}
	
	private void initLayout() {
		this.setLayout(gridBagLayout);
		jPanel_ChartTop.setLayout(gridBagLayout);
		jPanel_ChartMiddle.setLayout(gridBagLayout);
		jPanel_ChartGraph.setLayout(gridBagLayout);
		jPanel_ChartBottom.setLayout(gridBagLayout);
	}
	
	private void initPrefferedSize() {
		jButton_Graph.setIcon(new ImageIcon("data/images/chart.jpg"));
		jButton_Graph.setPreferredSize(new Dimension(500, 500));
	}
	
	private void initComponent() {
		jLabel_DetailDate.setFont(new Font("DialogInput", getFont().BOLD, 20));
		jLabel_DetailDate.setForeground(Color.gray);
		jLabel_Rate.setForeground(Color.red);
		
		this.add(jPanel_ChartTop, new GridBagConstraints(
				0, 0, 1, 1,
				1.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 0, 0),
				0, 0));
		
		this.add(jPanel_ChartMiddle, new GridBagConstraints(
				0, 1, 1, 1,
				1.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 0, 0),
				0, 0));
		
		this.add(jPanel_ChartGraph, new GridBagConstraints(
				0, 2, 1, 1,
				1.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 0, 0),
				0, 0));
	
		this.add(jPanel_ChartBottom, new GridBagConstraints(
				0, 3, 1, 1,
				0.0, 0.0, 
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 0, 0),
				0, 0));
		
		jPanel_ChartTop.add(jLabel_Name, new GridBagConstraints(
				0, 0, 1, 1,
				0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(5, 5, 5, 5),
				0, 0));
		
		jPanel_ChartTop.add(jLabel_MarketProfile, new GridBagConstraints(
				1, 0, 1, 1,
				0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(5, 0, 5, 5),
				0, 0));
		
		jPanel_ChartTop.add(jLabel_Price, new GridBagConstraints(
				0, 1, 1, 1,
				0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 5, 5, 5),
				0, 0));
		
		jPanel_ChartTop.add(jLabel_Rate, new GridBagConstraints(
				1, 1, 1, 1,
				0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5),
				0, 0));
		
		jPanel_ChartTop.add(jLabel_Date, new GridBagConstraints(
				0, 2, 1, 1,
				0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 5, 5, 5),
				0, 0));
		
		jPanel_ChartTop.add(jLabel_DetailDate, new GridBagConstraints(
				1, 2, 1, 1,
				1.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5),
				0, 0));
		
		jPanel_ChartMiddle.add(jLabel_MiddleDate, new GridBagConstraints(
				0, 0, 1, 1,
				1.0, 0.0,
				GridBagConstraints.EAST, GridBagConstraints.VERTICAL,
				new Insets(5, 5, 5, 5),
				0, 0));
		
		jPanel_ChartMiddle.add(jButton_Day, new GridBagConstraints(
				1, 0, 1, 1,
				0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(5, 0, 5, 0),
				0, 0));
		
		jPanel_ChartMiddle.add(jButton_Week, new GridBagConstraints(
				2, 0, 1, 1,
				0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(5, 0, 5, 0),
				0, 0));
		
		jPanel_ChartMiddle.add(jButton_Month, new GridBagConstraints(
				3, 0, 1, 1,
				0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(5, 0, 5, 5),
				0, 0));
		
		jPanel_ChartGraph.add(jButton_Graph, new GridBagConstraints(
				0, 0, 1, 1,
				1.0, 1.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 0, 0),
				0, 0));
		
		jPanel_ChartBottom.add(jButton_Buy, new GridBagConstraints(
				0, 0, 1, 1,
				1.0, 1.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 0, 0),
				0, 0));
		
	}
}
