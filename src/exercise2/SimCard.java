package exercise2;

public class SimCard {
    //ATTRIBUTES LIST
    private String phoneNumber;
    private double creditAvailable;
    private Call[] lastFiveCalls;

    //CONSTRUCTORS LIST
    public SimCard(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        this.creditAvailable = 0;
        this.lastFiveCalls = new Call[5];
    }


    ;

    //METHODS LIST
    public void printSimData() {
        System.out.println("SIM DATA");
        System.out.println("Phone number: " + this.phoneNumber);
        System.out.println("Credit available: " + this.creditAvailable + " euro");
        System.out.println("Last five calls: ");
        for (Call currentCall : lastFiveCalls) {
            if (currentCall != null) {
                System.out.println(currentCall.toString());
            } else {
                System.out.println("Call not available");
            }
        }
    }

    public void setNewCall(int minutes, String calledNumber) {
        Call newCall = new Call(minutes, calledNumber);
        for (int i = lastFiveCalls.length - 1; i >= 0; i--) {
            if (i > 0) {
                this.lastFiveCalls[i] = this.lastFiveCalls[i - 1];
            } else {
                this.lastFiveCalls[i] = newCall;
            }
        }
    }
}
