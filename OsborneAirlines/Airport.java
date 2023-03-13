package OsborneAirlines;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TimeZone;

public class Airport implements Comparable<Airport> {
    private String _name;
    private String _city;
    private String _state;
    private String _timezoneid;

    public Airport(String name, String city, String state, String timezoneid) {
        _name = name;
        _city = city;
        _state = state;
        _timezoneid = timezoneid;
    }

    public String getName() {
        return _name;
    }

    public String getCity() {
        return _city;
    }

    public String getTimeZoneId() {
        return _timezoneid;
    }

    public String getState() {
        return _state;
    }

    public void setName(String name) {
        _name = name;
    }

    public void setCity(String city) {
        _city = city;
    }

    public void setState(String state) {
        _state = state;
    }

    public String toString() {
        String airportstring = "";
        // Name, City, State, Timezone
        airportstring += "\tAirport Name: " + _name;
        airportstring += "\tAirport City: " + _city + ", " + _state;
        airportstring += "\t\tAirport TimeZone: " + TimeZone.getTimeZone(_timezoneid).getDisplayName();
        return airportstring;
    }

    public int compareTo(Airport airport) {
        return this.getName().compareTo(airport.getName());
    }

    public static Airport FindAirport(String airportname, ArrayList<Airport> airports) {
        Airport a = airports.stream().filter(airport -> airportname.equals(airport.getName())).findAny().orElse(null);
        return a;
    }

    protected static Airport Ux_FindAirport(Scanner kbreader, ArrayList<Airport> airports) {
        System.out.print("\nEnter Airport Name: ");
        Airport a = Airport.FindAirport(kbreader.nextLine().toUpperCase(), airports);
        if (a != null) {
            System.out.println(a);
        } else {
            System.out.println("Airport Does not exist");
        }
        return a;
    }

    protected static Airport Ux_CreateAirport(Scanner kbreader, ArrayList<Airport> airports) {
        System.out.print("\nAirport Name: ");
        String name = kbreader.nextLine().toUpperCase();
        Airport airport = Airport.FindAirport(name, airports);
        if (airport == null) {
            System.out.print("\nCity: ");
            String city = kbreader.nextLine().toUpperCase();
            System.out.print("\nState: ");
            String state = kbreader.nextLine().toUpperCase();
            System.out.print("\nTimeZone: ");
            String timezoneid = kbreader.nextLine();
            airport = new Airport(name, city, state, timezoneid);
            airports.add(airport);
        } else {
            System.out.println("Airport Already Exists");
        }
        return airport;
    }

    protected static Airport Ux_DeleteAirport(Scanner kbreader, ArrayList<Airport> airports) {
        System.out.print("\nEnter Airport Name: ");
        Airport a = Airport.FindAirport(kbreader.nextLine().toUpperCase(), airports);
        if (a != null) {
            System.out
                    .println("Deleting below Airport....flights/reservations from this airport are not valid");
            System.out.println(a);
            airports.remove(a);
        } else {
            System.out.println("Airport Does not exist");
        }
        return a;
    }

}
