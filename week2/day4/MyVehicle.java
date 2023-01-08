package week2.day4;

public class MyVehicle {

	public static void main(String[] args) {
		
		System.out.println("Calling AshokLeyLand Class methods()");
		AshokLeyland ashokLeyland = new AshokLeyland();
		ashokLeyland.engine();
		ashokLeyland.tyres();
		ashokLeyland.sizeOfTruck();
		ashokLeyland.capacity();
		ashokLeyland.price();
		System.out.println("");
		
		System.out.println("Calling Mahindra Class methods()");
		Mahindra mahindra = new Mahindra();
		mahindra.engine();
		mahindra.tyres();
		mahindra.fuel();
		mahindra.model();
	}
}
