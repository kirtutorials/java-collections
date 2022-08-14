import collection.Room;

import java.sql.Wrapper;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Main {
    public static void main(String args[]) {
        System.out.println("Welcome Taj Hotel!");
        Room r1 = new Room(201, "delux", 100, 2);
        Room r2 = new Room(202, "Suite", 300, 2);
        Room r3 = new Room(203, "delux", 100, 2);
        Room r4 = new Room(204, "Executive", 350, 2);

        List<Room> rooms = new ArrayList<>();
        rooms.addAll(List.of(r1, r2, r3, r4));

        double value = totalPotentialRevenue(rooms);
        System.out.println("Total Revenue: " + value);

        // Modifying the List using for each
//        Collection<Room> removeRooms = new ArrayList<>();
//        for(Room room: rooms) {
//
//            if (room.getPrice() >= 350) {
//                removeRooms.add(room);
//            }
//
//            System.out.println("room price:" + room.getPrice());
//        }
//        rooms.removeAll(removeRooms);
ð

        // Modifying the List using for iterator
//        Iterator<Room> iterator = rooms.iterator();
//
//        while(iterator.hasNext()) {
//            Room room = iterator.next();
//            if (room.getPrice() >= 350) {
//                iterator.remove();
//            }
//        }
//
//        System.out.println(rooms.size());

        // Modifying the List using for streams
        rooms.stream().filter(new Predicate<Room>() {
            @Override
            public boolean test(Room room) {
                if (room.getPrice() >= 350) {
                   return false;
                } else {
                    return true;
                }
            }
        }).forEach(new Consumer<Room>() {
            @Override
            public void accept(Room room) {
                System.out.println(room.getNumber());
            }
        });

    }
    static double totalPotentialRevenue(List<Room> occupiedRooms) {
        double total = 0.0;

//        occupiedRooms.forEach(e -> {
//            total = total + e.getPrice();
//            return;
//        });

        for(Room room: occupiedRooms) {
           System.out.println("room price:" + room.getPrice());
           total = total + room.getPrice();
       }


       return total;
    }
}

/**
 * Classifications
 *      - insertion
 *          - Boolean add(E)
 *          - Boolean addAll(Collection E)
 *
 *      - iterate
 *          - forEach
 *          - Stream stream
 *          - iterator iterator
 *              - next()
 *              - hasNext()
 *
 *      - remove
 *          - remove(Object o)
 *          - removeAll(Collection E)
 *
 *      - inspect
 *          - contains(Object e)
 *          - containsAll(Collection E)
 *          - int size()
 *          - isEmpty()
 *
 *      - clear()
 *      - toArray()
 *
 */
