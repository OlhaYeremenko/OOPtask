package Task1;

public abstract class Product {
	private double price;
	private String name;
	private static double avgPrice = 0;
	private static int count = 0;

	public Product() {

	}

	public Product(double price, String name) {
		try {
			this.price = price;
			this.name = name;
			count++;
			avgPrice += price;
		} catch (IllegalArgumentException ex) {
			System.out.println(ex.getMessage());
		}

	}

	public double getPrice() {
		return price;
	}

	public void setPrice(int price) {
		if (price >= 0)
			this.price = price;
		else
			throw new IllegalArgumentException("Illegal price");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static double getAvgPrice() {
		return Math.floor(avgPrice / count);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("\nProduct: ");
		builder.append("[ Name=");
		builder.append(getName());
		builder.append(", Price=");
		builder.append(getPrice());
		builder.append("]");
		return builder.toString();

	}

}
