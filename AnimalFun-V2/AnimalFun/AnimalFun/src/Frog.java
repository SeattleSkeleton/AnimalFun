public class Frog extends AnimalAttributes implements Animal {
	int x = getRandomStartPointX();
    int y = getRandomStartPointY();;
    int[] coordinates = {x, y};
    boolean isAlive = true;
    
    @Override
    public int[] move() {
        final String DIRECTION = getRandomDirection();

            switch (DIRECTION) {
                case "N":
                    y += 3;
                    coordinates[1] = y; // added these lines because the program wasn't applying x/y's new value to 'coordinates'
                    break;
                case "S":
                    y -= 3;
                    coordinates[1] = y;
                    break;
                case "E":
                    x += 3;
                    coordinates[0] = x;
                    break;
                case "W":
                    x -= 3;
                    coordinates[0] = x;
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + DIRECTION);
            }

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
		return "Moves randomly 3 steps in one of the four directions";
	}
}
