package CDIO3;

import CDIO3.Dice;

//Klasse for et raflebæger
public class DiceCup {
	private Dice[] dice;

	//Laver et raflebæger med et antal terninger
	public DiceCup(int i) {
		dice = new Dice[i];
		for (int j=0; j<i; j++) {
			dice[j] = new Dice(6);
		}

	}
	//Ruller raflebægeret
	public void rollDicecup() {
		for (int i = 0; i < dice.length; i++) {
			dice[i].rollDice();
		}
	}

	
	
	public Dice[] getDice() {
		return dice;
	}

	public void setDice(Dice[] dice) {
		this.dice = dice;
	}
	//Lægger terningernes værdi sammen
	public int getSum() {
		int sum=0;
		for (int i = 0; i < dice.length; i++) {
			sum+=dice[i].getFaceValue();
		}
		return sum;
	}


}
