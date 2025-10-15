package FlightStatePattern;

public interface FlightState {
    void nextState(Flight flight);
    void prevState(Flight flight);

}
