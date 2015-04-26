package Task0_variant10_Train;

import java.util.ArrayList;
import java.util.Date;


public class Demo {

	public static void main(String[] args) {

	
		ArrayList<Train> trains = new ArrayList<Train>();
		Date today = new Date();  
		trains.add(new Train("Харьков", "NT123", today, -4, 10, 18, 20));
		trains.add(new Train("Харьков", "NT173", today, 14, 10, 18, 20));
		trains.add(new Train("Львов", "NT234", today, 20, 15, 30, 18));
		trains.add(new Train("Донецк", "NT789", today, 13, 10, 5, 2));
        System.out.println("Cписок поездов, следующих до заданного пункта назначения");
		print(TrainList.goToo(trains, "Харьков"));
		 System.out.println("\nCписок поездов, следующих до заданного пункта назначения и отправ-ляющихся после заданного часа");
		print(TrainList.goToo(trains, "Харьков", today));
		System.out.println("\nCписок поездов, отправляющихся до  заданного пункта назначения и имеющих общие места");
		print(TrainList.goTooWithFreeSeats(trains, "Харьков"));
	}

	public static void print(ArrayList<Train> trains) {
		for (Train train : trains) {
			System.out.println(train.toString());
		}

	}

}
