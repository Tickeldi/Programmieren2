package programmieren.aufgabe4;

import de.pdbm.ewn.Color;
import de.pdbm.ewn.Field;
import de.pdbm.ewn.Move;
import de.pdbm.ewn.Position;
import de.pdbm.ewn.Tile;

public class Spielfeld implements Position {
	
	Tile[][] spielfeld = new Tile[5][5];
	boolean redsTurn = true;
	
	public Spielfeld(Tile[][] spielfeld, boolean redsTurn) {
		this.spielfeld = spielfeld;
		this.redsTurn = redsTurn;
	}
	
	@Override
	public Tile getTile(Field field) {
		return spielfeld[field.getX()][field.getY()];
	}

	@Override
	public Position init(Tile tile, Field field) {
		boolean isRed;
		
		Tile[][] spielfeld = this.spielfeld.clone();
		spielfeld[field.getX()][field.getY()] = tile;
		
		if(tile.isRed()) isRed = false;
		else isRed = true;
		
		return new Spielfeld(this.spielfeld, isRed);
	}

	@Override
	public Position makeMove(Move move) {
		boolean redsTurn;
		
		Tile[][] spielfeld = this.spielfeld.clone();
		spielfeld[move.getTo().getX()][move.getTo().getY()] = spielfeld[move.getFrom().getX()][move.getFrom().getY()];
		spielfeld[move.getFrom().getX()][move.getFrom().getY()] = null;
		
		if(spielfeld[move.getTo().getX()][move.getTo().getY()].isRed()) redsTurn = false;
		else redsTurn = true;
		
		return new Spielfeld(spielfeld, redsTurn);
	}

	@Override
	public Boolean isWinner(Color arg0) {
		if(arg0.equals(Color.RED)) {
			if(spielfeld[4][4] != null && spielfeld[4][4].isRed()) return true;
			if(numberOfPlayerTiles(Color.BLUE) == 0) return true;
		}
		else {
			if(spielfeld[1][1] != null && spielfeld[1][1].isBlue()) return true;
			if(numberOfPlayerTiles(Color.RED) == 0) return true;
		}
		
		
		return false;
	}
	
	private int numberOfPlayerTiles(Color arg0) {
		
		boolean isRed;
		if(arg0.equals(Color.RED)) isRed = true;
		else isRed = false;
		int numberOfTiles = 0;
		
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				if(spielfeld[i][j] != null && spielfeld[i][j].isRed() == isRed) numberOfTiles++;
			}
		}
		
		return numberOfTiles;
	}

	@Override
	public Color whoIsMoving() {
		if (this.redsTurn) return Color.RED;
		return Color.BLUE;
	}
	
	public String toString() {
		String returnString = "";
		
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				if(this.spielfeld[i][j] == null) {
					returnString = returnString + "--";
				}
				else {
					String farbe;
					if(this.spielfeld[i][j].isRed()) farbe = "R";
					else farbe = "B";
					returnString = returnString + farbe + this.spielfeld[i][j].getNumber();
				}
			}
			returnString = returnString + "\n";
		}
		
		return returnString;
	}

}
