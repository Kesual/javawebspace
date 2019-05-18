package game_Controller.logic_Modell;

public class Spieler {

    String name;
    String farbe;

    public Spieler(String name, String farbe){

        this.name = name;

        if (farbe.equals("black") || farbe.equals("white")) {
            this.farbe = farbe;
        }
    }

}
