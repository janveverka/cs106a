/*
 * File: SuperKarelWithCompass.java
 * --------------------------------
 * The SuperKarelWithCompass subclass adds complements to all
 * methods of SuperKarel such that their behavior is independent
 * of Karel's current orientation.  For example, move is
 * complemented by moveEast(), turnLeft() by turnNorth(), etc. 
 * Only the methods beginning with the word "turn" change Karel's orientation.
 */

import stanford.karel.*;

public class SuperKarelWithCompass extends SuperKarel {

/**
 * Instructs Karel to move one step east.
 * Precondition: There is no wall to the east.
 * Postcondition: Karel faces the same direction as before.
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
 * Instructs Karel to move one step east.
 * Precondition: There is no wall to the east.
 * Postcondition: Karel faces the same direction as before.
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
    * Instructs Karel to move one step east.
    * Precondition: There is no wall to the east.
    * Postcondition: Karel faces the same direction as before.
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
