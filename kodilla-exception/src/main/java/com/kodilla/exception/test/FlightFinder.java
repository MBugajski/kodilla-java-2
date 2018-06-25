package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightFinder {

    public String findFlight(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> flightMap = new HashMap<>();
        flightMap.put("Hannover", true);
        flightMap.put("Modlin", false);
        flightMap.put("London", true);
        flightMap.put("Madrid", false);
        flightMap.put("Rome", true);

        if (flightMap.get(flight.getArrivalAirport()) != null) {
            if (flightMap.get(flight.getArrivalAirport()) == true) {
                return "We can fly from  " + flight.getDepartureAirport() + " to " + flight.getArrivalAirport() + "!";
            } else {
                return "We can't fly from " + flight.getDepartureAirport() + " to " + flight.getArrivalAirport() + "!";
        }
    }
        throw new RouteNotFoundException();

    }
}
