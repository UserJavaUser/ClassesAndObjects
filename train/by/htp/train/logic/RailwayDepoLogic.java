package by.htp.train.logic;

import java.util.List;
import by.htp.train.entity.RailwayDepot;
import by.htp.train.entity.Train;

public class RailwayDepoLogic {
	
	public List<Train> sortByNumber(RailwayDepot railwayDepot){
		List<Train> trains = railwayDepot.getTrains();
		for(int i = 0; i < trains.size() - 1; i++) {
			for(int j = i + 1; j < trains.size(); j++) {
				if(trains.get(i).getNumber() > trains.get(j).getNumber()) {
					Train temp = trains.get(i);
					trains.set(i, trains.get(j));
					trains.set(j, temp);
				}
			}
		}
		return trains;
	}

	public Train findTrain(int number, RailwayDepot railwayDepot) {
		List<Train> trains = railwayDepot.getTrains();
		for(Train train : trains) {
			if(train.getNumber() == number) {
				return train;
			}
		}
		return null;
	}

	public List<Train> sortByDestination(RailwayDepot railwayDepot) {
		List<Train> trains = railwayDepot.getTrains();
		for(int i = 0; i < trains.size() - 1; i++) {
			for(int j = i + 1; j < trains.size(); j++) {
				Train first = trains.get(i);
				Train second = trains.get(j);
				if(first.getDestination().compareTo(second.getDestination()) > 0) {
					Train temp = trains.get(i);
					trains.set(i, trains.get(j));
					trains.set(j, temp);
				}
				if(first.getDestination().compareTo(second.getDestination()) == 0) {
					if(first.getHour() > second.getHour()) {
						Train temp = trains.get(i);
						trains.set(i, trains.get(j));
						trains.set(j, temp);
					}
					if(first.getHour() == second.getHour()) {
						if(first.getMinute() > second.getMinute()) {
							Train temp = trains.get(i);
							trains.set(i, trains.get(j));
							trains.set(j, temp);
						}
					}
				}
			}
		}
		return trains;
	}
	
	
}
