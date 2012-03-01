/*
 * File: StoneMasonKarel.java
 * --------------------------
 * The StoneMasonKarel subclass solves the "Repair the Quad"
 * problem from Assignment 1.
 * 
 */

import stanford.karel.*;

public class StoneMasonKarel extends SuperKarel {

	/**
	 * Instructs Karel where to start the execution.
	 */
	public void run() {
		repairColumn();		
		while(frontIsClear()) {
			moveToTheNextColumn();
			repairColumn();
		}
	}
	
	/**
	 * Repairs a column at the bottom of which Karel is.
	 */
	private void repairColumn() {
		repairCorner();
		turnNorth();
		while (frontIsClear()) {
			move();
			repairCorner();
		}
		turnAround();
		moveToWall();
		turnEast();
	}
	
	/**
	 * Asks Karel to move to the next column four corners East. 
	 */
	private void moveToTheNextColumn() {
		turnEast();
		for (int i=0; i<4; ++i) {
			move();
		}
	}
	
	/**
	 * Turns Karel North independent of his current orientation.
	 */
	private void turnNorth() {
		while(notFacingNorth()) {
			turnLeft();
		}
	}

	/**
	 * Turns Karel East independent of his current orientation.
	 */
	private void turnEast() {
		while(notFacingEast()) {
			turnLeft();
		}
	}

	/**
	 * Repairs current corner.  Places a beeper here iff there 
	 * are no beepers present.
	 */
	private void repairCorner() {
		if (noBeepersPresent()) {
			putBeeper();
		}
	}
	
	/**
	 * Asks Karel to move all the way to the wall in front of him.
	 */
	private void moveToWall() {
		while (frontIsClear()) {
			move();
		}
	}
	
}
