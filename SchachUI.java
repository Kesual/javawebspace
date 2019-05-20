package game_Controller.ui_View;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;

public class SchachUI extends JFrame {
	
 public SchachUI() {
	 this.setTitle("Schach");
	 Dimension boardSize = new Dimension(600, 600);
	 
	 JLayeredPane layeredPane = new JLayeredPane();
	 getContentPane().add(layeredPane);
	 layeredPane.setPreferredSize(boardSize);
	 
	 this.setPreferredSize(boardSize);
	 
	 for (int i = 0; i < 7; i++) {
		for (int j = 0; j < 7; j++) {
			JPanel panel = new JPanel();
			
			
			this.add(panel);
		}
	}
	 
	 this.setVisible(true);
 }

}
