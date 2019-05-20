package game_Controller.logic_Modell;

public class Schach {

    Spieler weiss;
    Spieler schwarz;
    Schachbrett brett;
    

    public Schach(Spieler spieler1, Spieler spieler2){

        this.weiss = spieler1;
        this.schwarz = spieler2;

    }

    public void waehleFigur (Spieler spieler) {
    	
    }
    
    public void spielStartet() {
    	
    }
    
    public Spieler siegerVerkuenden() {
    
    	return weiss;
    }

}
