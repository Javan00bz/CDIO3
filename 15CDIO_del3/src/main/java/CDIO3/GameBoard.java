package CDIO3;

import CDIO3.Field;
public class GameBoard {

	int [] Player = {1, 2, 3};
	Field[] fields = new Field[40];
	
	public GameBoard(Field[] fields){
		this.fields = fields;
	}
}

