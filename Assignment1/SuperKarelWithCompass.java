/*
 * File: SuperKarelWithCompass.java
 * --------------------------------
 * The SuperKarelWithCompass subclass adds complements to all
 * methods of SuperKarel such that their behavior is independent
 * of Karel's current orientation.  For example, move is
 * complemented by moveEast(), turnLeft() by turnNorth(),
 * isFronClear() by isEastClear(), etc. Only the methods
 * beginnig with the word "turn" change Karel's orientation.
 */

import stanford.karel.*;

public class SuperKarelWithCompass extends SuperKarel {

	/**
	 * Instructs Karel to move one step east.
	 */
	private void moveEast() {
		if (facingEast()) {
			move();
		} else {
			turnLeft();
			moveEast();
			turnRight();
		}
	}
	
	/**
	 * Instructs Karel to turn east.
	 */
	private void turnEast() {
		while (notFacingEast()) {
			turnLeft();
		}
	}
	
}
