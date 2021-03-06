package gal.teis.gui;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class MainFrame extends JFrame {

	public MainFrame() {
		setTitle("SOY UNA VENTANA");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setResizable(false);

		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		setSize(screenSize.width/2, screenSize.height/2);
		setLocation(screenSize.width/4, screenSize.height/4);
		setIconImage(Toolkit.getDefaultToolkit().getImage("src/images/goat.png"));

		MainPanel panel = new MainPanel(this);
		add(panel);
	}
}
