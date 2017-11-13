package CDIO3;

import gui_main.GUI;
import gui_codebehind.GUI_BoardController;
import gui_codebehind.GUI_FieldFactory;
import gui_fields.GUI_Board;
import gui_fields.GUI_Chance;
import gui_fields.GUI_Empty;
import gui_fields.GUI_Field;
import gui_fields.GUI_Street;





public class Main {

	public static void main(String[] args) {
		
		GUI gui = new GUI();
		
		initializeGUI();
		
		
	}

	
	
	
	
	private static void initializeGUI() {
		

		GUI_Field [] fields = new GUI_Field[40];
		
		for (int i = 0; i < 25; i++) {
			fields[i] = new GUI_Street();
			fields[i].setTitle("title1");
		}
		// Lav tomme felter som ikke skal bruges
		for (int i = 25; i <= fields.length; i++) {
			fields[i] = new GUI_Empty();
		}
		
		
	
	}

}
