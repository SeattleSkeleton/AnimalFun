public class Wolf extends AnimalAttributes implements Animal {
    boolean isAlive = true;
    int xStepsPerMove = 1;
    int yStepsPerMove = 1;

	@Override
    public int[] move() {
        y += 1;
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
		return "Take one step North";
	}
}
