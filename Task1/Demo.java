package Task1;

public class Demo {

	public static void main(String[] args) {

		Timbrel t1 = new Timbrel(120, "Epam бубен", 50);
		Timbrel t2 = new Timbrel(100, "Другой бубен", 30);
		Timbrel t3 = new Timbrel(180, "По больше бубен", 80);

		Cup c1 = new Cup(50, "Сашина чашка", "зеленый");
		Cup c2 = new Cup(40, "Тонина чашка", "желтый");
		System.out.println("Средняя цена бубна : "+Timbrel.getAvgPrice());
		System.out.println("Средняя цена чашечки : "+Cup.getAvgPrice());

		Container<Product> c = new Container<Product>();
		c.add(t1);
		c.add(t2);
		c.add(t3);
		c.add(c1);
		c.add(c2);
		System.out.print("Колличество елементов в коллекции :");
		System.out.println(c.count());
		c.print();
		System.out.println("Сортировочка  по цене =)");
		c.sortPrice();
		c.print();
	}

}
