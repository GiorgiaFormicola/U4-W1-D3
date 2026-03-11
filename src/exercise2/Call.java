package exercise2;

public class Call {
    //ATTRIBUTES LIST
    private int minutes;
    private String calledNumber;

    //CONSTRUCTORS LIST
    public Call(int minutes, String calledNumber) {
        this.minutes = minutes;
        this.calledNumber = calledNumber;
    }

    //METHODS LIST
    @Override
    public String toString() {
        return "Call from: " + calledNumber + " (" + minutes + " minutes)";
    }
}
