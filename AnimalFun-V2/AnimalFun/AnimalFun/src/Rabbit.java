public class Rabbit extends AnimalAttributes implements Animal {
    boolean isAlive = true;
    int xStepsPerMove = 1;
    int yStepsPerMove = 1;

    @Override
    public int[] move() {
        y += 2;
        x += 2;
        y -= 2;
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
		return "Move north 2 steps, east 2 steps, south 2 steps (“hops” to the right)";
	}
}
