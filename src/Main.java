import FlightStatePattern.*;

public class Main {
    public static void main(String[] args) {
        Flight flight = new Flight();
        System.out.println("Initial State: " + flight.status());

        flight.nextState(); // CheckInOpen → WaitingForGate
        flight.nextState(); // WaitingForGate → GateOpened
        flight.nextState(); // GateOpened → Boarding
        flight.nextState(); // Boarding → LastCall
        flight.nextState(); // LastCall → InFlight
        flight.nextState(); // InFlight → Arrived
        flight.nextState();

        // Going in reverse order
        flight.prevState();
        flight.prevState();
        flight.prevState();
        flight.prevState();
        flight.prevState();
        flight.prevState();
        flight.prevState();
    }
}