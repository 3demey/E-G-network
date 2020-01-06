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
		this._display = ; //this._display = this._rank + this._suit;	Separate between 1-10 to JQKA.
	}
}
