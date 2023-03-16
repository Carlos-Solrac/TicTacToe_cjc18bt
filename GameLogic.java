/*
 * The GameLogic.class will handle the core game mechanics such as determining whose turn it is,
 * checking for wins or draws, and updating the game state. This class would not be responsible
 * for the user interface, but instead would communicate with the MainGame class to update the 
 * graphical representation of the game board.
 * 
 */

 public class GameLogic {
    
    private Player currentPlayer;
    private Player player1;
    private Player player2;
    private Board gameBoard;

    // Constructor
    public GameLogic(Player player1, Player player2, Board gameBoard) {
        this.currentPlayer = player1;
        this.player1 = player1;
        this.player2 = player2;
        this.gameBoard = gameBoard;
    }

    // Setters
    public void setCurrentPlayer(Player currentPlayer) {
        this.currentPlayer = currentPlayer;
    }

    public void setPlayer1(Player player1) {
        this.player1 = player1;
    }

    public void setPlayer2(Player player2) {
        this.player2 = player2;
    }

    public void setGameBoard(Board gameBoard) {
        this.gameBoard = gameBoard;
    }

    // Getters
    public Player getCurrentPlayer() {
        return currentPlayer;
    }

    public Player getPlayer1() {
        return player1;
    }

    public Player getPlayer2() {
        return player2;
    }

    public Board getGameBoard() {
        return gameBoard;
    }
    
}