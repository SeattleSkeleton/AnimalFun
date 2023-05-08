public class Cat extends AnimalAttributes implements Animal {
    boolean isAlive = true;
    int xStepsPerMove = 1;
    int yStepsPerMove = 1;
    int x = 1;
    int y = 1;
    int[] coordinates = {x, y};

    @Override
    public int[] move() {
        return new int[0];
    }

    @Override
    public int[] getPosition() {
        return coordinates;
    }

    @Override
    public boolean getDeadOrAlive() {
        return false;
    }

    @Override
    public String getMove() {
        return null;
    }
}
