import java.util.Arrays;

public class AnimalFun_Main {
    public static void main(String[] args) {
        // this bit below is just to test that Bird is working properly.
        // the output should look something like this:
        /*
         *    [0, 0]
         *    1, E
         *    2, S
         *    [1, -1]
         */

        // BIRD
        Bird bird = new Bird();
        System.out.println("\n" + "BIRD:");
        System.out.println("North and South: " + Arrays.toString(bird.getPosition()));
        bird.move();
        bird.move();
        System.out.println("West and East: " + Arrays.toString(bird.getPosition()));



        //FROG
        Frog frog = new Frog();
        System.out.println("\n" + "FROG:");
        System.out.println("\n" + "North and South: " + Arrays.toString(frog.getPosition()));
        frog.move();
        frog.move();
        System.out.println("West and East: " + Arrays.toString(frog.getPosition()));


        //MOUSE
        Mouse mouse = new Mouse();
        System.out.println("\n" + "MOUSE:");
        System.out.println("\n" + "North and South: " + Arrays.toString(mouse.getPosition()));
        mouse.move();
        mouse.move();
        System.out.println("West and East: " + Arrays.toString(mouse.getPosition()));


        //RABBIT
        Rabbit rabbit= new Rabbit();
        System.out.println("\n" + "RABBIT:");
        System.out.println("\n" + "North and South: " + Arrays.toString(rabbit.getPosition()));
        rabbit.move();
        rabbit.move();
        System.out.println("West and East: " + Arrays.toString(rabbit.getPosition()));


        //SNAKE
        Snake snake = new Snake();
        System.out.println("\n" + "SNAKE:");
        System.out.println("\n" + "Slithers North and South: " + Arrays.toString(snake.getPosition()));
        snake.move();
        snake.move();
        System.out.println("Slithers West and East: " + Arrays.toString(snake.getPosition()));


        //TURTLE
        Turtle turtle = new Turtle();
        System.out.println("\n" + "TURTLE:");
        System.out.println("\n" + "North and South: " + Arrays.toString(turtle.getPosition()));
        turtle.move();
        turtle.move();
        System.out.println("West and East: " + Arrays.toString(turtle.getPosition()));


        //WOLF
        Wolf wolf = new Wolf();
        System.out.println("\n" + "WOLF:");
        System.out.println("\n" + "North and South: " + Arrays.toString(wolf.getPosition()));
        wolf.move();
        wolf.move();
        System.out.println("West and East: " + Arrays.toString(wolf.getPosition()));



    }


}
