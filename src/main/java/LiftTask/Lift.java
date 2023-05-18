package LiftTask;
public class Lift {
    private String name;
    private int currentFloor;

    public Lift(String name, int currentFloor) {
        this.name = name;
        this.currentFloor = currentFloor;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public void moveToFloor(int floor) {
        System.out.println(name + " moves on  " + floor + " floor");
        currentFloor = floor;
    }






}
