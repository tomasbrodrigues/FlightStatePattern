package FlightStatePattern;

public class Arrived implements FlightState {
    @Override
    public void nextState(Flight flight) {
        System.out.println("The flight is complete, passengers have exited. No further states.");

    }

    @Override
    public void prevState(Flight flight) {
        System.out.println("Going back to previous state: Flight In Transit.");
        flight.setState(new InFlight());

    }
}
