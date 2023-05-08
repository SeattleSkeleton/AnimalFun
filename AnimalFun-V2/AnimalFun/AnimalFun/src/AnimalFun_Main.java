public class AnimalFun_Main {
    static Bird bird = new Bird();
    static Frog frog = new Frog();
    static Mouse mouse = new Mouse();
    static Rabbit rabbit = new Rabbit();
    static Snake snake = new Snake();
    static Turtle turtle = new Turtle();
    static Wolf wolf = new Wolf();
    static Cat cat = new Cat();
    static Dog dog = new Dog();

    public static void main(String[] args) {
        System.out.println(cat.isAlive);
        System.out.println(dog.isAlive);
        checkCollision();
        System.out.println(cat.isAlive);
        System.out.println(dog.isAlive);

        // output starting coordinates for each animal
        // output when a collision is detected and output which animal died (if possible)
        // output end coordinates

        // likely best to have everything in a for-loop
        // getPosition for each animal
        // for(int i = 0; i < 'the number of times we want the animals to move'; i++) {
        //      all the animals.move();
        // }
        // getPosition for each animal
    }

    private static void checkCollision() {
        cat.kill();
    }
}
