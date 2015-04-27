package Humanity;

import java.util.Random;
import java.util.Scanner;

public class Woman extends Human {

	public Woman(String name, String secondName, float height, float weight) {
		super(name, secondName, height, weight, false);
	}

	/*- ��� (String) - ������ � �������
	 - ������� (String) - ������� � ���������� � ������� �����
	 - ���� (float) - ���������� � ���������������� ���������� � ����� �� ����� + 0.1*(���� ���������� ���������������� ���� ����� ���� ����������� ����������)
	 - ��� (float) - ���������� �����*/

	public Human giveBirth(Man man) {
		Scanner sr = new Scanner(System.in);

		Random random = new Random();
		Human result = null;
		float resHeight;
		float resWeight;
		if (random.nextDouble() <= 0.5) {
			System.out
					.println(" ���������� � ��� �������! ������� ��� �������  ");

			resWeight = (float) (getWeight() + 0.1 * (man.getWeight() - getWeight()));
			resHeight = (float) (getHeight() + 0.1 * (man.getHeight() - getHeight()));
			result = new Woman(sr.nextLine(), man.getSecondName(), resHeight,
					resWeight);
		} else {
			System.out
					.println(" ���������� � ��� �������! ������� ��� �������  ");

			resWeight = (float) (getWeight() + 0.1 * (getWeight() - man
					.getWeight()));
			resHeight = (float) (getHeight() + 0.1 * (getHeight() - man
					.getHeight()));
			result = new Man(sr.nextLine(), man.getSecondName(), resHeight,
					resWeight);
		}
		return result;
	}

	public Human testCompatibility() {
		// TODO Auto-generated method stub
		return null;
	}

}
