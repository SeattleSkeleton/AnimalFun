public class Snake extends AnimalAttributes implements Animal {
    boolean isAlive = true;
    int xStepsPerMove = 1;
    int yStepsPerMove = 1;
    int moves = 1;
    int counter = 1;
	@Override
    public int[] move() {
        xStepsPerMove += 1;                 // Increases the steps taken West/East by 1
        xStepsPerMove = xStepsPerMove * -1; // Changes the +/- sign of xStepsPerMove so that it can both subtract [cont. on next line]
        // (go West) and add (go East) to the x coordinate

        y -= 1;
        x += xStepsPerMove;

        coordinates[0] = x;
        coordinates[1] = y;        return coordinates;
    }

    @Override
    public int[] getPosition() {
        return coordinates;
    }

    @Override
    public boolean getDeadOrAlive() { // still need to figure this part out; how to tell if animal is dead/alive
        return isAlive;
    }

	@Override
	public String getMove() {
		// TODO Auto-generated method stub
		return "Moves south 1 step, east 1 step, south 1 step, west 2 steps, south 1 step, east 3 steps, "
				+ "south 1 step, west 4 steps, ... (“slithers” left and right in increasing length)";
	}
}
