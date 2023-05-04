public class Wolf extends AnimalAttributes implements Animal {
	int x = getRandomStartPointX();
    int y = getRandomStartPointY();;
    int[] coordinates = {x, y};
    boolean isAlive = true;
    
	@Override
    public int[] move() {

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
		return "Custom behavior that is yet to be defined";
	}
}
