/*
 * The CpuPlayer class is an extended class of the player class. It will be responsible for selecting 
 * the game board grid buttons through built in logic aimed at winning. It would communicate with the GameLogic class to update the 
 * game state when the cpu makes a move. 
 * 
 */

 public class CpuPlayer extends Player {
    // Attributes

    // Select CPU difficulty
    private int difficulty;

    // Constructors
    public CpuPlayer(String name, char move) {
        super(name, move, false);
        this.random = new Random();
    }

   // Setters
   public void setRandom(Random random) {
    this.random = random;
    }

    // Getters
    public Random getRandom() {
        return random;
    }

    // Methods

    // Override any methods from the Player class if necessary
    @Override
    public void makeMove(Board board) {
        // tbd
    }
}