package Projects.Project_04;

import java.util.Random;


/**
 * The Star class represents a star object that can move in different directions.
 */
public class Star {
	// Instance fields
	private int curX, curY, speed;
	// Static fields
	private static Random rand;
	
	
	
	// Accessors
    /**
     * Retrieves the current X coordinate of the star.
     *
     * @return The current X coordinate.
     */
	public int getCurX() {
		return curX;
	}
	
    /**
     * Retrieves the current Y coordinate of the star.
     *
     * @return The current Y coordinate.
     */
	public int getCurY() {
		return curY;
	}
	
	
	
	// Mutator
    /**
     * Sets the current X coordinate of the star.
     *
     * @param X The new X coordinate.
     */
	private void setX(int X) {curX = X;} 
	
    /**
     * Sets the current Y coordinate of the star.
     *
     * @param Y The new Y coordinate.
     */
	private void setY(int Y) {curY = Y;}
	
	
	
	/**
     * Constructs a new Star object with a random speed and initial position.
     */
	public Star() {
		if(rand==null)
			rand = new Random();
		speed = rand.nextInt(10) + 1;
		setX(rand.nextInt(MainProgram.W_WIDTH));
		setY(rand.nextInt(MainProgram.W_HEIGHT));
	}
	
	
    /**
     * Moves the star down by its speed. If the star reaches the bottom of the screen,
     * it wraps around to the top and repositions randomly on the X-axis.
     */
	public void moveDown() {
		if(curY < MainProgram.W_HEIGHT)
			setY(curY + speed);
		else {
			setY(0);
			setX(rand.nextInt(MainProgram.W_WIDTH));
		}
	}
	
	/**
     * Moves the star up by its speed. If the star reaches the top of the screen,
     * it wraps around to the bottom and repositions randomly on the X-axis.
     */
	public void moveUp() {
		if (curY > 0)
			setY(curY - speed);
		else {
			setY(MainProgram.W_HEIGHT);
			setX(rand.nextInt(MainProgram.W_WIDTH));
		}
	}
	
    /**
     * Moves the star to the left by its speed. If the star reaches the leftmost edge of the screen,
     * it wraps around to the right side and repositions randomly on the Y-axis.
     */
	public void moveLeft() {
		if (curX > 0)
			setX(curX - speed);
		else {
			setX(MainProgram.W_WIDTH);
			setY(rand.nextInt(MainProgram.W_HEIGHT));
		}
	}
	
    /**
     * Moves the star to the right by its speed. If the star reaches the rightmost edge of the screen,
     * it wraps around to the left side and repositions randomly on the Y-axis.
     */
	public void moveRight() {
		if (curX < MainProgram.W_WIDTH)
			setX(curX + speed);
		else {
			setX(0);
			setY(rand.nextInt(MainProgram.W_HEIGHT));
		}
	}
}
