import becker.robots.*;

/**
 * A robot specialized in writing capital letters, extended from Robot class. 
 */
public class LetterBot extends RobotAdvanced {
	/**
	 * 
	 * @param city city of the map
	 * @param x x coordinate of the starting point
	 * @param y y coordinate of the starting point
	 * @param direction direction of the robot's initial heading
	 * @param things initial amounts of Things that robot starts with
	 */
    public LetterBot(City city, int x, int y, Direction direction, int things) {
        super(city, x, y, direction, things);
    } 

	/**
	 * 
	 * @param city city of the map
	 * @param x x coordinate of the starting point
	 * @param y y coordinate of the starting point
	 * @param things initial amounts of Things that robot starts with
	 */
	public LetterBot(City city, int x, int y, int things) {
        super(city, x, y, Direction.NORTH, things);
    }
	
	/**
	 * ensures nMoved is within a vaild rgb range: 0 ~ 255
	 * @return clamped value for rgb 
	 */
	private double clampedMove() {
        return (nMoved > 99) ? nMoved * 0.001 : (nMoved > 1.0) ? nMoved * 0.01 : nMoved;
    }

	/**
	 * ensures nPlaced is within a valid transparency range: 0 ~ 1.0
	 * @return clapmed value for transparency
	 */
	private int clampedPlaced() {
		return (nPlaced > 255) ? nPlaced % 255 : nPlaced;
	}

	/**
	 * Write a capital letter of S by putting Things.
	 */
    public void drawS() {
		setColor(nPlaced, 255, nPlaced + 40);
		setTransparency(clampedMove());

		move(1, 0);
        putThenMove(4, 0);	
		move(-5, 1);
		putThenMove(0, 2);
		move(1, 0);
        putThenMove(4, 0);	
		move(0, 1);
        putThenMove(0, 2);	
		move(-1, 0);
		putThenMove(-4, 0);
		move(6, 0);
    }
    
	/**
	 * Write a capital letter of A by putting Things.
	 */
    public void drawA() {
		setColor(220,  clampedPlaced() + 70, clampedPlaced() + 90);
		setTransparency(clampedMove());
		
		putThenMove(0, -6);
		putThenMove(5, 0);
		putThenMove(0, 3);
		putThenMove(-5, 0);
		move(5, 0);
		putThenMove(0, 4);
		move(1, -1);
    }
    
	/**
	 * Write a capital letter of R by putting Things.
	 */
    public void drawR() {
		setColor(100, clampedPlaced(),  200);
		setTransparency(clampedMove());

		putThenMove(0, -6);
		putThenMove(5, 0);
		putThenMove(0, 3);
		putThenMove(-5, 0);
		move(3, 1);
		putThenMove(0, 1);
		move(1, 0);
		putThenMove(0, 1);
		move(1, 0);
		putThenMove(0, 1);
		move(1, -1);
    }

	/**
	 * Write a capital letter of H by putting Things.
	 */
    public void drawH() {
		setColor(clampedPlaced(), clampedPlaced(), 0);
		setTransparency(clampedMove() * 2.5);

		putThenMove(0, -7);
		move(0, 4);
		putThenMove(5, 0);
		move(0, -3);
		putThenMove(0, 7);
		move(1, -1);
    }
}
