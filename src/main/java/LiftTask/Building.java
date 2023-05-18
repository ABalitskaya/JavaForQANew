package LiftTask;
public class Building {
    private Lift liftOne;
    private Lift liftTwo;
    private int totalFloors;

    public Building(int totalFloors) {
        this.totalFloors = totalFloors;
        this.liftOne = new Lift("A", 0);
        this.liftTwo = new Lift("B", totalFloors / 2);
    }

    private Lift liftNearMe(int floor) {
        int distanceFromLiftOne = Math.abs(liftOne.getCurrentFloor() - floor);
        int distanceFromLiftTwo = Math.abs(liftTwo.getCurrentFloor() - floor);

        if (distanceFromLiftOne <= distanceFromLiftTwo) {
            return liftOne;
        } else {
            return liftTwo;
        }
    }

    public void callLift(int floor) {
        Lift nearestLift = liftNearMe(floor);
        nearestLift.moveToFloor(floor);
    }
}