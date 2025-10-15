package FlightStatePattern;

public class CheckInOpen implements FlightState{
    @Override
    public void nextState(Flight flight) {
        System.out.println("Check-in closed. Passengers are waiting for the gate to open.");
        flight.setState(new WaitingForGate());

    }

    @Override
    public void prevState(Flight flight) {
        System.out.println("Already at the first state: Check-in open.");

    }
}
