package heyBuddy;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class HeyBuddy4 {
	public static void main( String[] args ) {
		JFrame frame = new JFrame( "Hello Buddy 4!");
		frame.add( new HelloComponent4( "Hello Java 4!"));
		frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);
		frame.setSize( 300, 300);
		frame.setVisible( true );
	}
}
