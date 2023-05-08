public class Mouse extends AnimalAttributes implements Animal {
    boolean isAlive = true;
    int xStepsPerMove = 1;
    int yStepsPerMove = 1;

    @Override
    // Moves west 1 step, north 1 step (zig-zag to the northwest)
    public int[] move() {
        x -= 1;
        y += 1;
        coordinates[0] = x;
        coordinates[1] = y;
        
    	return coordinates;
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
		return "Moves west 1 step, north 1 step (zig-zag to the northwest)";
	}
}
