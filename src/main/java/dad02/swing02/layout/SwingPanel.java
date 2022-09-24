package dad02.swing02.layout;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JPanel;

public class SwingPanel extends JPanel {
	public SwingPanel() {
		initComponent();
	}
	
	private void initComponent() {
		/*
		 * FlowLayout : �� �帣���� ��ġ. ������ ���� �� �ϸ� �� ���̾ƿ��� �ȴ�.
		 * BorderLayout : ����(EAST, WEST, NORTH, SOUTH, CENTER)�� ��ġ
		 * GridLayout : �ٵ��� ���ڷ� ��ġ. row, column ����
		 * null : ��ǥ�� ���� ����
		 * CardLayout : 
		 * GridBagLayout : �̰ɷ� ��� ���� ǥ�� ����
		 */
		
		/* FlowLayout
		JPanel jPanel_Red = new JPanel();
		jPanel_Red.setBackground(Color.red);
		jPanel_Red.setPreferredSize(new Dimension(100, 100));
		
		this.add(jPanel_Red);
		
		JPanel jPanel_Green = new JPanel();
		jPanel_Green.setBackground(Color.green);
		jPanel_Green.setPreferredSize(new Dimension(100, 100));
		
		this.add(jPanel_Green); 
		 */
		
		/* BorderLayout
		this.setLayout(new BorderLayout());
		
		JPanel jPanel_Red = new JPanel();
		jPanel_Red.setBackground(Color.red);
		jPanel_Red.setPreferredSize(new Dimension(100, 100));
		
		this.add(jPanel_Red, BorderLayout.SOUTH);
		
		JPanel jPanel_Green = new JPanel();
		jPanel_Green.setBackground(Color.green);
		jPanel_Green.setPreferredSize(new Dimension(100, 100));
		
		this.add(jPanel_Green, BorderLayout.WEST);
		
		JPanel jPanel_Blue = new JPanel();
		jPanel_Blue.setBackground(Color.blue);
		jPanel_Blue.setPreferredSize(new Dimension(100, 100));
		
		this.add(jPanel_Blue, BorderLayout.CENTER);
		*/
		
		/* GridLayout */
		/*
		this.setLayout(new GridLayout(7, 3));
		
		for (int i = 0; i < 20; i++) {
			JButton jButton = new JButton(Integer.toString(i));
			//jButton.setPreferredSize(new Dimension(100, 100));
			this.add(jButton);
		}
		*/
		
		/* GridBagLayout
			GridBagConstraints(
				x, y, w, h,				// ������ x, y, width, height
				weight_x, weight_y,		// ����ġ(�þ�� �� ����)
				anchor, fill,			// ä��� ���� ����, ��� ä����
				new Insets(top, left, bottom, right),	// ����
				padx, pady)				// padding��. ��� ����.
		 */
		
		this.setLayout(new GridBagLayout());
		
		JPanel jPanel_Red = new JPanel();
		jPanel_Red.setBackground(Color.red);
		jPanel_Red.setPreferredSize(new Dimension(100, 100));
		
		this.add(jPanel_Red, new GridBagConstraints(
				0, 0, 1, 1,
				1.0, 1.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(5, 5, 5, 5),
				0, 0
				));

		JPanel jPanel_Green = new JPanel();
		jPanel_Green.setBackground(Color.green);
		jPanel_Green.setPreferredSize(new Dimension(100, 100));
		
		this.add(jPanel_Green, new GridBagConstraints(
				1, 1, 1, 1,
				1.0, 1.0,
				GridBagConstraints.SOUTHEAST, GridBagConstraints.BOTH,
				new Insets(0, 0, 0, 0),
				0, 0
				));

		JPanel jPanel_Blue = new JPanel();
		jPanel_Blue.setBackground(Color.blue);
		jPanel_Blue.setPreferredSize(new Dimension(100, 100));

		this.add(jPanel_Blue, new GridBagConstraints(
				2, 2, 1, 1,
				1.0, 1.0,
				GridBagConstraints.NORTHWEST, GridBagConstraints.NONE,
				new Insets(0, 0, 0, 0),
				0, 0
				));			
	}
}
