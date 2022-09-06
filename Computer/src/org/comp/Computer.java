package org.comp;

public class Computer extends Desktop {

	public void computerModel() {
		System.out.println("Computer Model:Hp i3 ");
	}

	public static void main(String[] args) {

		Computer c = new Computer();
		c.computerModel();
		c.desktopSize();
	}

}
