import java.awt.*;
import java.util.Scanner;

import javax.swing.*;

public class MyFrameB extends MyFrameA{

	public MyFrameB(int title, int number) {
		super(title);
		setSize(200, 200);
		setLayout(new FlowLayout(FlowLayout.LEADING));

		//Die Funktion wird im konstruktor aufgerufen, damit sie bei der Erschaffung des Objekts MyFrameB schon aktiviert wird
		setLabels(number);
		setVisible(true);
	}

	public MyFrameB(int title, int width, int height, int number) {
		super(title, width, height);
		// TODO Auto-generated constructor stub
		setLayout(new FlowLayout(FlowLayout.LEADING));
		setLabels(number);
		setVisible(true);
	}
	
	private void setLabels(int number) {
	    // Ein Objekt vom Typ Scanner wird erzeugt, damit Konsoleneingaben ermöglicht werden
		Scanner scan = new Scanner(System.in);

		// Die for-Schleife bekommt als Parameter eine Nummer, die n Sätze generieren lässt
		for (int i = 1; i <= number; i++) {
			System.out.println("Gib einen Satz ein:");
			
			String str = scan.nextLine();

			/*
			Am Ende eines Schleifendurchlaufes wird ein Objekt vom Typ JLabel generiert, welches als Wert den String
            (die Konsoleneingabe) übergeben bekommt. So wird der Satz dann auch im JLabel sichtbar sein
            */
			add(new JLabel(str));
		}
		//Am Ende wird der Scanner geschlossen
		scan.close();
	}

}
