package main;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;

/**
 * The graphics manager for the project:
 * Takes in a graphics and uses it to draw various images and shapes
 * @author qhart
 *
 */
public class GraphicsManager {
	
	private Graphics g;
	
	public GraphicsManager(Graphics g) {
		this.g = g;
	}
	
	public void update() {
		assert(false); //TODO
	}
	
	//~~~~~~~~ IMAGE FUNCTIONS ~~~~~~~~
	
	public void drawImage(Image i, ImageStyle img) {
		assert(false);
	}
	
	//~~~~~~~~ SHAPE FUNCTIONS ~~~~~~~~
	
	/**
	 * Draws a point
	 * @param p1 the point to plot
	 * @param color the color of the point
	 * @param radius the radius of the dot
	 */
	public void drawPoint(Point p1, Color color, int radius) {
		assert(false);
	}
	
	/**
	 * Draws a line
	 * @param p1 the beginning point
	 * @param p2 the end point
	 * @param color the color of the line
	 * @param width the width of the line (in pixels)
	 */
	public void drawLine(Point p1, Point p2, Color color, int width) {
		assert(false); //TODO
	}
	
	/**
	 * Draws an arrow
	 * @param p1 the beginning point
	 * @param p2 the end point
	 * @param color the color of the line and arrow heads
	 * @param width the width of the line and arrow heads (in pixels)
	 * @param arrowBegin if an arrowhead should be drawn at the beginning (p1)
	 * @param arrowEnd if an arrowhead should be drawn at the end (p2)
	 */
	public void drawArrow(Point p1, Point p2, Color color, int width, boolean arrowBegin, boolean arrowEnd) {
		assert(false); //TODO
	}
	
	/**
	 * Draws a circle
	 * @param center the center point
	 * @param color the color of the circle
	 * @param radius the radius of the circle (in pixels)
	 * @param width the width of the line (in pixels)
	 * @param filled if the circle should be filled
	 */
	public void drawCircle(Point center, Color color, int radius, int width, boolean filled) {
		assert(false); //TODO
	}
	
	/**
	 * Draws a rectangle
	 * @param p1 the beginning point
	 * @param p2 the end point
	 * @param color the color of the rectangle
	 * @param width the width of the line (in pixels)
	 * @param filled if the rectangle should be filled
	 */
	public void drawRect(Point p1, Point p2, Color color, int width, boolean filled) {
		assert(false); //TODO
	}
	
	/**
	 * Connects the points on the map
	 * @param color the color of the line
	 * @param filled if the shape should be filled
	 * @param points the points to connect
	 */
	public void connect(Color color, boolean filled, Point... points) {
		assert(false); //TODO
	}
	
	//~~~~~~~~ TEXT FUNCTIONS ~~~~~~~~
	
	public void drawText(Point topLeft, Color color, String text, Font font) {
		assert(false); //TODO
	}
	
	public void drawTextLines(Point topLeft, Color color, String text, Font font, int xLimit) {
		assert(false); //TODO
	}

	
}
