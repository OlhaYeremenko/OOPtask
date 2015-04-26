package Task0_variant10_Train;

import java.util.ArrayList;
import java.util.Date;


public class Demo {

	public static void main(String[] args) {

	
		ArrayList<Train> trains = new ArrayList<Train>();
		Date today = new Date();  
		trains.add(new Train("�������", "NT123", today, -4, 10, 18, 20));
		trains.add(new Train("�������", "NT173", today, 14, 10, 18, 20));
		trains.add(new Train("�����", "NT234", today, 20, 15, 30, 18));
		trains.add(new Train("������", "NT789", today, 13, 10, 5, 2));
        System.out.println("C����� �������, ��������� �� ��������� ������ ����������");
		print(TrainList.goToo(trains, "�������"));
		 System.out.println("\nC����� �������, ��������� �� ��������� ������ ���������� � ������-�������� ����� ��������� ����");
		print(TrainList.goToo(trains, "�������", today));
		System.out.println("\nC����� �������, �������������� ��  ��������� ������ ���������� � ������� ����� �����");
		print(TrainList.goTooWithFreeSeats(trains, "�������"));
	}

	public static void print(ArrayList<Train> trains) {
		for (Train train : trains) {
			System.out.println(train.toString());
		}

	}

}
