import java.util.Random;
public abstract class AnimalAttributes {
    String name; // stores animal's name (i.e. "bird", "frog", etc)
    int x; // stores animal's current x-coord
    int y; // stores animal's current y-coord
    int[] coordinates = {x, y}; // stores animal's coords as an array for convenient access
    static boolean isAlive; // stores whether the animal is dead/alive

    public String getRandomDirection() { // generates a random int that corresponds to a cardinal direction (N, S, E, W)
        Random rand = new Random();
        int randInt = rand.nextInt(4);
        
        String randomDirection;
        switch(randInt) {
            case 0:
                randomDirection = "N";
                break;
            case 1:
                randomDirection = "E";
                break;
            case 2:
                randomDirection = "S";
                break;
            case 3:
                randomDirection = "W";
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + randInt);
        }

        System.out.println(randInt + ", " + randomDirection); // this line is for debugging purposes; it outputs the
                                                              // random int generated, and the corresponding letter (feel free to delete)

        return randomDirection;
    }
}
