package game_Controller.logic_Modell;

public class Schach {

    Spieler spieler1;
    Spieler spieler2;

    public Schach(Spieler spieler1, Spieler spieler2){

        this.spieler1 = spieler1;
        this.spieler2 = spieler2;

    }

    public boolean pruefeSieg(Spielfigur[][] feld){

        for (int i = 0 ; i < feld.length ; i++) {
            for (int j = 0; j < feld[i].length; j++ ){

                if (feld[i][j])

            }
        }

        return true;
    }

    public void wechseln(){

    }

}
