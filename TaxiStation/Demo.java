package TaxiStation;

public class Demo {

	public static void main(String[] args) {

		TaxiStation tx = new TaxiStation();
		System.out.println("Добавить автомобиль в парк");

		PassengerCar mersedrs7 = new PassengerCar("A7", "Mersedes", 1500000,
				15.3, 20000, 170, BodyType.Sedan);

		PassengerCar mersedrs8 = new PassengerCar("A8", "Mersedes", 1500000,
				10.2, 20000, 150, BodyType.Sedan);
		PassengerCar BMW8 = new PassengerCar("BMW8", "BMV", 1500000, 15.8,
				20000, 230, BodyType.Sedan);

		/*
		 * PassengerCar BMW5 = new PassengerCar("BMWA5", "BMW", -2000000, 19,
		 * 24000, 580, BodyType.Sedan);
		 */

		tx.addCar(mersedrs7, 4);
		tx.addCar(mersedrs8, 5);
		tx.addCar(BMW8, 2);
		tx.print();
		System.out.print("Cтоимость авторпарка :");
		System.out.println(tx.taxiStationMonay());
		System.out.println("Отстортируем по FuelConsumption");
		tx.sort();
		tx.print();
		System.out.println("Автомобили, скоростный параметр между 120-200 :");
		tx.find(120, 200);
		tx.print();
	}

}
