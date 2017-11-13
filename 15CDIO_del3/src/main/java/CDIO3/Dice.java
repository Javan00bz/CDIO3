package CDIO3;

//Klasse for en terning
public class Dice {
		 
		private int faceValue;
		
		//Opretter en terning med et antal øjne
		public Dice(int value) {
			value = faceValue;
		}
		//Ruller terningen
		public int rollDice() {
			faceValue = (int)(Math.random()*6+1);
			return faceValue;
		}

		public int getFaceValue() {
			return faceValue;
		}
		
		public void setFaceValue(int newFaceValue) {
			faceValue = newFaceValue;
	}
}