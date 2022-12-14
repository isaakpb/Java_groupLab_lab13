import java.util.Scanner;
import java.util.*;
public class Building {
    ArrayList<Classroom> classrooms;


    // This contians all the elvators created
    ArrayList<Elevator> elevators;
    public Building(){
        this.classrooms = new ArrayList<Classroom>();
        this.elevators = new ArrayList<Elevator>();
    }
    public static void main(String[] args) {
        Scanner kybd = new Scanner(System.in);
        Building myBuilding = new Building();
        // declare an ArrayList containing Room elements
        Random rand = new Random();

        System.out.println("Enter \n\t1: create classroom\n\t2: create an elevator" +"\n\t3: Look up Elevator, Classroom  information" + "\n\t4: exit");
        int inp =Integer.parseInt(kybd.nextLine());
        while (inp != 4) {
            if (inp == 1) {
                int area = 100;
                System.out.println("If the classroom is the standard size (100 sq ft) enter y . If it is a custom size enter n:  y/n");
                String inpuser = kybd.nextLine();
                if (inpuser.equals("n")) {
                    System.out.println("Enter the area of the classroom: ");
                    area =Integer.parseInt(kybd.nextLine());
                }
                System.out.println("Are there any chairs in the classroom? y/n");
                String userInput = kybd.nextLine();
                if (userInput.equals("y")) {
                    System.out.println("Enter the number of chairs in the classroom: ");
                    int chairs =Integer.parseInt(kybd.nextLine());
                    Classroom classTestNumberChairs = new Classroom(area, chairs);
                    System.out.println(classTestNumberChairs);
                    myBuilding.classrooms.add(classTestNumberChairs);
                } else if (userInput.equals("n")) {
                    Classroom classTestNumberChairs = new Classroom(area);
                    System.out.println(classTestNumberChairs);
                    myBuilding.classrooms.add(classTestNumberChairs);
                }


            } else if (inp == 2) {
                int elevatorArea = 20;
                System.out.println("Is the elevator the standard size (20 sq ft) enter y . Else enter the size of the elevator: ");
                String userElevatorInput = kybd.nextLine();
                if (!userElevatorInput.equals("y")) {
                     elevatorArea = Integer.parseInt(userElevatorInput);
                    //System.out.println("Enter the area of the elevator: ");
                    //elevatorArea =Integer.parseInt(kybd.nextLine());
                }
                Elevator current = new Elevator(elevatorArea);
                myBuilding.elevators.add(current);
                System.out.println("Would you like to set the current floor of the elevator (default is floor 1)? y/n");
                String userElevatorInput2 = kybd.nextLine();
                if (userElevatorInput2.equals("y")) {
                    System.out.println("What floor would you like the elevator to be on (enter a negative number for basement levels ie -2)?");
                    String next = kybd.nextLine();
                    int nextFloor = Integer.parseInt(next);
                    if (nextFloor < 1 ){
                        int downValue = (-1 * nextFloor) + 1;
                        current.down(downValue);
                        System.out.println("Floor set to: " + current.currentFloor);
                    }else if (nextFloor > 1){
                        int upValue = nextFloor - 1;
                        current.up(upValue);
                         System.out.println("Floor set to: " + current.currentFloor);
                    }

                }

                // add current to the ArrayList
            }else if (inp == 3){
                int numberOfClassRooms = myBuilding.classrooms.size();
                int numberOfElevators = myBuilding.elevators.size();
                System.out.println("There are " + numberOfClassRooms + " classrooms and " + numberOfElevators + " elevators in the building");
                System.out.println("Would you like to look at a classroom, elevator or room? c/e");
                String next = kybd.nextLine();
                if (next.equals("c")){


                    System.out.println("There are " + numberOfClassRooms + " classrooms in the building enter a number  1  through " + numberOfClassRooms + " to look at a specific classroom");

                    int classNum =Integer.parseInt(kybd.nextLine());
                    Classroom currentRoom = myBuilding.classrooms.get(classNum - 1);
                    System.out.println(currentRoom);
                    int inputCode = 0;
                    do{
                        System.out.println("Would you like to\n 1. Get the number of chairs. \n 2. Get room capacity. \n3. Set the number of chairs. \n 0. Exit");
                        inputCode =Integer.parseInt(kybd.nextLine());
                        if (inputCode == 1){
                            System.out.println("There are " + currentRoom.getNumberOfChairs() + " chairs in the classroom");
                        }else if (inputCode == 2){
                            System.out.println("The capacity of the classroom is " + currentRoom.getCapacity());
                        }else if (inputCode == 3){
                            System.out.println("Enter the number of chairs in the classroom: ");
                            int chairs =Integer.parseInt(kybd.nextLine());
                            currentRoom.setNumOfChairs(chairs);
                        }

                    }while(inputCode != 0);

                    //System.out.println(myBuilding.classrooms.get(classNum));
            } else if (next.equals("e")) {
                    System.out.println("There are " + numberOfElevators + " elevators in the building enter a number between 1 and " + numberOfElevators + " to look at a specific elevator");
                    int elevatorNum = 0;
                    do {
                        System.out.println("Enter an existing elevator number to contine: ");
                        elevatorNum = Integer.parseInt(kybd.nextLine());
                    } while (elevatorNum < 1 || elevatorNum > numberOfElevators);

                    Elevator currentElevator = myBuilding.elevators.get(elevatorNum - 1);
                    System.out.println(currentElevator.toString());
                    System.out.println("Would you like to move the elevator up (u)/down (d), or not move it (n)?");
                    String next2 = kybd.nextLine();
                    if (next2.equals("u") || next2.equals("d")) {
                        if (next2.equals("u")) {
                            System.out.println("Enter the number of floors you would like to move up: ");
                            int floors = Integer.parseInt(kybd.nextLine());
                            currentElevator.up(floors);
                            System.out.println(currentElevator);

                        } else if (next2.equals("d")) {
                            System.out.println("Enter the number of floors you would like to move down: ");
                            int floors = Integer.parseInt(kybd.nextLine());
                            currentElevator.down(floors);
                            System.out.println(currentElevator);

                        }
                    }
                }

                }
                System.out.println("Enter \n\t1: create classroom\n\t2: create create elevator" +"\n\t3: Look up Elevator, Classroom  information" + "\n\t4: exit");
            inp =Integer.parseInt(kybd.nextLine());
        }
        kybd.close();
        // create a for loop to walk through the ArrayList its elements, one per line

    }

}
