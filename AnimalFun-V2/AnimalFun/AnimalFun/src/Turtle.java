public class Turtle extends AnimalAttributes implements Animal {
    boolean isAlive = true;
    int xStepsPerMove = 1;
    int yStepsPerMove = 1;

	@Override
    public int[] move() {
        y -= 5;
        x -= 5;
        y += 5;
        x += 5;
		return new int[0];
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
		return "Moves south 5 steps, west 5 steps, north 5 steps, east 5 steps (clockwise box)";
	}
}
