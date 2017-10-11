
import kareltherobot.*; 


/**
 * @author :  Milan Oppermann
 */
public class Problem1 extends Robot
{
    public Problem1(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    }
    
    public void escapeRoom() {
        while (frontIsClear()) {
            move();
        }
        turnRight();
        for ( int x = 1; x>0; x ++) {
            if (frontIsClear()) {
                turnLeft();
            if (frontIsClear()) {
                move();
                move();
                turnOff();
            }
            else {
                turnRight();
                move();;
            }
            }
            else {
            turnLeft();
            if (!frontIsClear()) {
                turnRight();
                turnRight();
                move();
            }
            else {
                move();
                move();
                turnOff();
            }
            }
        }
        
    }
    
    
}

