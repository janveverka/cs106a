/*
 * File: SuperKarelWithCompass.java
 * --------------------------------
 * The SuperKarelWithCompass subclass adds complements to all
 * methods of SuperKarel such that their behavior is independent
 * of Karel's current orientation.  For example, move is
 * complemented by moveEast(), turnLeft() by turnNorth(), etc. 
 * Only the methods beginning with the word "turn" change Karel's orientation.
 * It also provides move*ToWall() variants of the move methods with
 * both relative (left, right, etc.) and absolute (north, east, etc.) directions.
 * It does not define any run method of its own.
 */

import stanford.karel.*;

public class SuperKarelWithCompass extends SuperKarel {

   /**
    * Instructs Karel to move one step left.
    * Precondition: Left is clear, there is no wall there.
    * Postcondition: Karel faces the same direction as before.
    */
   private void moveLeft() {
      turnLeft();
      move();
      turnRight();
   }
      
   /**
    * Instructs Karel to move one step right.
    * Precondition: Right is clear, there is no wall there.
    * Postcondition: Karel faces the same direction as before.
    */
   private void moveRight() {
      turnRight();
      move();
      turnLeft();
   }
      
   /**
    * Instructs Karel to move one step back.
    * Precondition: Back is clear, there is no wall there.
    * Postcondition: Karel faces the same direction as before.
    */
   private void moveBack() {
      turnAround();
      move();
      turnAround();
   }
      
   /**
    * Instructs Karel to move one step north.
    * Precondition: North is clear, there is no wall there.
    * Postcondition: Karel faces the same direction as before.
    */
   private void moveNorth() {
      if (facingNorth()) {
        move();
     } else {
        turnLeft();
        moveNorth();
        turnRight();
     }
   }

   /**
    * Instructs Karel to move one step east.
    * Precondition: East is clear, there is no wall there.
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
    * Instructs Karel to move one step south.
    * Precondition: South is clear, there is no wall there.
    * Postcondition: Karel faces the same direction as before.
    */
   private void moveSouth() {
      if (facingSouth()) {
         move();
      } else {
         turnLeft();
         moveSouth();
         turnRight();
      }
   }

   /**
    * Instructs Karel to move one step west.
    * Precondition: West is clear, there is no wall there.
    * Postcondition: Karel faces the same direction as before.
    */
   private void moveWest() {
      if (facingWest()) {
         move();
      } else {
         turnLeft();
         moveWest();
         turnRight();
      }
   }

   /**
    * Turns Karel north.
    * Precondition: None.
    * Postcondition: Karel faces noth.
    */
   private void turnNorth() {
      while (notFacingNorth()) {
         turnLeft();
      }
   }
   
   /**
    * Turns Karel east.
    * Precondition: None.
    * Postcondition: Karel faces east.
    */
   private void turnEast() {
      while (notFacingEast()) {
         turnLeft();
      }
   }
   
   /**
    * Turns Karel south.
    * Precondition: None.
    * Postcondition: Karel faces south.
    */
   private void turnSouth() {
      while (notFacingSouth()) {
         turnLeft();
      }
   }
   
   /**
    * Turns Karel west.
    * Precondition: None.
    * Postcondition: Karel faces west.
    */
   private void turnWest() {
      while (notFacingWest()) {
         turnLeft();
      }
   }
   
   /**
    * Moves Karel all the way to a wall in front of him.
    * Preconditions: None.
    * Postconditions: Karel is facing same direction as before and there is
    *   a wall in front of him.
    */
   private void moveToWall() {
      while (frontIsClear()) {
         move();
      }
   }
   
   /**
    * Moves Karel left all the way to a wall.
    * Preconditions: None.
    * Postconditions: Karel is facing same direction as before and there is
    *   a wall on his left.
    */
   private void moveLeftToWall() {
      turnLeft();
      moveToWall();
      turnRight();
   }
   
   /**
    * Moves Karel right all the way to a wall.
    * Preconditions: None.
    * Postconditions: Karel is facing same direction as before and there is
    *   a wall on his right.
    */
   private void moveRightToWall() {
      turnRight();
      moveToWall();
      turnLeft();
   }
   
   /**
    * Moves Karel back all the way to a wall.
    * Preconditions: None.
    * Postconditions: Karel is facing same direction as before and there is
    *   a wall behind him.
    */
   private void moveBackToWall() {
      turnAround();
      moveToWall();
      turnAround();
   }
   
}
