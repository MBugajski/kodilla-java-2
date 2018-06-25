package com.kodilla.exception.test;

import java.util.ArrayList;
import java.util.List;

public class FlightFinderRunner {

    public static void main(String[] args) {
        FlightFinder flightFinder = new FlightFinder();
        List<Flight> flightList = new ArrayList<>();
        flightList.add(new Flight("Warsaw", "London"));
        flightList.add(new Flight("Warsaw", "Rome"));
        flightList.add(new Flight("Warsaw", "Radom"));
        flightList.add(new Flight("Warsaw", "Modlin"));
        flightList.add(new Flight("Warsaw", "Berlin"));

        flightList.forEach(flight -> {
            try {
                System.out.println(flightFinder.findFlight(flight));
            } catch (RouteNotFoundException e) {
                System.out.println("Airport in " + flight.getArrivalAirport() + " seems to be fictional.");
            }
        });
    }
}
