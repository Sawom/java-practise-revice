public class FridayQA {
    public static void main(String[] args) {
        int batteryPower = 1000;
        int flightPower = 300;

        batteryPower = batteryPower - flightPower;
        flightPower =   batteryPower / flightPower;

        System.out.println("power remaining: " + batteryPower);
        System.out.println("Flight possible: " + flightPower);

        System.out.println("Power Remaining with pre increment: " + ++batteryPower);
        System.out.println("Power Remaining with post increment: " + batteryPower++);
        System.out.println("Power Remaining: " + batteryPower);
    }
}