public class Turtle extends AnimalAttributes implements Animal {

    int x = getRandomStartPointX();
    int y = getRandomStartPointY();


    int[] coordinates = {x, y};
    boolean isAlive = true;

    @Override
    public int[] move() {
        y -= 5;
        x -= 5;
        y += 5;
        x += 5;
        return new int[0];
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
        return "Moves south 5 steps, west 5 steps, north 5 steps, east 5 steps (clockwise box)";
    }
}
