package heyBuddy;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class HeyBuddy3 {
	
	public static void main( String[] args ){
		JFrame frame = new JFrame( "Hey Buddy Number 3!");
		frame.add( new HelloComponent3( "Hello Java 3!" ) );
		frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		frame.setSize( 300, 300 );
		frame.setVisible( true );
	}
}
