package heyBuddy;

import java.awt.*;
import javax.swing.*;

public class HeyBuddy2 {
	public static void main( String[] args ){
		JFrame frame = new JFrame( "Hello Java 2");
		frame.add( new HelloComponent2("Hello Java Buddy!"));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize( 300,  300);
		frame.setVisible(true);
	}
}
