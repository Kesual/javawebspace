import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

public class MyPanel extends JPanel {

    String form;
    int width;
    int height;

    public MyPanel(String form, int width, int height){
        this.form = form;
        this.width = width;
        this.height = height;

        switch (form){
            case "Quadrat":
                this.setPreferredSize(new Dimension(width, height));
                break;
            case "Kreis":
                this.setPreferredSize(new Dimension(width, height));
                break;
            case "Rechteck":
                this.setPreferredSize(new Dimension(width, height));
                break;
        }

        this.setPreferredSize(new Dimension(width, height));
    }

        public void paint (Graphics g){

            switch (form){

                case "Quadrat":
                    Graphics2D g1 = (Graphics2D) g;
                    Rectangle2D q1 = new Rectangle2D.Double(0, 0, width, height);
                    g1.setPaint(Color.BLUE);
                    g1.fill(q1);
                    break;

                case "Kreis":
                    Graphics2D g2 = (Graphics2D) g;
                    Ellipse2D e1 = new Ellipse2D.Double(0, 0, width, height);
                    g2.setPaint(Color.BLUE);
                    g2.fill(e1);
                    break;

                case "Rechteck":
                    Graphics2D g3 = (Graphics2D) g;
                    Rectangle2D r1 = new Rectangle2D.Double(0, 50, width, (height - 100));
                    g3.setPaint(Color.BLUE);
                    g3.fill(r1);
                    break;

                case "Dreieck":
                    Graphics2D g4 = (Graphics2D) g;
                    int x[]={125,25, 225};
                    int y[]={25,225, 225};
                    g4.setColor(Color.BLUE);
                    g4.fillPolygon(x, y, 3);
            }
        }

}
