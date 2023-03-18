/*
 * The Player class handles user choices for gameplay. It will be responsible for selecting 
 * the game board grid buttons. It would communicate with the GameLogic class to update the 
 * game state when a player makes a move. 
 * 
 */

 public class  Player {

    // Attributes

    private String name;
    private char symbol;
    private int[][] moves;
    private boolean isHuman;

    // Constructor
    public Player(String name,char symbol, int moves, boolean isHuman) {
        this.name = name;
        this.symbol = symbol;
        this.moves = new int[3][3];
        this.isHuman = isHuman;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setMove(int row, int col) {
        this.moves[row][col] = 1;
    }

    public void setIsHuman(boolean isHuman) {
        this.isHuman = isHuman;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int[][] getMove() {
        return this.moves;
    }

    public boolean getIsHuman() {
        return isHuman;
    }
    
    // Abstract methods

    public void makeMove(Board board){
        // tbd
    }

    
}