public class Snake extends AnimalAttributes implements Animal {

    //int x = getRandomStartPointX();
    //int y = getRandomStartPointY();

    int xStepsPerMove = 1;
    int yStepsPerMove = 1;
    int moves = 1;
    boolean isAlive = true;

    @Override
    public int[] move() {
        coordinates[1] = y -= 1;
        coordinates[0] = x += 1 + xStepsPerMove * -1;

        return coordinates;
    }

    public void bounceX() {
        x *= -1;

    }

    public void bounceY() {
        y *= -1;

    }

    @Override
    public int[] getPosition() {
        return coordinates;
    }

    @Override
    public String getMove() {
        if(isAlive == true);
        // TODO Auto-generated method stub
        return "Moves south 1 step, east 1 step, south 1 step, west 2 steps, south 1 step, east 3 steps, "
                + "south 1 step, west 4 steps, ... (“slithers” left and right in increasing length)";
    }

    @Override
    public boolean getDeadOrAlive() {
        return isAlive;
    }


}
