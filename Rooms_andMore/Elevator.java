public class Elevator extends Room {
    int currentFloor;

    public Elevator(int area){
        super(area);
        this.currentFloor = 1;
    }
    public void up(int floors){
        this.currentFloor += floors;
    }

    public void down(int floors){
        this.currentFloor -= floors;
    }

    public static String toString(){
        return "Elevator: " + super.area + " square feet " + "Capacity: " + super.getCapacity() + " Current Floor: " + this.currentFloor;
    }
}