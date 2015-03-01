package heyBuddy;

import javax.swing.*;

public class HeyBuddy {

	public static void main(String[] args) {
		JFrame frame1 = new JFrame("Hello Buddy Frame1!");

		frame1.add( new HelloComponent() );
		frame1.setSize(250, 200);
		frame1.setVisible(true);
		
		JFrame frame2 = new JFrame("Second Frame");
		JLabel labelHello = new JLabel("Hello Buddy Label!", JLabel.CENTER);
		frame2.add(labelHello);
		frame2.setSize(250, 100);
		frame2.setVisible(true);
	}

}
