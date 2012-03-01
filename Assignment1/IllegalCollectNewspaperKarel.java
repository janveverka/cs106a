/*
 * File: IllegalCollectNewspaperKarel.java
 * --------------------------------
 * The IllegalCollectNewspaperKarel subclass has 
 * the same functionality as the CollectNewspaperKarel
 * but uses JAVA capabilities that are not part of
 * Karel's language thus making this an illegal solution
 * of the Problem.
 * 
 * It instructs Karel to walk 
 * to the door of its house, pick up the newspaper 
 * (represented by a beeper, of course), and then return
 * to its initial position in the upper left corner of the house.
 */

import stanford.karel.*;

public class IllegalCollectNewspaperKarel extends SuperKarel {
   
   /**
    * The is the entry point to Karel's execution after
    */
   public void run() {
      moveToTheNewspaper();
      pickNewspaper();
      returnToTheStartingPoint();
   }
   
   /**
    * Makes Karel make numSteps forward.
    * This is a generalization of Karel's original move() method.
    * It takes an integer number as an argument and instructs Karel
    * to carry out a number of consecutive steps equal to the given
    * argument. A negative number instructs Karel to
    * move backward.  For example move(-3) cases Karrel to take
    * 3 steps back.
    * Karel is facing the same direction in the end as in the 
    * beginning.
    * 
    * It turns out that this method uses JAVA capabilities outside
    * of Karel's language and should not be used.
    */
   private void move(int numSteps) {
      if (numSteps < 0) {
         turnAround();
         move(-numSteps);
         turnAround();
      } else {
         for (int i=0; i < numSteps; ++i) {
            move();
         }
      }
   }
   
   /**
    * Same as move(numSteps) but makes Karel move left by a
    * number of "steps" equal to numSteps. A negative
    * value of numSteps makes Karel move right. 
    * Karel is facing the same direction in the end as in the 
    * beginning.
    */
   private void moveLeft(int numSteps) {
      turnLeft();
      move(numSteps);
      turnRight();
   }
   
   /**
    * Moves Karel from his original position to the corner with
    * the beeper representing his newspaper.  Karel faces East
    * both before and after the call.
    */
   private void moveToTheNewspaper() {
      moveLeft(-1);
      move(3);
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
    * of his house to his original starting position.
    */
   private void returnToTheStartingPoint() {
      move(-3);
      moveLeft(1);
   }
}
