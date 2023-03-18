import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/*
 * The game board is a 3x3 grid. Buttons are used to allow users/cpu to interact with the board. On action the board should be marked
 * with the players marker to claim the spot. It will communicate with the MainGame class to update the game board as play progresses.
 */


public class Board {
    // Hold the state of the board as a 2d Array to handle changes of the game.
    private char [][] boardState;
    // Hold buttons for game board.
    private JButton[][] buttons; 
    // Main Jframe
    private JFrame frame;

    // Constructor
    public Board() {
       
        // initialize the board with empty cells
            boardState = new char [3][3];
            for( int i =0; i < 3; i++){
                for(int j= 0; j < 3; j++){
                    boardState[i][j] = '-';
                }
            }
        
        
        // GUI for the board
        frame = new JFrame("FSU Tic-Tac-Toe");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,400);
        GridLayout grid = new GridLayout(3,3);
        frame.setLayout(grid);
        frame.setResizable(false);
        // Add buttons to the board in a 3x3 grid format.
        buttons = new JButton[3][3];
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                buttons[i][j] = new JButton();
                buttons[i][j].addActionListener(new ButtonListener(i, j));
                frame.add(buttons[i][j]);
            }
        }
        frame.setVisible(true);
    }
    // Methods

    /*
     *  The updateBoardState() is meant to update the boardstate to have the matching symbols of each player. For now it'll be an X and O and later maybe images. The button
     * should also be updated.
     */
     public void updateBoardState(int row, int col, char symbol){
       boardState[row][col] = symbol;
       buttons[row][col].setText(Character.toString(symbol)); // add the symbol to the button
       buttons[row][col].setEnabled(false); // button can't be used anomore.
     }

    /*
     *  Returns true if all play spots are taken, which gets sent back to the mainGame driver to end the game as a draw.
     */
    public boolean fullBoardState (){
        // check if the board is full
        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 3; j++){
                if(boardState[i][j] == '-')
                {return false;}
            }
        }
        return true;
    }

    // class to handle the button clicks. It takes the button clicks and updates the game board. It needs to use the symbol from
    // the player so there needs to be a passing of the symbol from the main class to this class.
    private class ButtonListener implements ActionListener {
        private int row;
        private int col;
        private char symbol;

        // Need to add a way to pass in the players symbol X or O for now and later images.
        public ButtonListener(int row, int col) {
            this.row = row;
            this.col = col;

        }

        public void actionPerformed(ActionEvent e) {
            // handle the button click by updating the board and disabling the button
            updateBoardState(row, col, symbol);
        }
    }
    
}

// This basic implementation will eventually evolve to include a custom background with custom player markers.
