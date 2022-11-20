import java.util.*;
public class Classroom extends Room{
    int numberOfChairs;

    public Classroom(int area){
        super(area);
    }
    public Classroom(int area, int numberOfChairs){
        super(area);
        this.numberOfChairs = numberOfChairs;
    }
    public int getNumberOfChairs(){
        return this.numberOfChairs;
    }
    public void setNumOfChairs(int numberOfChairs){
        this.numberOfChairs = numberOfChairs;
    }
    public int getCapacity(){
        return this.numberOfChairs;
    }

    public  String toString(){
        return "Classroom: " + super.area + " square feet " + "Capacity: " + (super.getCapacity()) + " Chairs: " + this.numberOfChairs;
    }
}