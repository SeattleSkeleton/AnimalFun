import java.util.Arrays;

public class AnimalFun_Main {
    public static void main(String[] args) {
    // NOTE: EVERYTHING IN THIS CLASS CAN BE DELETED AT ANY TIME; THIS CODE IS JUST HERE TO TEST THE OBJECTS/METHODS
    	// this bit below is just to test that Bird is working properly.
        // the output should look something like this:
        /*    
         *    'ANIMAL NAME' DEBUG:
         *    [0, 0]
         *    true
         *    1, E
         *    2, S
         *    false
         *    [1, -1]
         */
        
    // testing Bird
    	System.out.println("BIRD DEBUG:");
    	Bird bird = new Bird();                                  // new Bird is created
    	System.out.println(bird.getMove());                      // print to console what Bird is supposed to do
        System.out.println(Arrays.toString(bird.getPosition())); // print to console Bird's current coordinates
        
        System.out.println(bird.getDeadOrAlive());               // print to console the state of Bird's life (dead/alive -> false/true)
        bird.move();                                             // method call to make bird move
        bird.move();                                             // second method call to make bird move
        System.out.println(bird.kill());                         // test kill() method by killing the bird

        System.out.println(Arrays.toString(bird.getPosition())); // get Bird's new position/coordinates
        
        
        System.out.println(); // spacers
        System.out.println(); // spacers
        
    // testing Frog
        System.out.println("FROG DEBUG:");                       // format for Frog is identical to that of Bird
        Frog frog = new Frog();
        System.out.println(frog.getMove());
        System.out.println(Arrays.toString(frog.getPosition()));
        
        System.out.println(frog.getDeadOrAlive());
        frog.move();
        frog.move();
        System.out.println(bird.kill());
        
        System.out.println(Arrays.toString(frog.getPosition()));
    }
}
