public class Mouse extends AnimalAttributes implements Animal {

    int x = getRandomStartPointX();
    int y = getRandomStartPointY();;
    int[] coordinates = {x, y};
    boolean isAlive = true;

    @Override
    // Moves west 1 step, north 1 step (zig-zag to the northwest)
    public int[] move() {
        x -= 1;
        y += 1;
        coordinates[0] = x;
        coordinates[1] = y;

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
    public boolean getDeadOrAlive() {
        return isAlive;
    }

    @Override
    public String getMove() {

        if(isAlive == true);


        // TODO Auto-generated method stub
        return "Moves west 1 step, north 1 step (zig-zag to the northwest)";
    }
}
