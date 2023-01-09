package org.system;

public class Desktop {
	
	public static void main(String[] args) {
		
		Computer computer = new Computer();
		computer.computerModels();
		System.out.println("");
		
		Desktop desktop = new Desktop();
		desktop.desktopSize();
	}
	
	public void desktopSize() {
		System.out.println("Desktop: destopSize() method");
	}

}
