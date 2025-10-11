package FlightStatePattern;

public class Flight {

    private FlightState state;

    public Flight() {
        this.state = new CheckInOpen();

    }

    public void nextState() {
        //state.nextState(this);
    }

    public void prevState() {
        //state.prevState(this);
    }

    public String status() {
        return state.getClass().getSimpleName();
    }

}
