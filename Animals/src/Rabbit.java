public class Rabbit extends AnimalAttributes implements Animal {

    int x = getRandomStartPointX();
    int y = getRandomStartPointY();;
    int[] coordinates = {x, y};


    boolean isAlive = true;

    @Override
    public int[] move() {
        y += 2;
        x += 2;
        y -= 2;
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
        return "Move north 2 steps, east 2 steps, south 2 steps (“hops” to the right)";
    }
}
