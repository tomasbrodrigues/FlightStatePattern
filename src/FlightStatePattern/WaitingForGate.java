package FlightStatePattern;

public class WaitingForGate implements FlightState {
    @Override
    public void nextState(Flight flight) {
        System.out.println("Gate opened. Passengers can start boarding soon.");
        flight.setState(new GateOpened());

    }

    @Override
    public void prevState(Flight flight) {
        System.out.println("Going back to previous state: Check-in open.");
        flight.setState(new CheckInOpen());

    }
}
