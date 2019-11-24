package by.htp.train.main;

import java.util.ArrayList;
import java.util.List;

import by.htp.train.entity.RailwayDepot;
import by.htp.train.entity.Train;
import by.htp.train.logic.RailwayDepoLogic;
import by.htp.train.view.TrainPrinter;

public class Main {
	
	public static void main(String[] args) {
		Train train1 = new Train("Moscow", 987, 12, 15);
		Train train2 = new Train("Paris", 137, 10, 10);
		Train train3 = new Train("Saint Petersburg", 423, 19, 20);
		Train train4 = new Train("Kishinev", 256, 12, 18);
		Train train5 = new Train("Moscow", 109, 00, 10);
		
		List<Train> trains = new ArrayList<Train>();
		trains.add(train1);
		trains.add(train2);
		trains.add(train3);
		trains.add(train4);
		trains.add(train5);;
		
		RailwayDepot railwayDepot = new RailwayDepot();
		railwayDepot.setTrains(trains);
		
		RailwayDepoLogic rlLogic = new RailwayDepoLogic();
		TrainPrinter trPrinter = new TrainPrinter();
		List<Train> sortedTrains = rlLogic.sortByNumber(railwayDepot);
		trPrinter.printTrains(sortedTrains);
		
		int number = trPrinter.getNumberFromConsole();
		Train selectedTrain = rlLogic.findTrain(number, railwayDepot);
		trPrinter.printTrainByNumber(selectedTrain);
		
		List<Train> sortedTrainsByDestination = rlLogic.sortByDestination(railwayDepot);
		trPrinter.printTrains(sortedTrainsByDestination);
		
	}
}
