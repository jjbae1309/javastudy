package dad02.swing04.form;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.JTextField;

public class AddressBookPanel extends JPanel {
	private JLabel jLabel_Name = new JLabel("이름");
	private JTextField jTextField_Name = new JTextField();
	private JLabel jLabel_Age = new JLabel("나이");
	private JSpinner jSpinner_Age = new JSpinner();
	private JLabel jLabel_Gen = new JLabel("성별");
	private JRadioButton jRadioButton_Man = new JRadioButton("남");
	private JRadioButton jRadioButton_Woman = new JRadioButton("여");
	private JPanel jPanel_Gen = new JPanel();
	private JPanel jPanel_Ssn = new JPanel();
	public AddressBookPanel() {
		initComponent();
	}
	
	private void initComponent() {
		this.setLayout(new GridBagLayout());
		
		jLabel_Name.setPreferredSize(new Dimension(100, 22));
		
		this.add(jLabel_Name, 
				new GridBagConstraints(
						0, 0, 1, 1,
						0.0, 0.0, 
						GridBagConstraints.CENTER, GridBagConstraints.BOTH, 
						new Insets(5, 5, 5, 5), 
						0, 0));
		
		this.add(jTextField_Name, 
				new GridBagConstraints(
						1, 0, 1, 1,
						1.0, 0.0, 
						GridBagConstraints.CENTER, GridBagConstraints.BOTH, 
						new Insets(5, 0, 5, 5), 
						0, 0));
		
		this.add(jLabel_Age, 
				new GridBagConstraints(
						0, 1, 1, 1,
						0.0, 0.0, 
						GridBagConstraints.CENTER, GridBagConstraints.BOTH, 
						new Insets(0, 5, 5, 5), 
						0, 0));
		
		this.add(jSpinner_Age,
				new GridBagConstraints(
						1, 1, 1, 1,
						1.0, 0.0, 
						GridBagConstraints.CENTER, GridBagConstraints.BOTH, 
						new Insets(0, 0, 5, 5), 
						0, 0));
		
		this.add(jLabel_Gen, 
				new GridBagConstraints(
						0, 2, 1, 1,
						0.0, 0.0, 
						GridBagConstraints.CENTER, GridBagConstraints.BOTH, 
						new Insets(0, 5, 5, 5), 
						0, 0));
		
		this.add(jRadioButton_Man,
				new GridBagConstraints(
						1, 2, 1, 1,
						1.0, 0.0, 
						GridBagConstraints.CENTER, GridBagConstraints.BOTH, 
						new Insets(0, 0, 5, 5), 
						0, 0));
		
		this.add(jRadioButton_Woman,
				new GridBagConstraints(
						1, 3, 1, 1,
						1.0, 0.0, 
						GridBagConstraints.CENTER, GridBagConstraints.BOTH, 
						new Insets(0, 0, 5, 5), 
						0, 0));
		
		this.add(jPanel_Ssn,
				new GridBagConstraints(
						1, 4, 1, 1,
						1.0, 0.0, 
						GridBagConstraints.CENTER, GridBagConstraints.BOTH,
						new Insets(0, 0, 5, 5),
						0, 0));
		}
		
		
		
	}

