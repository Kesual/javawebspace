import javax.swing.*;
import java.awt.*;

public class MyFrameD extends MyFrameA{

    public MyFrameD(int title, String form, int anzahl) {
        super(title);
        setSize(200, 200);
        setLayout(new GridBagLayout());
        setPanels(form, 200 - 50, 200 - 50, anzahl);
        setVisible(true);
    }

    public MyFrameD(int title, int width, int height, String form, int anzahl) {
        super(title, width, height);
        setLayout(new GridBagLayout());
        setPanels(form, width - 50, height - 50, anzahl);
        setVisible(true);
    }

    public void setPanels(String form, int width, int height, int anzahl){

        for (int i = 0; i < anzahl; i++){

            add(new MyPanel(form, width, height), new GridBagConstraints());

        }


    }

}
