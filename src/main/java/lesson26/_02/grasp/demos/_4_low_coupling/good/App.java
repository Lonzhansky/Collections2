package lesson26._02.grasp.demos._4_low_coupling.good;

public class App {

    public static void main(String[] args) {

        Traveler traveler = new Traveler();

        traveler.setVehicle(
                new Car() // Car injection
        );

        traveler.startJourney();

        traveler.setVehicle(
                new Bike() // Bike injection
        );

        traveler.startJourney();
    }
}
