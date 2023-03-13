/*
 * TestFlightDate.java
 * <5.10.2022>
 * <Vihan Dalvi>
 * <Period 1>
 */

// change or remove package as required
package ReservationSystem2;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class TestFlightDate {
   public static void main(String[] args) {
      // Part A -
      // Create at least two two FlightDate objects.
      // Examine the constructor for the parameters.
      // Remember, times are in GMT
      // You may want to put these in an ArrayList of
      // type FlightDate to make printing for each easier.

      System.out.println("Creating FlightDate Array...");
      ArrayList<FlightDate> myPrinter = new ArrayList<FlightDate>();
      FlightDate fd1 = new FlightDate(2022, 10, 10, 8, 57); // your code here and next line(s)
      FlightDate fd2 = new FlightDate(2023, 2, 13, 6, 40);
      myPrinter.add(fd1);
      myPrinter.add(fd2);
      System.out.println();
      // Part B -
      // Print the toString for each object.
      System.out.println("Output for Part B");
      for (FlightDate fd : myPrinter) {
         System.out.println("toString for object is: " + fd.toString());
      }
      System.out.println();
      // Part C -
      // Print formattedDateTime for ISO_DATE_TIME for
      // each object
      System.out.println("Output for Part C");
      System.out.println("formattedDateTime for ISO_DATE_TIME of fd1 object is: "
            + fd1.formattedDateTime(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
      System.out.println("formattedDateTime for ISO_DATE_TIME of fd2 object is: "
            + fd2.formattedDateTime(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
      System.out.println();
      // Part D -
      // For each FlightDate object print the date in
      // pretty format followed by the time in pretty
      // format.

      System.out.println("Output for Part D");
      System.out.println("date in pretty format for fd1: " + fd1.getDatePretty());
      System.out.println("time in pretty format for fd1: " + fd1.getTimePretty());
      System.out.println("date in pretty format for fd2: " + fd2.getDatePretty());
      System.out.println("time in pretty format for fd2: " + fd2.getTimePretty());
      System.out.println();
      // Part E -
      // Pick two FlightDate objects. For each of these
      // get the LocalDateTime object.
      System.out.println("Output for Part E");
      // LocalDateTime fd1DT = fd1.getLocalDateTimeObject(); // your code here, plus a
      // 2nd line
      LocalDateTime fd2DT = fd2.getLocalDateTimeObject();

      // Part E continued
      // Print the hours time difference between them
      // then the minutes time between them.
      // Finally, print the total time difference between
      // them in a pretty format.
      System.out.println("Different between fd1DT & fd2DT using fd1 and fd2DT");
      System.out.println("hours time difference: " + fd1.getDifferenceHours(fd2DT));
      System.out.println("minutes time difference: " + fd1.getDifferenceMinutes(fd2DT));
      System.out.println("total time difference in pretty format: " + fd1.getTimeDifferencePretty(fd2DT));

      // Part F
      // Pick one of the FlightDate objects. For that object
      // print the day of the week as an int then
      // print the day of the week as a String
      System.out.println("Output for Part F");
      System.out.println("day of the week as an int for fd1: " + fd1.getDayOfWeekAsInt());
      System.out.println("day of the week as a String for fd1: " + fd1.getDayOfWeekAsString());
      System.out.println();
   }

}
