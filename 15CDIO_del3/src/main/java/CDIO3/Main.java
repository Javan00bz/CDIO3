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
import gui_main.GUI;
import desktop_resources.*;


public class Main {

	private GUI gui = new GUI();
	private Player Player1;
	private Player Player2;
	private Player Player3;
	private Player Player4;
	private Player[] Players = {Player1, Player2, Player3, Player4};
	private GUI_Player GUI_Player1;
	private GUI_Player GUI_Player2;
	private GUI_Player GUI_Player3;
	private GUI_Player GUI_Player4;
	private GUI_Player[] GUI_Players = {GUI_Player1, GUI_Player2, GUI_Player3, GUI_Player4};
	private int startingMoney;
	public static void main(String[] args) {

		Main main = new Main();
		GUI_Field g = new GUI_Street();
		g.setTitle("TITLE1");
		g.setBackGroundColor(Color.blue);
		GUI_Field[] f = new GUI_Field[1];
		f[0] = g;
		new GUI(f);
		main.startGame();
		initializeGUI();


	}
	public void startGame() {
		gui.showMessage("Welcome");
		int amountOfPlayers = gui.getUserInteger("How many players are you", 2, 4);
		switch (amountOfPlayers) {
		case 2: startingMoney = 20;
		break;
		case 3: startingMoney = 18;
		break;
		case 4: startingMoney = 16;
		break;
		default: startingMoney = 20;
		}
		
		for(int i=0; i < amountOfPlayers; i++) {
			int j = 1;
			String playerName = gui.getUserString("Player " + j + " Enter your name" );
			Players[i]  = new Player(playerName, 1, startingMoney);
			GUI_Players[i] = new GUI_Player(playerName, startingMoney);
			gui.addPlayer(GUI_Players[i]);
			j++;
		}
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


