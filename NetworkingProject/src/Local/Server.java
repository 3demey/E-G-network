package Local;
import java.util.*;

public class Server {
	private Deck _drawPile; // A pile for dealer to draw from.
	private int round;
	
	
	Server() {
		this._drawPile = new Deck();
	}
	// public void reply() {} - answer to a request.
	public Card accept() {return null;}
	public void deny() {}
	public void resultMsg(int round) {
		System.out.println("The result of round" + round + ":");
		//if dealer > player
		System.out.println("Dealer won " + );
	}
	public void finalResultMsg(int round) {}
	public void terminateConnection() {}
	public void currentStatus() {}
	public void playerQuit() {}
}
