import javax.swing.*;
import java.awt.*;

public class MyFrameC extends MyFrameA{
	
	public MyFrameC (String title, int quad, int[] list) {
		setTitle(title);

		//setSize bekommt zweimal den Wert quad übergeben, JFrame wird so quadratisch
        setSize(quad, quad);
        setLayout(new FlowLayout(FlowLayout.LEADING));
        showNumbers(list);
        setVisible(true);
	}

	public void showNumbers(int[] array){
	    String str;

	    for (int i = 0; i <= array.length-1; i++){

	        str = String.valueOf(array[i]);
	        add(new JLabel(str));

        }

    }

}
