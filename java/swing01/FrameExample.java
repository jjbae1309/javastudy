package swing01;

import java.awt.Dimension;

public class FrameExample {
	public static void main(String[] args) {
		TestFrame testFrame = new TestFrame();
		testFrame.setSize(new Dimension(600, 400));
		testFrame.setVisible(true);
	}
}
