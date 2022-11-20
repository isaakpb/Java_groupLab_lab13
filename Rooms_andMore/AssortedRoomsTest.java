public class AssortedRoomsTest {

    // here we are writing a series of methods to test all the methods belonging to the Room class
    public static void testRoom(int roomTestValue, int secondTestValue) {
        Room roomTest = new Room(roomTestValue);
        // testing to see if the room exists and is the value we asinged it
        if (roomTest.area == roomTestValue) {
            System.out.println("Room exists and is the value we assigned it");
        } else {
            System.out.println("Room does not exist or is not the value we assigned it");
        }


        if (roomTest.getSquareFeet() == roomTestValue) {
            System.out.println("Room.getSquareFeet() works");
        } else {
            System.out.println("Room.getSquareFeet() does not work");
        }

        roomTest.setSquareFeet(secondTestValue);
        if (roomTest.getSquareFeet() == secondTestValue) {
            System.out.println("Room.setSquareFeet() works");
        } else {
            System.out.println("Room.setSquareFeet() does not work");
        }

        int expectedCapacity = secondTestValue / 9;
        if (roomTest.getCapacity() == expectedCapacity) {
            System.out.println("Room.getCapacity() works");
        } else {
            System.out.println("Room.getCapacity() does not work");
        }

        String expectedString = "Room: " + secondTestValue + " square feet" + " Capcity: " + expectedCapacity;
        if (roomTest.toString().equals(expectedString)) {
            System.out.println("Room.toString() works");
        } else {
            System.out.println("Room.toString() does not work");
        }
    }
    public static void testClassClass(int area, int number) {
        Classroom classTest = new Classroom(area);
        if (classTest.area == area) {
            System.out.println("Classroom exists and is the value we assigned it");
        } else {
            System.out.println("Classroom does not exist or is not the value we assigned it");
        }
        Classroom classTestNumberChairs = new Classroom(area, number);
        if (classTestNumberChairs.numberOfChairs == number) {
            System.out.println("Classroom exists and is the value we assigned it");
        } else {
            System.out.println("Classroom does not exist or is not the value we assigned it");
        }
        if (classTestNumberChairs.getNumberOfChairs() == number) {
            System.out.println("Classroom.getNumberOfChairs() works");
        } else {
            System.out.println("Classroom.getNumberOfChairs() does not work");
        }
        int newnumber = 9;
        classTestNumberChairs.setNumOfChairs(newnumber);
        if (classTestNumberChairs.numberOfChairs == newnumber) {
            System.out.println("Classroom.setNumOfChairs() works");
        } else {
            System.out.println("Classroom.setNumOfChairs() does not work");
        }
        String classTestString = "Classroom: " + area + " square feet " + "Capacity: " + (area / 9) + " Chairs: " + newnumber;
        if (classTestNumberChairs.toString().equals(classTestString)) {
            System.out.println("Classroom.toString() works");
        } else {
            System.out.println("Classroom.toString() does not work");
        }
    }
        public static void testElevator(int roomTestValue, int secondTestValue) {
            Elevator elevatorTest = new Elevator(roomTestValue);
            // testing to see if the room exists and is the value we asinged it
            if (elevatorTest.area == roomTestValue) {
                System.out.println("Elevator exists and is the value we assigned it there");
            } else {
                System.out.println("Elevator does not exist or is not the value we assigned it");
            }

            elevatorTest.up(secondTestValue);
            if (elevatorTest.currentFloor == (secondTestValue + 1)) {
                System.out.println("Elevator.up() works");
            } else {
                System.out.println("Elevator.up() does not work");
            }
            elevatorTest.down(secondTestValue);
            if (elevatorTest.currentFloor == 1) {
                System.out.println("Elevator.down() works");
            } else {
                System.out.println("Elevator.down() does not work");
            }
            if(elevatorTest.getArea() == roomTestValue){
                System.out.println("Elevator.getArea() works");
            }else{
                System.out.println("Elevator.getArea() does not work");
            }
            String expectedString = "Elevator: " + roomTestValue + " square feet " + "Capacity: " + (roomTestValue / 9) + " Current Floor: " + 1;
            if (elevatorTest.toString().equals(expectedString)) {
                System.out.println("Elevator.toString() works");
            } else {
                System.out.println("Elevator.toString() does not work");
            }

            // Write a method that tests all the methods in the Classroom class



        }
        public static void main(String[] args){
            testElevator(100, 9);
            testRoom(100, 9);
            testClassClass(100, 9);

        }

}
