package dkit.oop;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

/**
 * AirplaneManager is a container class that stores Airplanes
 * (of various class types) in a list.
 * It provides a public interface of methods that can
 * be used to manage the planes in the list.
 * It "encapsulates" the logic for managing Airplanes
 * and "hides" the data structures used to store the data.
 */

public class AirplaneManager {

    ArrayList<Airplane> airplaneList;

    public AirplaneManager() {
        airplaneList = new ArrayList<>();
    }

    //Q3.

    // write add() method

    public void add(Airplane airplane){
        airplaneList.add(airplane);
    }


    public void displayAllAirplanes() {
        for (Airplane a : airplaneList){
            System.out.println(a.toString());
        }
    }

//    public void displayAllPassengerAirplanes() {
//
//        for (PassengerAirplane p : airplaneList){
//            System.out.println(p);
//        }
//    }

    //  write method getAllCargoAirplanes()


    // write  addPassengerNameToAirplane( airplaneId, passengerName)

    public boolean addPassengerNameToAirplane(int airplaneId, String passengerName){

        for (int i=0;i<airplaneList.size();i++){
           if (airplaneList.get(i).getId()==airplaneId){
               airplaneList.get(i);

           }
        }
   return true; }

    // write containsAirplane( Airplane plane )
    public boolean containsAirplane(Airplane plane){
        for (Airplane a: airplaneList){
            if (a.equals(plane)){
                return true;
            }
        }
   return false ;}


    // write findAirplaneByPassengerName( passengerName )

//    public Airplane findAirplaneByPassengerName( String passengerName ){
//
//    }

    // write displayAllAirplanesInOrderOfType( argument )


} // end of AirplaneManager


