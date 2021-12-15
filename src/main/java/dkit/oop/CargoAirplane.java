package dkit.oop;

public class CargoAirplane extends Airplane {







    // fields (ref. Q1)

    private double MAX_LOAD_KILOS;
    private double currentLoad;

    // constructor

    public CargoAirplane(String type, double MAX_LOAD_KILOS) {
        super(type);
        this.MAX_LOAD_KILOS = MAX_LOAD_KILOS;
    }



    // toString()


    @Override
    public String toString() {
        return "CargoAirplane{" +
                "MAX_LOAD_KILOS=" + MAX_LOAD_KILOS +
                "} " + super.toString();
    }
} // END of CargoAirplane class.

