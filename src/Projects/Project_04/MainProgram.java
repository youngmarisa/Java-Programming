package Projects.Project_04;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
// Resources:
//https://www.youtube.com/watch?v=L9um4uxLooo


/**
 * The MainProgram class represents the main game window and controls the movement of stars.
 */
public class MainProgram extends JFrame {
	// Static Fields
    /**
     * The width of the game window.
     */
	public static int W_WIDTH = 600;
	
    /**
     * The height of the game window.
     */
	public static int W_HEIGHT = 600;
	
    /**
     * The maximum number of stars in the cosmos.
     */
	public static int MAX_STARS = 300;
	
	
	// Instance Fields
    /**
     * An array of Star objects representing the cosmos.
     */
	private Star cosmos[];
	
    /**
     * The current direction of movement.
     * 0: Down, 1: Up, 2: Left, 3: Right
     */
	private int moveDirection; // Field to store the direction of movement
	
	
	/**
     * Constructs a new MainProgram object and initializes the game window.
     */
	public MainProgram() {
		cosmos = new Star[MAX_STARS];
		for(int i = 0; i < MAX_STARS; i++)
			cosmos[i] = new Star();
		this.setTitle("Video Game");
		this.setSize(W_WIDTH, W_HEIGHT);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
		KeyListener kb = new keyListener();
		addKeyListener(kb);
		setFocusable(true);
		
        moveDirection = 0; // Initialize the move direction to "down"
		
	}
	
    /**
     * Overrides the paint method to draw stars on the game window.
     *
     * @param g The Graphics object used for drawing.
     */
	public void paint(Graphics g) {
		// Local variables
		Graphics2D g2;
		Star curStar;
		
		// Converts graphics to 2D
		g2 = (Graphics2D) g;
		// Set the black canvas
		g2.setColor(Color.BLACK);
		g2.fillRect(0, 0, W_WIDTH, W_HEIGHT);
		// Paint the stars
		g2.setColor(Color.CYAN);
		for(int i = 0; i < MAX_STARS; i++) {
			curStar = cosmos[i];
			g2.fillRect(curStar.getCurX(), curStar.getCurY(), 2, 2);
		}
		
	}
	
    /**
     * Moves the stars in the cosmos array based on the current move direction.
     * Repaints the game window after each movement.
     */
	public void moveCosmos() {
		int curTick = 0;
		try {
			while(true) {
				Thread.sleep(50);
				for(int i = 0; i < MAX_STARS; i++) {
					
					if (moveDirection == 0)
                        cosmos[i].moveDown();
                    else if (moveDirection == 1)
                        cosmos[i].moveUp();
                    else if (moveDirection == 2)
                        cosmos[i].moveLeft();
                    else if (moveDirection == 3)
                        cosmos[i].moveRight();
				}

//					cosmos[i].moveDown();
				repaint();
				curTick++;
			}
		}
		catch(Exception ex) {
		}
	}
	
	
    /**
     * The entry point of the program.
     *
     * @param args The command-line arguments.
     */
	public static void main(String[] args) {
		// Local variables
		MainProgram win;
		
		win = new MainProgram();
		win.moveCosmos();
	}
	
	
	/**
     * The KeyListener class handles keyboard events for changing the move direction.
     */
	private class keyListener implements KeyListener {

		@Override
		public void keyPressed(KeyEvent e) {
			System.out.println("keyPressed="+KeyEvent.getKeyText(e.getKeyCode()));
			
	           switch (e.getKeyCode()) {
               case KeyEvent.VK_DOWN:
                   moveDirection = 0;
                   break;
               case KeyEvent.VK_UP:
                   moveDirection = 1;
                   break;
               case KeyEvent.VK_LEFT:
                   moveDirection = 2;
                   break;
               case KeyEvent.VK_RIGHT:
                   moveDirection = 3;
                   break;
           }
			

		}

		@Override
		public void keyReleased(KeyEvent e) {
			System.out.println("keyReleased="+KeyEvent.getKeyText(e.getKeyCode()));
			
		}

		@Override
		public void keyTyped(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}

}
