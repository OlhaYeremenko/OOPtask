package Humanity;

public class DemoStatic {

	public static void main(String[] args) {
		String name;
		String secondName;
		float height;
		float weight;
		boolean sex;

		Human Tonia = new Woman("Тоня", "Михайленко", 168, 55);
		Human Helen = new Woman("Лена", "Матвеева", 160, 52);
		Human Alex = new Man("Алекс", "Потати", 180, 85);
		Human Jamse = new Man("Джимми", "Бонд", 185, 90);

		
		System.out.println("Tonia, Helen");
		Human child0 = TestCompatibility.testCompatibility(Tonia, Helen);
		if (child0 == null) {
			System.out.println("Не срослось ) попробуйте кого то другого");
		} else
			System.out.println(child0.toString());
		
		System.out.println("Tonia, Alex");
		Human child = TestCompatibility.testCompatibility(Tonia, Alex);
		if (child == null) {
			System.out.println("Не срослось ) попробуйте кого то другого");
		} else
			System.out.println(child.toString());
		
		System.out.println("Tonia, Jamse");
		Human child1 = TestCompatibility.testCompatibility(Tonia, Jamse);
		if (child1 == null) {
			System.out.println("Не срослось ) попробуйте кого то другого");
		} else
			System.out.println(child1.toString());
		
		System.out.println("Alex, Jamse");
		Human child2 = TestCompatibility.testCompatibility(Alex, Jamse);
		if (child2 == null) {
			System.out.println("Не срослось ) попробуйте кого то другого");
		} else
			System.out.println(child2.toString());

	}

}
