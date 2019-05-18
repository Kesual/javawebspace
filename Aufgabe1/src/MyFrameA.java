import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrameA extends JFrame implements ActionListener {
	
	public MyFrameA (int title) {
		setTitle(title);

		/*
		* Automatisches setzen der Größe, falls nicht der Konstruktor genommen wird, in dem selbst die größe gesetz wird
		* Siehe auch MyFrameB
		*/

		setSize(200, 200);
		setClosePanel();
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public MyFrameA (int title, int width, int height) {
		setTitle(title);
		setSize(width, height);
		setClosePanel();
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}


	public MyFrameA(){
	    setClosePanel();
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

	private void setTitle(int title) {

		/*
	    Die Standardfunktion setTitle() von JFrame wird von MyFrameA so überschrieben, dass als Parameter ein
	    Integer-Wert übergeben werden muss. Dieser Wert wird durch String.valueOf in einen String umgewandelt, welcher
	    dann an die eigentliche setTitle() Funktion übergeben werden kann.
		 */

		String aTitle = String.valueOf(title);
		setTitle(aTitle);
	}

    @Override
    public void actionPerformed(ActionEvent e) {
        System.exit(0);
    }

    public void setClosePanel(){
        JPanel closePanel = new JPanel();
        JButton button = new JButton("Close");
        button.addActionListener(this);
        closePanel.add(button);
        this.add(closePanel, BorderLayout.PAGE_END);
    }
}
