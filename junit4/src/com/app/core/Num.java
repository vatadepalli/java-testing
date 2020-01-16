package com.app.core;

public class Num {
	private int number;

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int storeNumber(int n) {
		if (n > 100)
			number = 100;
		else if (n < 0)
			number = 0;
		else
			number = n;

		return number;
	}

}
