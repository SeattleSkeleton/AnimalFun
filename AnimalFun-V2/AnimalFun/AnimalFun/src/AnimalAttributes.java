import java.util.Random;
public abstract class AnimalAttributes {
    String name; // stores animal's name (i.e. "bird", "frog", etc)
    int x = getRandomStartPointX(); // stores animal's current x-coord
    int y = getRandomStartPointY(); // stores animal's current y-coord
    int[] coordinates = {x, y}; // stores animal's coords as an array for convenient access

    static boolean isAlive; // stores whether the animal is dead/alive

    int domain = 16; // sets the domain of the simulated coordinate plane
    int range = 16; // sets the range of the simulated coordinate plane

    int xStepsPerMove; // allows us to bounce the animals off the boundaries of the y-axis by making this value negative
    int yStepsPerMove; // allows us to bounce the animals off the boundaries of the x-axis by making this value negative


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
        return randomDirection;
    }
    
// This method allows us to kill the animals
    public boolean kill() {
    	return isAlive = false;
    }

// These methods below are for generating the starting coordinates of a given animal
    public int getRandomStartPointX() {
    	Random rand = new Random();
        return rand.nextInt(8); // this more or less establishes the domain of where the animals can spawn/start
    }
    public int getRandomStartPointY() {
    	Random rand = new Random();
        return rand.nextInt(8); // this establishes the range of where the animals can spawn/start
    }
}
