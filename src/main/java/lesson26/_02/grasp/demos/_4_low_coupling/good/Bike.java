package lesson26._02.grasp.demos._4_low_coupling.good;

class Bike implements Vehicle {

    @Override
    public void move() {
        System.out.println("Bike is moving");
    }
}