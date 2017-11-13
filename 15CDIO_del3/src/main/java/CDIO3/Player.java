package CDIO3;

import CDIO3.Account;

//Klasse for spillets spillere
public class Player {
	
	private String name;
	int position;
	private Account Account;
	
	//Konstruktør. Laver en spiller med navn, placering og opretter en ny konto med en givet værdi.
	public Player(String userString, int p, int i) {
		this.Account = new Account(i);
		this.name = userString;
		this.position = p;
	}
	
	public Account getAccount() {
		return Account;
	}

	public String getName()
	{
		return name;
	}
	
	public void setName(String newName)
	{
		name = newName;
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

