package FlightStatePattern;

public class InFlight implements FlightState {
    @Override
    public void nextState(Flight flight) {
        System.out.println("The flight has arrived at its destination.");
        flight.setState(new Arrived());

    }

    @Override
    public void prevState(Flight flight) {
        System.out.println("Flight has departed. It is now in transit.");
        flight.setState(new LastCall());

    }
}
