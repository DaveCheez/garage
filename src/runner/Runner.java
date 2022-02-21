package runner;

import java.time.LocalDate;
import java.time.Month;

import garage.Garage;
import vehicles.Car;

public class Runner {

	public static void main(String[] args) {
	
		Car carOne = new Car(1, "Sports", "Ferrari", LocalDate.of(2010, Month.JANUARY, 1), "red", "petrol", true, 2, 100000.00);
		Car carTwo = new Car(2, "Prestige", "Lexus", LocalDate.of(2018, Month.JANUARY, 1), "black", "petrol", true, 2, 65000.00);
		Car carThree = new Car(3, "City Car", "Toyota", LocalDate.of(2012, Month.JANUARY, 1), "blue", "petrol", true, 2, 12000.00);
		Car carFour = new Car(4, "SUV", "Range Rover", LocalDate.of(2005, Month.JANUARY, 1), "champagne", "diesil", true, 2, 80000.00);
		Car carFive = new Car(5, "Estate", "Vauxhall", LocalDate.of(2001, Month.JANUARY, 1), "silver", "diesil", true, 2, 26000.00);
		
		Garage garage = new Garage();
		
		garage.addVehicle(carOne);
		garage.addVehicle(carTwo);
		garage.addVehicle(carThree);
		garage.addVehicle(carFour);
		garage.addVehicle(carFive);
		
//		System.out.println(carOne.getAge());
//		System.out.println(carOne.getPrice());
//		System.out.println(carOne.isUsed());

		System.out.println(carOne.toString());
		System.out.println("Todays price is £" + (int) carOne.calculateBill(carOne.getPrice(), carOne.isUsed(), carOne.getAge()));
		
		System.out.println(carTwo.toString());
		System.out.println("Todays price is £" + (int) carTwo.calculateBill(carTwo.getPrice(), carTwo.isUsed(), carTwo.getAge()));
		
		System.out.println(carThree.toString());
		System.out.println("Todays price is £" + (int) carThree.calculateBill(carThree.getPrice(), carThree.isUsed(), carThree.getAge()));

		System.out.println(carFour.toString());
		System.out.println("Todays price is £" + (int) carFour.calculateBill(carFour.getPrice(), carFour.isUsed(), carFour.getAge()));

		System.out.println(carFive.toString());
		System.out.println("Todays price is £" + (int) carFive.calculateBill(carFive.getPrice(), carFive.isUsed(), carFive.getAge()));

	}

}

//public Car(int id, String type, String manufacturer, LocalDate yearOfManufacure, String colour, String fuelType, boolean isUsed, int numberOfDoors, double price)