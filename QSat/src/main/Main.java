package main;

import java.applet.Applet;
import java.awt.*;

public class Main extends Applet {

	public void paint(Graphics g) {
		
		//API Setup
		APIManager apiMan = new SatteliteManager();
		apiMan.setup();
		
		//Graphics setup
		GraphicsManager gMan = new GraphicsManager(g);
		
		//Screen Setup
		boolean done = false;
		while (!done) {
			done = apiMan.loop();
		}
		
	}
	
}
