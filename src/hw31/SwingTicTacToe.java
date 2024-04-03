import javax.swing.*;
import java.awt.*;

public class SwingTicTacToe extends JFrame {
    public static void main(String[] args) {
        new SwingTicTacToe();
    }

    public SwingTicTacToe (){
        setTitle("Tic Tac Toe");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500, 500);
        setLocationRelativeTo(null);

        TicTacToe.initTable();

        Canvas canvas = new Canvas();
        canvas.setBackground(Color.white);

        JButton btnInit = new JButton("Init");
        JButton btnExit = new JButton("Exit");


    }


}
