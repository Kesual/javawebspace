package game_Controller.logic_Modell;

public class Schachbrett {
	
	Feld[][] feld = new Feld[8][8];
	
	public boolean bewegeFigur(Spielfigur figur,int sourceX,int sourceY,int destX,int destY) {
		
		return true;
		
	}
	
	public boolean checkeSieg() {
		
		return true;
	}
	
	public Schachbrett entferneFigur(int sourceX, int sourceY) {
		
		return this;
	}

}
