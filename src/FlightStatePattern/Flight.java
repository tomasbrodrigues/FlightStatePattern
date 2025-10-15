package FlightStatePattern;

public class Flight {

    private FlightState state;

    public Flight() {
        this.state = new CheckInOpen(); // initial state

    }

    public void setState(FlightState state) {
        this.state = state;
    }

    public void nextState() {
        state.nextState(this);
        System.out.println("Current State: " + status());
    }

    public void prevState() {
        state.prevState(this);
        System.out.println("Current State: " + status());
    }

    public String status() {
        return state.getClass().getSimpleName();
    }

}
