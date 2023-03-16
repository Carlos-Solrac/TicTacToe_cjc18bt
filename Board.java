import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/*
 * The game board is a 3x3 grid. Buttons are used to allow users/cpu to interact with the board. On action the board should be marked
 * with the players marker to claim the spot. It will communicate with the MainGame class to update the game board as play progresses.
 */

public class Board extends JPanel {
    public Board() {
        setLayout(new GridLayout(3, 3));
        for (int i = 0; i < 9; i++) {
            JButton button = new JButton();
            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    // handle button click here
                }
            });
            add(button);
        }
    }
}

// This basic implementation will eventually evolve to include a custom background with custom player markers.
