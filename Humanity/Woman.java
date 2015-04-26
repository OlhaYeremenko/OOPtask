package Humanity;

import java.util.Random;

public class Woman extends Human {

	public Woman(String name, String secondName, float height, float weight,
			boolean sex) {
		super(name, secondName, height, weight, sex);
	}

	/*- ��� (String) - ������ � �������
	 - ������� (String) - ������� � ���������� � ������� �����
	 - ���� (float) - ���������� � ���������������� ���������� � ����� �� ����� + 0.1*(���� ���������� ���������������� ���� ����� ���� ����������� ����������)
	 - ��� (float) - ���������� �����*/

	public Human giveBirth(String name, Man man) {
		Random random = new Random();
		Human result = null;
		float resHeight;
		float resWeight;
		if (random.nextDouble() <= 0.5) {
			resWeight = (float) (this.getWeight() + 0.1 * (man.getWeight() - this
					.getWeight()));
			resHeight = (float) (this.getHeight() + 0.1 * (man.getHeight() - this
					.getHeight()));
			result = new Woman(name, man.getSecondName(), resHeight, resWeight,
					true);
		} else {
			resWeight = (float) (this.getWeight() + 0.1 * (this.getWeight() - man
					.getWeight()));
			resHeight = (float) (this.getHeight() + 0.1 * (this.getHeight() - man
					.getHeight()));
			result = new Man(name, man.getSecondName(), resHeight, resWeight,
					true);
		}
		return result;
	}


}
