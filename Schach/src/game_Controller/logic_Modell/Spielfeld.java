package game_Controller.logic_Modell;

public class Spielfeld {

    Schach spiel;

    public Spielfeld(Schach spiel){

        this.spiel = spiel;

    }

    protected Spielfigur[][] baueSpielfeld(){

        return new Spielfigur[8][8];
    }

}
