public class Rabbit extends AnimalAttributes implements Animal {
    @Override
    public int[] move() {
        return new int[0];
    }

    @Override
    public int[] getPosition() {
        return new int[0];
    }

    @Override
    public boolean getDeadOrAlive() {
        return false;
    }
}
