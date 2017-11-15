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
import desktop_resources.*;


public class Main {

	private GUI gui = new GUI();
	private Player Player1;
	private Player Player2;
	private Player Player3;
	private Player Player4;
	Player[] Players = {Player1, Player2, Player3, Player4};
	private int startingMoney;
	public static void main(String[] args) {

		GUI_Player hej = new GUI_Player();
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
		int amountOfPlayers = gui.getUserInteger("Hvor mange spillere er i?", 2, 4);
		switch (amountOfPlayers) {
		case 2: startingMoney = 20;
		break;
		case 3: startingMoney = 18;
		break;
		case 4: startingMoney = 16;
		break;
		default: startingMoney = 20;
		}
		
		for(int i=1; i <= amountOfPlayers; i++) {
			String playerName = gui.getUserString("Player " + i + " Enter your name" );
			Players[i]  = new Player(playerName, 1, startingMoney);
		}
		for(int i=1; i <= amountOfPlayers; i++) {
			GUI.addPlayer(Players[i].getName(), Players[i].getAccount().getValue());
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


