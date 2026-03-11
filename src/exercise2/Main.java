package exercise2;

public class Main {
    public static void main(String[] args) {
        SimCard sim1 = new SimCard("3334445556");
        sim1.printSimData();

        sim1.setNewCall(10, "3338885551");
        sim1.printSimData();

        sim1.setNewCall(15, "3332224443");
        sim1.printSimData();

        sim1.setNewCall(32, "4442220001");
        sim1.printSimData();

        sim1.setNewCall(12, "6663330004");
        sim1.printSimData();

        sim1.setNewCall(8, "9993330004");
        sim1.printSimData();

        sim1.setNewCall(2, "0003330004");
        sim1.printSimData();


    }
}
