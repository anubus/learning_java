package heyBuddy;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class HelloComponent3 extends JComponent implements MouseMotionListener, ActionListener {
	
	String theMessage;
	int messageX = 125, messageY = 95;  //message coordinates
	
	JButton theButton;
	
	int colorIndex;   //current index into someColors
	static Color[] someColors = {
		Color.black, Color.red, Color.green, Color.blue, Color.magenta, Color.orange
	};
	
	public HelloComponent3( String message ) {
		theMessage = message;
		theButton = new JButton( "Change Color" );
		setLayout( new FlowLayout() );
		add( theButton );
		theButton.addActionListener( this );
		addMouseMotionListener( this );
	}
	
	public void paintComponent( Graphics g ) {
		g.drawString( theMessage, messageX, messageY);
	}
	
	public void mouseDragged( MouseEvent e ) {
		messageX = e.getX();
		messageY = e.getY();
		repaint();
	}
	
	public void mouseMoved( MouseEvent e ) {}
	
	public void actionPerformed( ActionEvent e ) {   //button pushed?
		if ( e.getSource() == theButton )
			changeColor();
	}
	
	synchronized private void changeColor() {   //change index to next color awkwardly
		if ( ++colorIndex == someColors.length )
			colorIndex = 0;
		setForeground( currentColor() );        //use the new color
		repaint();
	}
	
	synchronized private Color currentColor() {
		return someColors[colorIndex];
	}
	

}
