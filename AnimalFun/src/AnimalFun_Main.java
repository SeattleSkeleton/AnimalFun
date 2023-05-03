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
        Bird bird = new Bird();
        System.out.println(Arrays.toString(bird.getPosition()));

        bird.move();
        bird.move();

        System.out.println(Arrays.toString(bird.getPosition()));
    }
}
