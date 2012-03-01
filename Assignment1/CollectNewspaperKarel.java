/*
 * File: CollectNewspaperKarel.java
 * --------------------------------
 * The CollectNewspaperKarel subclass instructs Karel to walk 
 * to the door of its house, pick up the newspaper 
 * (represented by a beeper, of course), and then return
 * to its initial position in the upper left corner of the house.
 */

import stanford.karel.*;

public class CollectNewspaperKarel extends SuperKarel {
   
/**
 * The entry point to Karel's execution.
 */
   public void run() {
      moveToTheNewspaper();
      pickNewspaper();
      returnToTheStartingPoint();
   }
   
/**
 * Makes Karel move 3 steps forward.
 */
   private void moveThree() {
      for (int i=0; i < 3; ++i) {
         move();
      }
   }
   
/**
 * Makes Karel move one step right. Karel faces the same
 * direction before and after the execution.
 */
   private void moveRight() {
      turnRight();
      move();
      turnLeft();
   }
   
/**
 * Moves Karel from his original position to the corner with
 * the beeper representing his newspaper.  Karel faces East
 * both before and after the call.
 */
   private void moveToTheNewspaper() {
      moveRight();
      moveThree();
   }
   
/**
 * Assuming that Karel is standing at the corner with the 
 * beeper representing his newspaper, makes him pick it up.
 */
   private void pickNewspaper() {
      pickBeeper();
   }

/**
 * Assuming that Karel i standing just outside his door
 * facing East, this method makes him return back inside
 * of his house to his original starting location and
 * orientation.
 */
   private void returnToTheStartingPoint() {
      turnAround();
      moveThree();
      moveRight();
      turnAround();
   }
}
