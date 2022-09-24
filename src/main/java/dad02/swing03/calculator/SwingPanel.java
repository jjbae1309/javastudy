package dad02.swing03.calculator;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SwingPanel extends JPanel implements ActionListener {
	private JTextField jTextField_Result = new JTextField("0");
	
	private JButton jButton_Percent = new JButton("%");
	private JButton jButton_CE = new JButton("CE");
	private JButton jButton_C = new JButton("C");
	private JButton jButton_Back = new JButton("<X");
	
	private JButton jButton_1x = new JButton("1/x");
	private JButton jButton_x2 = new JButton("x2");
	private JButton jButton_2rootx = new JButton("2/x");
	
	private JButton jButton_Div = new JButton("/");
	private JButton jButton_Mul = new JButton("*");
	private JButton jButton_Add = new JButton("+");
	private JButton jButton_Sub = new JButton("-");
	
	private JButton jButton_1 = new JButton("1");
	private JButton jButton_2 = new JButton("2");
	private JButton jButton_3 = new JButton("3");
	private JButton jButton_4 = new JButton("4");
	private JButton jButton_5 = new JButton("5");
	private JButton jButton_6 = new JButton("6");
	private JButton jButton_7 = new JButton("7");
	private JButton jButton_8 = new JButton("8");
	private JButton jButton_9 = new JButton("9");
	private JButton jButton_0 = new JButton("0");
	
	private JButton jButton_Sign = new JButton("+/-");
	private JButton jButton_Point = new JButton(".");
	private JButton jButton_Equal = new JButton("=");
	
	private JPanel jPanel_Button = new JPanel();
	
	// +�� ���� ����� �Ͼ������ �Էµ� ���ڸ� ��� ����
	private String prevText;
	// �������� ����� �����ϴ� ����
	private long saveNum;
	
	public SwingPanel() {
		initComponent();
		initEvent();
	}
	
	private void initComponent() {
		this.setLayout(new BorderLayout());
		
		this.add(jTextField_Result, BorderLayout.NORTH);
		this.add(jPanel_Button, BorderLayout.CENTER);
		
		/* GridLayout */
		jPanel_Button.setLayout(new GridLayout(6, 4));

		jPanel_Button.add(jButton_Percent);
		jPanel_Button.add(jButton_CE);
		jPanel_Button.add(jButton_C);
		jPanel_Button.add(jButton_Back);
		
		jPanel_Button.add(jButton_1x);
		jPanel_Button.add(jButton_x2);
		jPanel_Button.add(jButton_2rootx);
		jPanel_Button.add(jButton_Div);
		
		jPanel_Button.add(jButton_7);
		jPanel_Button.add(jButton_8);
		jPanel_Button.add(jButton_9);
		jPanel_Button.add(jButton_Mul);
		
		jPanel_Button.add(jButton_4);
		jPanel_Button.add(jButton_5);
		jPanel_Button.add(jButton_6);
		jPanel_Button.add(jButton_Sub);
		
		jPanel_Button.add(jButton_1);
		jPanel_Button.add(jButton_2);
		jPanel_Button.add(jButton_3);
		jPanel_Button.add(jButton_Add);
		
		jPanel_Button.add(jButton_Sign);
		jPanel_Button.add(jButton_0);
		jPanel_Button.add(jButton_Point);
		jPanel_Button.add(jButton_Equal);
	}
	
	private void initEvent() {
		/*
		jButton_1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		});
		*/
	
		//jButton_1.addActionListener(new jButton1ActionListener());
		
		jButton_1.addActionListener(this);
		jButton_2.addActionListener(this);
		jButton_3.addActionListener(this);
		jButton_4.addActionListener(this);
		jButton_5.addActionListener(this);
		jButton_6.addActionListener(this);
		jButton_7.addActionListener(this);
		jButton_8.addActionListener(this);
		jButton_9.addActionListener(this);
		jButton_0.addActionListener(this);
		
		jButton_Add.addActionListener(this);
		jButton_C.addActionListener(this);
	}
	
	/**
	 * Action�� �߻����� �� ȣ���� �Ǵ� �޼ҵ�
	 */
	public void actionPerformed(ActionEvent e) {
		// ActionEvent�� ��𼭺���(source) ȣ���� �Ǿ��°�?
		Object o = e.getSource();
		
		// ������ jTextField_Result�� ���� �����´�.
		long prevNum = 0;
		if (prevText != null) 
			prevNum = Long.parseLong(prevText);
		
		if (o == jButton_0) {	// sourcr�� jButton_0�̳�?
			if (prevNum != 0) {
				jTextField_Result.setText(prevText + "0");
			}
			
			prevText = jTextField_Result.getText();
		}
		else if (o == jButton_1) {	// sourcr�� jButton_1�̾ƴϳ�?
			if (prevNum != 0) {
				jTextField_Result.setText(prevText + "1");
			}
			else {
				jTextField_Result.setText("1");
			}
			
			prevText = jTextField_Result.getText();
		}
		else if (o == jButton_Add) {	// sourcr�� jButton_1�̾ƴϳ�?
			long newNum = saveNum + prevNum;
			
			jTextField_Result.setText(Long.toString(newNum));
			
			saveNum = newNum;
			prevText = null;
		}
	}
}
/*
class jButton1ActionListener implements ActionListener {
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println("1");
	}
}
*/