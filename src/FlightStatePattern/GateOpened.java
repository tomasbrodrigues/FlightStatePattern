package FlightStatePattern;

public class GateOpened implements FlightState {
    @Override
    public void nextState(Flight flight) {
        System.out.println("Boarding Started.");
        flight.setState(new Boarding());

    }

    @Override
    public void prevState(Flight flight) {
        System.out.println("Going back to previous state: Waiting for Gate.");
        flight.setState(new WaitingForGate());

    }
}
