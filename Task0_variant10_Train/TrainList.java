package Task0_variant10_Train;

import java.util.ArrayList;
import java.util.Date;

public class TrainList {

	public static ArrayList<Train> goToo(ArrayList<Train> trains,
			String dectination) {
		ArrayList<Train> trainsDectination = new ArrayList<Train>();

		for (Train train : trains) {
			if (train.getDestination() == dectination) {
				trainsDectination.add(train);
				
			}
		}
		if(trainsDectination.isEmpty()){System.out.println("There is no such train ");}
		return trainsDectination;
	}

	public static ArrayList<Train> goToo(ArrayList<Train> trains,
			String dectination, Date finalTime) {
		ArrayList<Train> trainsDectination = new ArrayList<Train>();

		for (Train train : trains) {
			if (train.getDestination() == dectination
					&& train.getDepartureTime().compareTo(finalTime) > 0) {
				trainsDectination.add(train);
			}
		}
		if(trainsDectination.isEmpty()){System.out.println("There is no such train ");}
		return trainsDectination;
	}

	public static ArrayList<Train> goTooWithFreeSeats(ArrayList<Train> trains,
			String dectination) {
		ArrayList<Train> trainsDectination = new ArrayList<Train>();

		for (Train train : trains) {
			if (train.getDestination() == dectination
					&& train.getCommonCount() != 0) {
				trainsDectination.add(train);
			} 

		}
		if(trainsDectination.isEmpty()){System.out.println("There is no such train ");}
		return trainsDectination;
	}

}
