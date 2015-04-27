package Humanity;

import java.util.Random;
import java.util.Scanner;

public class Woman extends Human {

	public Woman(String name, String secondName, float height, float weight) {
		super(name, secondName, height, weight, false);
	}

	/*- им€ (String) - ввести с консоли
	 - фамили€ (String) - беретс€ у экземпл€ра с мужским полом
	 - рост (float) - копируетс€ у соответствующего экземпл€ра с таким же полом + 0.1*(рост экземпл€ра противоположного рода минус рост однородного экземпл€ра)
	 - вес (float) - аналогично росту*/

	public Human giveBirth(Man man) {
		Scanner sr = new Scanner(System.in);

		Random random = new Random();
		Human result = null;
		float resHeight;
		float resWeight;
		if (random.nextDouble() <= 0.5) {
			System.out
					.println(" ѕоздравл€ю у вас девочка! ¬ведите им€ ребенка  ");

			resWeight = (float) (getWeight() + 0.1 * (man.getWeight() - getWeight()));
			resHeight = (float) (getHeight() + 0.1 * (man.getHeight() - getHeight()));
			result = new Woman(sr.nextLine(), man.getSecondName(), resHeight,
					resWeight);
		} else {
			System.out
					.println(" ѕоздравл€ю у вас мальчик! ¬ведите им€ ребенка  ");

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
