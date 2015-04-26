package Task1;

public class Cup extends Product {

	private String color;
	private static double avgPrice = 0;
	private static int count = 0;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		if(color!=null)
		this.color = color;
		else
			throw new IllegalArgumentException("Illegal cupe count");
	}

	public Cup(String color) {
		this.color = color;

	}

	public Cup() {
	}

	public Cup(double price, String name, String color) {
		super(price, name);
		setColor(color);
		count++;
		avgPrice += this.getPrice();
	}

	public static double getAvgPrice() {
		return Math.floor(avgPrice / count);
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("\nCup: ");
		builder.append("[ Name=");
		builder.append(getName());
		builder.append(", Price=");
		builder.append(getPrice());
		builder.append(", Color=");
		builder.append(getColor());
		builder.append("]");
		return builder.toString();
	}

}
