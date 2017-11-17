package CDIO3;

import CDIO3.Account;
import gui_fields.GUI_Player;

//Klasse for spillets spillere
public class Player extends GUI_Player {
	
	private int position;
	private Account account;
	
	public Player(String name, int balance, int position) {
		super(name, balance);
		this.position = position;
		this.account = new Account(balance);
	}

	
	public Account getAccount() {
		return account;
	}
	
	public int getPosition()
	{
		return position;
	}
	
	public void setPosition(int newPosition)
	{
		position = newPosition;
	}
}

