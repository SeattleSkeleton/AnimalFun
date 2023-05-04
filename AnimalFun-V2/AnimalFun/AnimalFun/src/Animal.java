public interface Animal {
    // This method will allow for each animals' movement behavior
    public int[] move(); // the method returns the coordinates as a 2-element array

    // This method will return the (x, y) coordinates of the animal
    public int[] getPosition(); // the method returns the coordinates as a 2-element array

    // This method allows us to check if the animal is dead or alive
    public boolean getDeadOrAlive();
    
    public String getMove();

}
