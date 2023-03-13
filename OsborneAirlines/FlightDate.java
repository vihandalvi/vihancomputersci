package OsborneAirlines;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class FlightDate {
    // This a zone time in UTC. This is used along with zoneid of airport to
    // calculate local time
    private ZonedDateTime _utcdeparturetime;
    private ZonedDateTime _utcarrivaltime;
    // This is localtime in UTC used to write files when users chooses save option
    private LocalDateTime _localdeparturetime;
    private LocalDateTime _localarrivaltime;

    private Duration _d;

    // consutrctor takes time & date in YYYY-MM-DDTHH:MM format
    public FlightDate(String departuretime, String arrivaltime) {
        _localarrivaltime = LocalDateTime.parse(arrivaltime);
        _localdeparturetime = LocalDateTime.parse(departuretime);
        _d = Duration.between(_localdeparturetime, _localarrivaltime);
        // System.out.println(_d);
        _utcarrivaltime = _localarrivaltime.atZone(ZoneId.of("UTC"));
        _utcdeparturetime = _localdeparturetime.atZone(ZoneId.of("UTC"));
    }

    public ZonedDateTime getDepartureUTC() {
        return _utcdeparturetime;
    }

    public ZonedDateTime getArrivalUTC() {
        return _utcarrivaltime;
    }

    public LocalDateTime getDeparture() {
        return _localdeparturetime;
    }

    public LocalDateTime getArrival() {
        return _localarrivaltime;
    }

    public Duration getDuration() {
        return _d;
    }

}
