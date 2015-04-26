package TaxiStation;

public class PassengerCar extends Car {

	BodyType bodyType;

	public PassengerCar(String name, String brand, double price,
			double fuelConsumption, double mileage, double speedSettings,
			BodyType bodyType) {
		super(name, brand, price, fuelConsumption, mileage, speedSettings);
		
		this.bodyType = bodyType;
		
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("\nCar: ");
		builder.append("[ Name=");
		builder.append(getName() );
		builder.append(", Brand=");
		builder.append(getBrand());
		builder.append(", Price=");
		builder.append(getPrice());
		builder.append(", Fuel Consumption=");
		builder.append(getFuelConsumption());
		builder.append(", Mileage=");
		builder.append(getMileage());
		builder.append(", Speed Settings=");
		builder.append(getSpeedSettings());
		builder.append(", Body Type=");
		builder.append(this.bodyType);
		builder.append("]");
		return builder.toString();

	}
		
}
