package by.htp.train.view;

import java.util.List;
import java.util.Scanner;

import by.htp.train.entity.Train;

public class TrainPrinter {
	
	public void printTrains(List<Train> trains) {
		for(Train train : trains) {
			System.out.println(train.toString());
		}
	}

	public int getNumberFromConsole() {
		int value;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String message = "Enter train's number";
		System.out.println("Enter train's number");
		while(!sc.hasNext()) {
			sc.next();
			System.out.println(message);
		}
		value = sc.nextInt();
		return value;
	}

	public void printTrainByNumber(Train selectedTrain) {
		if (selectedTrain != null) {
			System.out.println(selectedTrain.toString());
		}
	}
	
}
