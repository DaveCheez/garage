package runner;

import java.time.LocalDate;
import java.time.Month;

import garage.Garage;
import vehicles.Car;

public class Runner {

	public static void main(String[] args) {
	
		Car carOne = new Car(1, "Sports", "ferrari", LocalDate.of(2010, Month.JANUARY, 1), "red", "petrol", true, 2, 100000.00);
		
		Garage garage = new Garage();
		
		garage.addVehicle(carOne);
		
		System.out.println(carOne.calculateBill(carOne.getPrice(), carOne.isUsed(), carOne.getAge()));
		System.out.println(carOne.getAge());
		System.out.println(carOne.getPrice());
		System.out.println(carOne.isUsed());

	}

}

//public Car(int id, String type, String manufacturer, LocalDate yearOfManufacure, String colour, String fuelType, boolean isUsed, int numberOfDoors, double price)