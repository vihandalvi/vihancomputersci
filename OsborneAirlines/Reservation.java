package OsborneAirlines;

import java.util.ArrayList;
import java.util.Scanner;

public class Reservation implements Comparable<Reservation> {

    private ArrayList<Passenger> _passengerlist = new ArrayList<Passenger>();
    private Flight _flight;
    private String _reservationnumber;

    public Reservation(String reservationnumber, Flight flight, String[] passengerlist) {
        _reservationnumber = reservationnumber;
        _flight = flight;
        for (String string : passengerlist) {
            String[] namesplit = string.split(" ", 2);
            Passenger p = new Passenger(
                    // first name
                    namesplit[1].toUpperCase(),
                    // last name
                    namesplit[0].toUpperCase());
            _passengerlist.add(p);
        }
    }

    public Reservation(String reservationnumber, Flight flight, ArrayList<Passenger> passengerlist) {
        _reservationnumber = reservationnumber;
        _flight = flight;
        _passengerlist = passengerlist;
    }

    public ArrayList<Passenger> getPassengerList() {
        return _passengerlist;
    }

    public Flight getFlight() {
        return _flight;
    }

    public String getReservationNumber() {
        return _reservationnumber;
    }

    public String toString() {
        // reservation number, flightnumber, passenger list

        String reservationstring = "";
        reservationstring += "Reservation Number: " + _reservationnumber + "\n"
                + _flight.toString() + "\n"
                + "Passenger List: " + "\n\t"
                + _passengerlist.toString();
        return reservationstring;
    }

    public int compareTo(Reservation reservation) {
        return this.getReservationNumber().compareTo(reservation.getReservationNumber());
    }

    public static Reservation FindReservation(String reservationnumber, ArrayList<Reservation> reservations) {
        Reservation a = reservations.stream()
                .filter(reservation -> reservationnumber.equals(reservation.getReservationNumber())).findAny()
                .orElse(null);
        return a;
    }

    protected static Reservation Ux_CreateReservation(Scanner kbreader, ArrayList<Reservation> reservations, Flight f) {
        int customerinput = 9;
        ArrayList<Passenger> passengers = new ArrayList<Passenger>();
        System.out.print("Please Enter Reservation Number: ");
        Reservation r = new Reservation(kbreader.nextLine(), f, passengers);
        while (customerinput != 0) {
            Passenger p = Passenger.Ux_CreatePassenger(kbreader, reservations);
            r.getPassengerList().add(p);
            System.out.print("Do you want to add another customer? [yes: 1 /No: 0]");
            if (kbreader.hasNextInt()) {
                String inputstring = kbreader.nextLine();
                customerinput = Integer.parseInt(inputstring);
            }
        }
        reservations.add(r);
        return r;
    }
}
