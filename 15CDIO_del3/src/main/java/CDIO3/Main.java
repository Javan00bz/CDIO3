package CDIO3;

import gui_main.GUI;

import java.awt.Color;

import gui_codebehind.GUI_BoardController;
import gui_codebehind.GUI_FieldFactory;
import gui_fields.GUI_Board;
import gui_fields.GUI_Chance;
import gui_fields.GUI_Empty;
import gui_fields.GUI_Field;
import gui_fields.GUI_Street;
import gui_fields.GUI_Player;
import gui_fields.GUI_Start;
import gui_main.*;





public class Main {

	public static void main(String[] args) {
		
		GUI gui = new GUI();
		
		GUI_Field g = new GUI_Street();
		g.setTitle("TITLE1");
		g.setBackGroundColor(Color.blue);
		GUI_Field[] f = new GUI_Field[1];
		f[0] = g;
		new GUI(f);
		gui.showMessage("velkommen");
		
		
		
		//initializeGUI();
		
		
	}

	
	
	
	
	private static void initializeGUI() {
		

		GUI_Field [] fields = new GUI_Field[40];
		
		for (int i = 0; i < 25; i++) {
			fields[i] = new GUI_Street();
			fields[i].setTitle("title1");
		}
		// Lav tomme felter som ikke skal bruges
		for (int i = 25; i < fields.length; i++) {
			fields[i] = new GUI_Empty();
		}
		
		
		
	
	}

}
