import javax.swing.*;
import java.awt.*;

public class HelloWorld {
	public static void main(String[] args){
		JFrame frame = new JFrame( "Application 1" );
		JLabel label = new JLabel("Hello, Java", JLabel.CENTER );
		frame.add(new HelloComponent());
		frame.setSize( 300,300 );
		frame.setVisible( true );
	//	System.out.println("Hello Java");
	}
}

class HelloComponent extends JComponent{
	public void paintComponent( Graphics g ){
		g.drawString( "Hello, Java!", 125, 95);
	}
}
