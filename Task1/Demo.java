package Task1;

public class Demo {

	public static void main(String[] args) {

		Timbrel t1 = new Timbrel(120, "Epam �����", 50);
		Timbrel t2 = new Timbrel(100, "������ �����", 30);
		Timbrel t3 = new Timbrel(180, "�� ������ �����", 80);

		Cup c1 = new Cup(50, "������ �����", "�������");
		Cup c2 = new Cup(40, "������ �����", "������");
		System.out.println("������� ���� ����� : "+Timbrel.getAvgPrice());
		System.out.println("������� ���� ������� : "+Cup.getAvgPrice());

		Container<Product> c = new Container<Product>();
		c.add(t1);
		c.add(t2);
		c.add(t3);
		c.add(c1);
		c.add(c2);
		System.out.print("����������� ��������� � ��������� :");
		System.out.println(c.count());
		c.print();
		System.out.println("������������  �� ���� =)");
		c.sortPrice();
		c.print();
	}

}
