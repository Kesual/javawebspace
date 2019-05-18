package game.ui;

import javax.swing.*;

public class uiController extends JFrame {

    public uiController(int width, int height, String title){

        this.setTitle(title);
        this.setSize(width, height);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

    }

}
