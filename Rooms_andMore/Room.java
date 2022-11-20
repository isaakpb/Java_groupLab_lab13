import java.util.*;
public class Room {
   int area;

   public Room(int area) {
      this.area = area;
   }

   public int getSquareFeet() {
       return this.area;
   }
   public void setSquareFeet(int area) {
       this.area = area;
   }
   public int getCapacity(){
       return this.area / 9;
   }

   public  String toString(){
       return "Room: " + this.area + " square feet" + " Capcity: " + this.getCapacity();
   }
}