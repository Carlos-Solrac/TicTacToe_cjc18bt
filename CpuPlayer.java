/*
 * The CpuPlayer class is an extended class of the player class. It will be responsible for selecting 
 * the game board grid buttons through built in logic aimed at winning. It would communicate with the GameLogic class to update the 
 * game state when the cpu makes a move. 
 * 
 */

 public class CpuPlayer extends Player {
    // Attributes

   

    // Constructors
    public CpuPlayer(String name,char symbol, int moves, boolean isHuman) {
        super("CPU", symbol, moves, false);
    }

   // Setters


    // Getters


    // Methods

    // Override any methods from the Player class if necessary
    @Override
    public void makeMove(Board board) {
        // tbd
    }
}