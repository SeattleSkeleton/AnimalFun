public class Turtle extends AnimalAttributes implements Animal {

    int x = getRandomStartPointX();
    int y = getRandomStartPointY();


    int[] coordinates = {x, y};
    boolean isAlive = true;

    @Override
    public int[] move() {
        final String DIRECTION = getRandomDirection();

        switch (DIRECTION) {
            case "N":
                y += 1;
                coordinates[1] = y; // added these lines because the program wasn't applying x/y's new value to 'coordinates'
                break;
            case "S":
                y -= 1;
                coordinates[1] = y;
                break;
            case "E":
                x += 1;
                coordinates[0] = x;
                break;
            case "W":
                x -= 1;
                coordinates[0] = x;
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + DIRECTION);
        }

        return coordinates;
    }

    public void bounceX() {

    }

    public void bounceY() {

    }

    @Override
    public int[] getPosition() {
        return coordinates;
    }

    @Override
    public boolean getDeadOrAlive() {
        return isAlive;
    }

    @Override
    public String getMove() {

        if(isAlive == true);
        // TODO Auto-generated method stub
        return "Moves randomly 1 step in one of the four directions each time";
    }
}
