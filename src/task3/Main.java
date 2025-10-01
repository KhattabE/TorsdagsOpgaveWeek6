package task3;

import java.util.ArrayList;

public class Main {

    static ArrayList<Room> rooms = new ArrayList<>();

    public static void main(String[] args) {




        Room room1 = new Room(3, 2);
        Room room2 = new Room(5,  8);
        Room room3 = new Room(20, 10);

        rooms.add(room1);
        rooms.add(room2);
        rooms.add(room3);

        Building building = new Building(rooms, 15);

        countLampsInBuilding(building);
        countWindowsInBuilding(building);

        System.out.println(isNormal(building));




    }


    public static void countLampsInBuilding(Building building) {
        int totalLamps = 0;
        for (Room room : rooms) {
            totalLamps += room.getNumberOfLamps();
        }
        System.out.println("Total lamps in building: " + totalLamps);
    }

    public static void countWindowsInBuilding(Building building) {
        int totalWindows = 0;
        for (Room room : rooms) {
            totalWindows += room.getNumberOfWindows();
        }
        System.out.println("Total windows in building: " + totalWindows);
    }

    public static boolean isNormal(Building building) {
        return building.getNumberOfFloors() <= building.getRooms().size();
    }



}
