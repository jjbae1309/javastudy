package dad02.swing02;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class SwingPanel extends JPanel {
	private JScrollPane jScrollPane_Contents = new JScrollPane();
	private JTextArea jTextArea_Contents = new JTextArea();
	
	private JLabel jLabel_Name = new JLabel("이름");
	private JTextField jTextField_Name = new JTextField();
	
	private JLabel jLabel_Ssn = new JLabel("주민등록번호");
	private JTextField jTextField_Ssn = new JTextField();
	
	private JLabel jLabel_Gender = new JLabel("성별");
	private JRadioButton jRadioButton_Man = new JRadioButton("남");
	private JRadioButton jRadioButton_Woman = new JRadioButton("여");
	
	private ButtonGroup buttonGroup_Gender = new ButtonGroup();
	
	private JLabel jLabel_Location = new JLabel("지역");
	private JComboBox jComboBox_Location = new JComboBox(new String[] {"서울", "경기"});
	
	private JButton jButton_Confirm = new JButton("확인");
	private JButton jButton_Cancel = new JButton("취소");
	
	public SwingPanel() {
		initComponent();
	}
	
	private void initComponent() {
		this.setLayout(new GridBagLayout());
		
		jTextField_Name.setPreferredSize(new Dimension(120, 22));
		jTextField_Ssn.setPreferredSize(new Dimension(120, 22));
		
		this.add(jLabel_Name, new GridBagConstraints(
				0, 0, 1, 1,
				0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(5, 5, 5, 5),
				0, 0
				));
		
		this.add(jTextField_Name, new GridBagConstraints(
				1, 0, 1, 1,
				1.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(5, 5, 5, 5),
				0, 0
				));
		
		this.add(jLabel_Ssn, new GridBagConstraints(
				0, 1, 1, 1,
				0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(5, 5, 5, 5),
				0, 0
				));
		
		this.add(jTextField_Ssn, new GridBagConstraints(
				1, 1, 1, 1,
				1.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(5, 5, 5, 5),
				0, 0
				));
/*		
		jTextArea_Contents.setEditable(false);
		
		jScrollPane_Contents.setPreferredSize(new Dimension(400, 400));
		jTextArea_Contents.setPreferredSize(new Dimension(400, 400));
		
		for (int i = 0; i < 100; i++ ) {
			jTextArea_Contents.append("배재준이 입장했습니다.\n");
		}
		
		jTextField_Name.setPreferredSize(new Dimension(120, 22));
		jTextField_Ssn.setPreferredSize(new Dimension(120, 22));
		
		jButton_Confirm.setPreferredSize(new Dimension(80, 22));
		jButton_Cancel.setPreferredSize(new Dimension(80, 22));

		buttonGroup_Gender.add(jRadioButton_Man);
		buttonGroup_Gender.add(jRadioButton_Woman);
		
		this.add(jScrollPane_Contents);
		jScrollPane_Contents.getViewport().add(jTextArea_Contents);
		
		this.add(jLabel_Name);
		this.add(jTextField_Name);
		
		this.add(jLabel_Ssn);
		this.add(jTextField_Ssn);
		
		this.add(jLabel_Gender);
		this.add(jRadioButton_Man);
		this.add(jRadioButton_Woman);
		
		this.add(jLabel_Location);
		this.add(jComboBox_Location);
		
		this.add(jButton_Confirm);
		this.add(jButton_Cancel);
*/	
		
	}
}
