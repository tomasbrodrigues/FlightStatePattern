import FlightStatePattern.*;

public class Main {
    public static void main(String[] args) {

        Flight flight = new Flight();
        System.out.println("This flight is at state: " + flight.status());

    }
}