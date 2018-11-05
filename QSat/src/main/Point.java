package main;

/*
 * @author qharter
 * Represents a point in the graphics plane.
 */
public class Point {

	private int x, y;
	
	/*
	 * Default constructor.
	 * Sets x and y to 0.
	 */
	public Point() {
		x = 0;
		y = 0;
	}
	
	/*
	 * Constructor.
	 * Sets x and y to specific values
	 * @param x the x value
	 * @param y the y value
	 */
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	/*
	 * Constructor.
	 * Sets the x value to p's x value plus dx.
	 * Sets the y value to p's y value plus dy.
	 */
	public Point(Point p, int dx, int dy) {
		x = p.getX() + dx;
		y = p.getY() + dy;
	}
	
	/*
	 * Gets the x value
	 * @returns x
	 */
	public int getX() {
		return x;
	}
	
	/*
	 * Gets the y value
	 * @returns y
	 */
	public int getY() {
		return y;
	}
	
}
