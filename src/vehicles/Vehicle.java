package vehicles;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class Vehicle {

	private int id;
	private String type;
	private String manufacturer;
	private String colour;
	private String fuelType;
	private boolean isUsed;
	private double price;
	
	private LocalDate yearOfManufacture = LocalDate.of(2010, Month.JANUARY, 1);
	private LocalDate today = LocalDate.now();
	private Period p = Period.between(yearOfManufacture, today);
	private int age = p.getYears();

	public Vehicle() { }

	public Vehicle(int id, String type, String manufacturer, LocalDate yearOfManufacture, String colour, String fuelType, boolean isUsed,
			double price) {
		this.id = id;
		this.type = type;
		this.manufacturer = manufacturer;
		this.yearOfManufacture = yearOfManufacture;
		this.colour = colour;
		this.fuelType = fuelType;
		this.isUsed = isUsed;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public LocalDate getYearOfManufacture() {
		return yearOfManufacture;
	}

	public void setYearOfManufacture(LocalDate yearOfManufacture) {
		this.yearOfManufacture = yearOfManufacture;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	public boolean isUsed() {
		return isUsed;
	}

	public void setUsed(boolean isUsed) {
		this.isUsed = isUsed;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	
	
	public double calculateBill(double price, boolean isUsed, int age) {
		this.price = price;
		this.age= age;
		this.isUsed = isUsed;
		double bill = 0;
		int deppercent = 1;

		if (isUsed == false) {
			bill = price;
		} else {
			 for(int i=1; i<age; i++) {
				 bill=((100-deppercent)*bill)/100;
			}
		}
		
		return bill;
	}
//	
//	 amount=100000;
	 
//	 year=3;
//	 temp=price;
//	 for(int i=0;i<year;i++)
//	 bill=((100-deppercent)*temp)/100;

	// Depreciation Amount = Asset Value x Annual Percentage

	//Balance = Asset Value - Depreciation Value

	
	@Override
	public String toString() {
		return "Vehicle [id=" + id + ", type=" + type + ", manufacturer=" + manufacturer + ", colour=" + colour
				+ ", fuelType=" + fuelType + ", isUsed=" + isUsed + ", price=" + price + "]";
	}

}
