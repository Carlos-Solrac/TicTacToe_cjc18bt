/*
 * The Player class handles user choices for gameplay. It will be responsible for selecting 
 * the game board grid buttons. It would communicate with the GameLogic class to update the 
 * game state when a player makes a move. 
 * 
 */

 public class  Player {

    // Attributes

    private String name;
    private char move;
    private boolean isHuman;

    // Constructor
    public Player(String name, char move, boolean isHuman) {
        this.name = name;
        this.move = move;
        this.isHuman = isHuman;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setMove(char move) {
        this.move = move;
    }

    public void setIsHuman(boolean isHuman) {
        this.isHuman = isHuman;
    }

    // Getters
    public String getName() {
        return name;
    }

    public char getMove() {
        return move;
    }

    public boolean getIsHuman() {
        return isHuman;
    }
    
    // Abstract methods

    public void makeMove(Board board){
        // tbd
    }

    
}