import stanford.karel.SuperKarel;

public class VotingBox extends SuperKarel {
	public void run() {
		if(frontIsClear()) {
		  turnLeft();
	  }
		while(frontIsClear()) {
			move();
		  
	  }
		if(leftIsBlocked()) {
			turnRight();
			}
		move();
		move();
		move();
		move();
		if(frontIsClear()) {
			turnRight();
		}
		move();
		move();
		if(leftIsClear()) {
			turnLeft();
		}
		move();
		turnLeft();
		move();
		if(beepersPresent()) {
			pickBeeper();
		}
		turnAround();
		if(leftIsBlocked()) {
			 move();
		} 
		turnLeft();
		if(frontIsClear()) {
			move();
			} 
		turnLeft();
		while(frontIsClear()) {
			move();
		} 
		if(frontIsBlocked()) {
			turnRight();
			}
		move();
		move();
		 
	      if(frontIsClear()) {
			turnRight();
			move();
			move();
		}
	        turnLeft();
	        move();
	        if(frontIsClear()) {
	        	turnLeft();
	        	move();
	        	pickBeeper();
	        }
	        turnAround();
	        while(frontIsClear()) {
	        	move();	        		       	        	
	}
	        pickTwo();
	        turnAround();
	        while(leftIsBlocked()) {
	        	move();
	        	turnRight();
	        }
	        move();
	      
	        
	        }

	         private void pickTwo() {
		         pickBeeper();
		         pickBeeper();
		
	}
	         }
			

		
		
	
	

	  



