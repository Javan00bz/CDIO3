package CDIO3;

public class RideField extends Field {

	int price;
	int rent;

	public RideField(String nameOfField, int fieldNumber, int price, int rent) {
		super(nameOfField, fieldNumber);
		this.price = price;
		this.rent = rent;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getRent() {
		return rent;
	}

	public void setRent(int rent) {
		this.rent = rent;
	}

}
