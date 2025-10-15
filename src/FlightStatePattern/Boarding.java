package FlightStatePattern;

public class Boarding implements FlightState {
    @Override
    public void nextState(Flight flight) {
        System.out.println("Last call for boarding!");
        flight.setState(new LastCall());

    }

    @Override
    public void prevState(Flight flight) {
        System.out.println("Going back to previous state: Boarding Started.");
        flight.setState(new GateOpened());

    }
}
