package game.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;

public class ChessboardUI extends JFrame {
	
	  JLayeredPane layeredPane;
	  JPanel chessBoard;
	  JLabel chessPiece;
	  int xAdjustment;
	  int yAdjustment;
	
	public ChessboardUI() {
		Dimension boardSize = new Dimension(600, 600);
		 
		  //  Use a Layered Pane for this this application
		  layeredPane = new JLayeredPane();
		  getContentPane().add(layeredPane);
		  layeredPane.setPreferredSize(boardSize);
		 
		  //Add a chess board to the Layered Pane 
		 
		  chessBoard = new JPanel();
		  layeredPane.add(chessBoard, JLayeredPane.DEFAULT_LAYER);
		  chessBoard.setLayout( new GridLayout(8, 8) );
		  chessBoard.setPreferredSize( boardSize );
		  chessBoard.setBounds(0, 0, boardSize.width, boardSize.height);
		 
		  for (int i = 0; i < 64; i++) {
		  JPanel square = new JPanel( new BorderLayout() );
		  chessBoard.add( square );
		 
		  int row = (i / 8) % 2;
		  if (row == 0)
		  square.setBackground( i % 2 == 0 ? Color.white : Color.blue );
		  else
		  square.setBackground( i % 2 == 0 ? Color.red : Color.white );  //nicht fuer alle zugaenglich speicher 
		  }
		 
		  //Add a few pieces to the board
		 
		  JLabel piece = new JLabel(  );
		  JPanel panel = (JPanel)chessBoard.getComponent(0);
		  panel.add(piece);
		  piece = new JLabel();
		  panel = (JPanel)chessBoard.getComponent(15);
		  panel.add(piece);
		  piece = new JLabel();
		  panel = (JPanel)chessBoard.getComponent(16);
		  panel.add(piece);
		  piece = new JLabel();
		  panel = (JPanel)chessBoard.getComponent(20);
		  panel.add(piece);
		  
		  setDefaultCloseOperation(DISPOSE_ON_CLOSE );
		  pack();
		  setResizable(true);
		  setLocationRelativeTo( null );
		  setVisible(true);
		 
		  }
	}


