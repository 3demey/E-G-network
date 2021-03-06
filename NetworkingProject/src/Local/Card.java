package Local;
import java.util.*;

public class Card {
	private int _rank; // The rank of the card will be its value. As J=11,Q=12,K=13,A=14 - as the ace is the trump card.
	private char _suit; // The suit does not affect our card in a war.
	private String _display;
	
	public void print() {
		System.out.println((_display));
	}
	
	Card(int r, char s){
		this._rank = r;
		this._suit = s;
		if (this._rank < 11)
			this._display = Integer.toString(this._rank) + Character.toString(this._suit);
		else if (this._rank == 11)
			this._display = "J" + Character.toString(this._suit);
		else if (this._rank == 12)
			this._display = "Q" + Character.toString(this._suit);
		else if (this._rank == 13)
			this._display = "K" + Character.toString(this._suit);
		else if (this._rank == 14)
			this._display = "A" + Character.toString(this._suit);
	}
}
