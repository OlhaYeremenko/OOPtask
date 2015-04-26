package TaxiStation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.SortedMap;
import java.util.TreeMap;

/*10. Таксопарк. Определить иерархию легковых автомобилей.
 * Создать таксопарк. 
 * Подсчитать стоимость автопарка.
 * Провести сортировку автомобилей  * парка по расходу топлива.
 * Найти автомобиль в компании, соответствующий заданному диапазону параметров скорости.*/

public class TaxiStation {
	private Map<PassengerCar, Integer> cars;
	private PassengerCar car;

	public TaxiStation() {
		cars = new HashMap<PassengerCar, Integer>();
	}

	public void addCar(PassengerCar car, int count) {
		cars.put(car, count);
	}

	public int taxiStationMonay() {
		int sum = 0;
		for (Car car : cars.keySet()) {
			sum += car.getPrice();
		}
		return sum;
	}

	public void sort() {
		Comparator<PassengerCar> comparator = new Comparator<PassengerCar>() {
			public int compare(PassengerCar o1, PassengerCar o2) {
				if (o1.getFuelConsumption() < o2.getFuelConsumption())
					return 1;
				else if (o1.getFuelConsumption() > o2.getFuelConsumption())
					return -1;
				else
					return 0;
			}
		};
		SortedMap<PassengerCar, Integer> tmp = new TreeMap<PassengerCar, Integer>(
				comparator);
		tmp.putAll(cars);
		cars = tmp;
	}

	public void find(double speedStart, double speedEnd) {
		Map<PassengerCar, Integer>	carsSpeed = new HashMap<PassengerCar, Integer>();
		for (PassengerCar car : cars.keySet()) {
			if(speedStart<car.getSpeedSettings() && car.getSpeedSettings()<speedEnd){
				carsSpeed.put(car,cars.get(car));
			}
		}
		cars = carsSpeed;
		
	}

	public void print() {
		for (Entry<PassengerCar, Integer> entry : cars.entrySet()) {
			System.out.println(entry.getKey().toString());
		}
	}

}
