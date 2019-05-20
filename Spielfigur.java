package game_Controller.logic_Modell;

public class Spielfigur {

    String symbol;
    String[] color = {"weiss", "schwarz"};

    public Spielfigur zeigeSpielfigur() {
    	return this;
    }
    
    public Wege zeigeWeg(int sourceX,int sourceY,int destX,int destY) {
    	
    	return new Wege();
    	
    }

}
