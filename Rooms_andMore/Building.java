import java.util.Scanner;
import java.util.*;
public class Building {
    ArrayList<Classroom> classrooms;


    // This contians all the elvators created
    ArrayList<Elevator> elevators = new ArrayList<Elevator>();
    public static void main(String[] args) {
        Scanner kybd = new Scanner(System.in);
        Building myBuilding = new Building();
        // declare an ArrayList containing Room elements
        Random rand = new Random();

        System.out.println("Enter \n\t1: create classroom\n\t2: create create elevator" +"\n\t3: Look up Elevator, Classroom and Room information" + "\n\t4: exit");
        int inp = kybd.nextInt();
        while (inp != 4) {
            if (inp == 1) {
                int area = 100;
                System.out.println("If the classroom is the standrad size (100 sq ft) enter y . If it is a custom size enter n:  y/n");
                if (kybd.next().equals("n")) {
                    System.out.println("Enter the area of the classroom: ");
                    area = kybd.nextInt();
                }
                System.out.println("Are there any chairs in the classroom? y/n");
                if (kybd.next().equals("y")) {
                    System.out.println("Enter the number of chairs in the classroom: ");
                    int chairs = kybd.nextInt();
                    Classroom classTestNumberChairs = new Classroom(area, chairs);
                    System.out.println(classTestNumberChairs);
                    myBuilding.classrooms.add(classTestNumberChairs);
                } else {
                    Classroom classTestNumberChairs = new Classroom(area);
                    System.out.println(classTestNumberChairs);
                    myBuilding.classrooms.add(classTestNumberChairs);
                }


            } else if (inp == 2) {
                Elevator current = new Elevator(rand.nextInt(100) + 10);
                if (rand.nextInt(2) == 0) {
                    current.up(rand.nextInt(10));
                } else {
                    current.down(rand.nextInt(10));
                }
                // add current to the ArrayList
            }
            System.out.println("Enter \n\t1: create classroom\n\t2: create create elevator" +"\n\t3: Look up Elevator, Classroom and Room information" + "\n\t4: exit");
            inp = kybd.nextInt();
        }
        kybd.close();
        // create a for loop to walk through the ArrayList its elements, one per line

    }

}
