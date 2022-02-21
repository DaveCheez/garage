package garage;
import java.util.ArrayList;

import vehicles.Vehicle;

public class Garage {
	
	// Create empty list to store and remove vehicles
	private ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
	
	// Add vehicle to list
	public void addVehicle(Vehicle vehicle) {
		this.vehicles.add(vehicle);
	}
	
}
