package order.Dao;

import order.Do.Train;

import java.text.ParseException;

public interface CreateTrain{

    Train[] createTrains(String id, String name, String node) throws ParseException;


}
