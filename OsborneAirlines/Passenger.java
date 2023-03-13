package OsborneAirlines;

import java.util.ArrayList;
import java.util.Scanner;

public class Passenger implements Comparable<Passenger> {
    // internal fields
    private String _firstname;
    private String _lastname;

    // only constructor is allowed to set values for private fields
    public Passenger(String firstname, String lastname) {
        _firstname = firstname;
        _lastname = lastname;
    }

    // first name + last name
    public String getName() {
        return _firstname + " " + _lastname;
    }

    public String getFirstName() {
        return _firstname;
    }

    public String getLastName() {
        return _lastname;
    }

    public String toString() {
        return _firstname + " " + _lastname;
    }

    public int compareTo(Passenger passenger) {
        return this.getName().compareTo(passenger.getName());
    }

    public static Passenger FindPassenger(String firstname, String lastname, ArrayList<Reservation> reservations) {
        for (Reservation r : reservations) {
            Passenger p = r.getPassengerList().stream()
                    .filter(passenger -> (firstname + " " + lastname).equals(passenger.getName())).findAny()
                    .orElse(null);
            if (p != null) {
                return p;
            }
        }
        return null;
    }

    public static ArrayList<Reservation> FindReservationForPassenger(String firstname, String lastname,
            ArrayList<Reservation> reservations) {
        ArrayList<Reservation> reservationsforcustomer = new ArrayList<Reservation>();
        for (Reservation r : reservations) {
            Passenger p = r.getPassengerList().stream()
                    .filter(passenger -> (firstname + " " + lastname).equals(passenger.getName())).findAny()
                    .orElse(null);
            if (p != null) {
                reservationsforcustomer.add(r);
            }
        }
        return reservationsforcustomer;
    }

    public static ArrayList<Passenger> FindPassengersForFlight(String flightnumber,
            ArrayList<Reservation> reservations) {
        Reservation r = reservations.stream()
                .filter(reservation -> flightnumber.equals(reservation.getFlight().getFlightNumber())).findAny()
                .orElse(null);
        if (r != null) {
            return r.getPassengerList();
        } else {
            return null;
        }
    }

    protected static Passenger Ux_CreatePassenger(Scanner kbreader, ArrayList<Reservation> reservations) {
        System.out.println("\nDetails for Passenger ");
        System.out.print("Enter First Name: ");
        String firstname = kbreader.nextLine().toUpperCase();
        System.out.print("Enter Last Name: ");
        String lastname = kbreader.nextLine().toUpperCase();
        Passenger p = Passenger.FindPassenger(firstname, lastname, reservations);
        if (p == null) {
            p = new Passenger(firstname, lastname);
        }
        return p;
    }
}
