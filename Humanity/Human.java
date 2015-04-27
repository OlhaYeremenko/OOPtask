package Humanity;

import java.util.Random;
import java.util.Scanner;

public abstract class Human implements IHumanable {

	private String name;
	private String secondName;
	private float height;
	private float weight;
	private boolean sex;

	public Human() {
	};

	public Human(String name, String secondName, float height, float weight,
			boolean sex) {
		setName(name);
		setSecondName(secondName);
		setHeight(height);
		setWeight(weight);
		setSex(sex);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (isInteger(name) != true)
			this.name = name;
		else
			throw new IllegalArgumentException("Illegal name");
	}

	public String getSecondName() {
		return secondName;
	}

	public void setSecondName(String secondName) {
		if (isInteger(secondName) != true)
			this.secondName = secondName;
		else
			throw new IllegalArgumentException("Illegal secondName");
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		if (Float.valueOf(height) != null)
			this.height = height;
		else
			throw new IllegalArgumentException("Illegal height");
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		if (Float.valueOf(weight) != null)
			this.weight = weight;
		else
			throw new IllegalArgumentException("Illegal weight");
	}

	public boolean isSex() {
		return sex;
	}

	private String sexString;

	public void setSex(boolean sex) {
		sexString = null;
		if (sex == false) {
			sexString = "Woman";
		}
		if (sex == true) {
			sexString = "Man";
		}

		this.sex = sex;
	}

	public boolean isInteger(String input) {
		try {
			Integer.parseInt(input);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public boolean speak(Human h2) {
		if (isSex() && h2.isSex()) {
			if (Math.random() < 0.5)
				return true;
		}
		return true;

	}

	public boolean suffer(Human h2) {
		Random random = new Random();
		if (isSex() == true && h2.isSex() == true) {
			if (random.nextDouble() <= 0.056)
				return false;
		} else if ((isSex() == false && h2.isSex() == true)
				|| (isSex() == true && h2.isSex() == false)) {
			if (random.nextDouble() <= 0.7)
				return false;
		}
		if (random.nextDouble() <= 0.05)
			return false;

		return true;
	}

	/*- проводить врем€ вместе (возвращает boolean)
	 если рост экземпл€ров отличаетс€ более чем на 10%, метод возвращает true с веро€тностью 0.85
	 если рост экземпл€ров отличаетс€ менее чем на 10%, метод возвращает true с веро€тностью 0.95*/

	public boolean spendTime(Human h2) {
		Random random = new Random();
		if (Math.abs(getHeight() - h2.height) > getHeight() * 0.1
				&& Math.random() < 0.85) {
			return true;
		} else {
			if (random.nextDouble() <= 0.95)
				return true;
		}

		return false;
	}

	public Human haveRelationship(Human h2) {
		Human result = null;
		Woman w;
		Man m;

		if (speak(h2) && suffer(h2) && spendTime(h2)) {
			if (isSex() == h2.isSex()) {
				result = null;
			} else {
				if (this.isSex() == false) {
					w = (Woman) this;

					return w.giveBirth((Man) h2);
				}

			}
		}

		return result;
	}

	@Override
	public String toString() {
		// if(this!=null)
		return "Human [name=" + name + ", secondName=" + secondName
				+ ", height=" + height + ", weight=" + weight + ", sex="
				+ sexString + "]";
		// return "There is no human";
	}

}
