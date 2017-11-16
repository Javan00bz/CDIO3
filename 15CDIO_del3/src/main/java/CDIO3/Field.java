package CDIO3;

public class Field {
	String nameOfField;
	int fieldNumber;

	public Field(String nameOfField, int fieldNumber) {
		this.nameOfField = nameOfField;
		this.fieldNumber = fieldNumber;
	}

	public String getNameOfField() {
		return nameOfField;
	}

	public void setNameOfField(String nameOfField) {
		this.nameOfField = nameOfField;
	}

	public int getFieldNumber() {
		return fieldNumber;
	}

	public void setFieldNumber(int fieldNumber) {
		this.fieldNumber = fieldNumber;
	}


}