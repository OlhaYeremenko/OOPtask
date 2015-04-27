package Humanity;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		String name;
		String secondName;
		float height;
		float weight;
		boolean sex;
		Scanner sr = new Scanner(System.in);
		Human h1 = null;
		Human h2 = null;
		Human child = null;
		boolean status = true;
		int count = 1;
		try {

			while (count < 3) {

				System.out.println("������� ��������. ������� ���  ");
				name = sr.next();
				System.out.println("������� ��������. ������� �������  ");
				secondName = sr.next();
				System.out.println("������� ��������. ������� ���� ");
				weight = sr.nextFloat();
				System.out.println("������� ��������. ������� ��� ");
				height = sr.nextFloat();

				System.out.println("������� ��������. �������/������� .. 1/0 ");
				int s = sr.nextInt();
				if (s == 1) {
					sex = true;
					h1 = new Man(name, secondName, weight, height);
					System.out.println(h1.toString());

				} else if (s == 0) {
					sex = false;
					h2 = new Woman(name, secondName, weight, height);
					System.out.println(h2.toString());

				} else {
					System.out
							.println(" -1 ��� 1 ������ ��������� ���. ����� ������ ��������!");
					break;
				}
				count++;
			}
		} catch (InputMismatchException ex) {
			System.out.println("�� ������ ����. ");

		} catch (NumberFormatException ex) {
			System.out.println("�� ������ ������ ���������. ");

		}

		System.out.println("��������� ���� �� �������������");
		child = TestCompatibility.testCompatibility(h1, h2);
		if (child == null) {
			System.out.println("�� �������� ) ���������� ���� �� �������");
		} else
			System.out.println(child.toString());
	}

}
