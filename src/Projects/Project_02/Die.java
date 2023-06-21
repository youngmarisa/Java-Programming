package Projects.Project_02;

import java.util.Random;

public class Die {
	
	private int value;
	private static final int SIDES = 6;
	
	private static Random rand;
	
	public int getValue() {
		return value;
	}
	
	public void roll() {
		value = rand.nextInt(SIDES) + 1;
	}
	
	//Default constructor
	public Die() {
		if (rand == null) {
			rand = new Random();
		}
		roll();
		
	}


}
