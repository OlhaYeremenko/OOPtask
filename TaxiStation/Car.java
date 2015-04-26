package TaxiStation;

public abstract class Car implements Comparable<Car> {

	private String name;
	private String brand;
	private double price;
	private double fuelConsumption;
	private double mileage;
	private double speedSettings;

	public Car(String name, String brand, double price, double fuelConsumption,
			double mileage, double speedSettings) {
		try {
			setBrand(brand);
			setName(name);
			setPrice(price);
			setFuelConsumption(fuelConsumption);
			setMileage(mileage);
			setSpeedSettings(speedSettings);
			/*
			 * this.name = name; this.brand = brand; this.price = price;
			 * this.fuelConsumption = fuelConsumption; this.mileage = mileage;
			 * this.speedSettings = speedSettings;
			 */
		} catch (IllegalArgumentException ex) {
			System.out.println(ex.getMessage());
		}
	}

	// private double bodyType;
	public String getName() {
		return name;
	}

	public String getBrand() {
		return brand;
	}

	public double getPrice() {
		return price;
	}

	public double getFuelConsumption() {
		return fuelConsumption;
	}

	public double getMileage() {
		return mileage;
	}

	public double getSpeedSettings() {
		return speedSettings;
	}

	public void setName(String name) {
		this.name = name;

	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setPrice(double price) {
		if (price >= 0)
			this.price = price;
		else
			throw new IllegalArgumentException("Illegal price");
	}

	public void setFuelConsumption(double fuelConsumption) {
		if (fuelConsumption >= 0)
			this.fuelConsumption = fuelConsumption;
		else
			throw new IllegalArgumentException("Illegal fuel consumption");
	}

	public void setMileage(double mileage) {
		if (mileage >= 0)
			this.mileage = mileage;
		else
			throw new IllegalArgumentException("Illegal mileage");
	}

	public void setSpeedSettings(double speedSettings) {
		if (speedSettings >= 0)
			this.speedSettings = speedSettings;
		else
			throw new IllegalArgumentException("Illegal speed  settings");
	}

	public int compareTo(Car o) {
		if (o.getFuelConsumption() > this.getFuelConsumption())
			return 1;
		else if (o.getFuelConsumption() < this.getFuelConsumption())
			return -1;
		else
			return 0;
	}

}
