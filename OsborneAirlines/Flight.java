package OsborneAirlines;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class Flight implements Comparable<Flight> {
    private Airport _departureairport;
    private Airport _arrivalairport;
    private FlightDate _flightdate;
    private String _flightnumber;
    private int _capacity;

    public Flight(Airport departureairport, Airport arrivalairport, FlightDate flightdate,
            String flightnumber, int capacity) {
        _departureairport = departureairport;
        _arrivalairport = arrivalairport;
        _flightdate = flightdate;
        _flightnumber = flightnumber;
        _capacity = capacity;
    }

    public Airport getDepartureAirport() {
        return _departureairport;
    }

    public Airport getArrivalAirport() {
        return _arrivalairport;
    }

    public String getFlightNumber() {
        return _flightnumber;
    }

    public int getCapacity() {
        return _capacity;
    }

    public FlightDate getFlightDate() {
        return _flightdate;
    }

    public String GetLocalDepartureDate() {
        ZoneId departurezone = ZoneId.of(_departureairport.getTimeZoneId());
        ZonedDateTime localdeparturetime = _flightdate.getDepartureUTC().withZoneSameInstant(departurezone);
        // DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy hh:mm a");
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd LLL uuuu hh:mm a");
        String departurestring = "";
        departurestring += "Departing at local time: " + localdeparturetime.format(format);
        return departurestring;
    }

    public String GetLocalArrivalDate() {
        ZoneId arrivalzone = ZoneId.of(_arrivalairport.getTimeZoneId());
        ZonedDateTime localarrivaltime = _flightdate.getArrivalUTC().withZoneSameInstant(arrivalzone);
        String arrivalstring = "";
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd LLL uuuu hh:mm a");
        arrivalstring += "Arriving at local time: " + localarrivaltime.format(format);
        return arrivalstring;
    }

    public int compareTo(Flight flight) {
        return this.getFlightNumber().compareTo(flight.getFlightNumber());
    }

    public String toString() {
        String flightstring = "";

        // Name, City, State, Timezone
        flightstring += "Flight Number: " + _flightnumber + "\n";
        flightstring += "Flight Capacity: " + _capacity + "\n";
        flightstring += "Duration: " + _flightdate.getDuration().toHours() + " hrs "
                + _flightdate.getDuration().toMinutes() + " mins \n";
        flightstring += "DEPARTURE: " + "\n";
        flightstring += _departureairport.toString() + "\n\t";
        flightstring += GetLocalDepartureDate() + "\n";
        flightstring += "ARRIVAL: " + "\n";
        flightstring += _arrivalairport.toString() + "\n\t";
        flightstring += GetLocalArrivalDate();

        return flightstring;
    }

    public static Flight FindFlight(String flightnumber, ArrayList<Flight> flights) {
        Flight f = flights.stream().filter(flight -> flightnumber.equals(flight.getFlightNumber())).findAny()
                .orElse(null);
        return f;
    }

    protected static Flight Ux_CreateFlight(Scanner kbreader, Airport departureairport, Airport arrivalairport,
            String flightnumber, ArrayList<Flight> flights) {
        System.out.print("\nPlease Enter Departure Date [YYYY-MM-DDTHH:MM]: ");
        String ad = kbreader.nextLine().toUpperCase();
        System.out.print("\nPlease Enter Arrival Date [YYYY-MM-DDTHH:MM]: ");
        String dd = kbreader.nextLine().toUpperCase();
        FlightDate flightdate = new FlightDate(ad, dd);
        System.out.print("\nPlease Enter Flight Capacity: ");
        Flight f = new Flight(departureairport, arrivalairport, flightdate, flightnumber,
                Integer.parseInt(kbreader.nextLine().toUpperCase()));
        flights.add(f);
        return f;
    }
}
