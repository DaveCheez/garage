package vehicles;

import java.time.LocalDate;

public class Car extends Vehicle {
	
	private int numberOfDoors;

	public Car(int id, String type, String manufacturer, LocalDate yearOfManufacure, String colour, String fuelType, boolean isUsed, int numberOfDoors, double price) {
		super(id, type, manufacturer, yearOfManufacure, colour, fuelType, isUsed, price);
		this.numberOfDoors = numberOfDoors;

	}

	public int getNumberOfDoors() {
		return numberOfDoors;
	}

	public void setNumberOfDoors(int numberOfDoors) {
		this.numberOfDoors = numberOfDoors;
	}

}
