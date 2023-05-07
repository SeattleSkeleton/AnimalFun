public class Wolf extends AnimalAttributes implements Animal {

    int x = getRandomStartPointX();
    int y = getRandomStartPointY();


    int[] coordinates = {x, y};
    boolean isAlive = true;

    @Override
    public int[] move() {

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
        return "Custom behavior that is yet to be defined";

    }
}
