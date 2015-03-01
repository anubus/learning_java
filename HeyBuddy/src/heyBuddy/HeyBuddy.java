package heyBuddy;

import javax.swing.*;

public class HeyBuddy {

	public static void main(String[] args) {
		JFrame frame1 = new JFrame("Hello Buddy Frame1!");
		JLabel labelHello = new JLabel("Hello Buddy Label!", JLabel.CENTER);
		JLabel labelGoodbye = new JLabel("See ya Buddy", JLabel.LEFT);
		frame1.add(labelHello);
		//frame1.add(labelGoodbye);
		frame1.setSize(250, 100);
		frame1.setVisible(true);
		
		JFrame frame2 = new JFrame("Second Frame");
		frame2.add(labelGoodbye);
		frame2.setSize(250, 200);
		frame2.setVisible(true);
	}

}
