public class Bird extends AnimalAttributes implements Animal {
    boolean isAlive = true;
    int xStepsPerMove = 1;
    int yStepsPerMove = 1;

    @Override
    public int[] move() {
        final String DIRECTION = getRandomDirection();
        if(isAlive = true) {
            switch (DIRECTION) {
                case "N":
                    y += yStepsPerMove;
                    coordinates[1] = y; // added these lines because the program wasn't applying x/y's new value to 'coordinates'
                    break;
                case "S":
                    y -= yStepsPerMove;
                    coordinates[1] = y;
                    break;
                case "E":
                    x += xStepsPerMove;
                    coordinates[0] = x;
                    break;
                case "W":
                    x -= xStepsPerMove;
                    coordinates[0] = x;
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + DIRECTION);
            }
            return coordinates;

        } else {
            coordinates[0] = 0;
            coordinates[1] = 0;

            return coordinates;
        }
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
		return "Moves randomly 1 step in one of the four directions each time";
	}
}
