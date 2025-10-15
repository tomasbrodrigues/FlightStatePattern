package FlightStatePattern;

public class LastCall implements FlightState {
    @Override
    public void nextState(Flight flight) {
        System.out.println("Flight has departed. It is now in transit.");
        flight.setState(new InFlight());

    }

    @Override
    public void prevState(Flight flight) {
        System.out.println("Going back to previous state: Last call for Boarding.");
        flight.setState(new Boarding());

    }
}
