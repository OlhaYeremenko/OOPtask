package Task1;

public class Timbrel extends Product {

	private double radius;
	private static double avgPrice=0;
	private static int count=0;

	public Timbrel() {
	}

	public Timbrel(double price, String name, double radius) {
		super(price, name);
		try {
			setRadius(radius);
			count++;
			avgPrice+=this.getPrice();
		} catch (IllegalArgumentException ex) {
			System.out.println(ex.getMessage());
		}
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		if (radius >= 0)
			this.radius = radius;
		else
			throw new IllegalArgumentException("Illegal radius");
	}
	
	public static double  getAvgPrice(){
		return Math.floor(avgPrice/count);
		}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("\n Timbrel: ");
		builder.append("[ Name=");
		builder.append(getName());
		builder.append(", Price=");
		builder.append(getPrice());
		builder.append(", Radius=");
		builder.append(getRadius());
		builder.append("]");
		return builder.toString();
	}


}
