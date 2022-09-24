package dad02.swing04.form;

import javax.swing.UIManager;

public class SwingExample {
	public static void main(String[] args) {
		 try {
			 UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
		 }
		 catch (Exception e) { }
		
		SwingFrame frame = new SwingFrame();
		frame.setTitle("°è»ê±â");
		frame.setSize(600, 400);
		frame.setVisible(true);
	}
}
