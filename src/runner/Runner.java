package runner;

import garage.Garage;
import vehicles.Car;

public class Runner {

	public static void main(String[] args) {
		
		Car carOne = new Car(1, "Sports", "ferrari", "red", "petrol", true, 2, 100000.00);
		
		Garage garage = new Garage();
		
		garage.addVehicle(carOne);
		
		System.out.println(carOne.calculateBill(carOne.getPrice(), carOne.isUsed(), carOne.getAge()));

	}

}

//public Car(int id, String type, String manufacturer, LocalDate yearOfManufacure, String colour, String fuelType, boolean isUsed, int numberOfDoors, double price)