package Movies.rooms;

import java.util.ArrayList;
import java.util.List;

public class Rooms {

    //attribute
    private int id;
    private List<Seat> seating;


    //constructor

    public Rooms(int id, int capacity, int rows) {

        int numSeatsPerRow = capacity / rows;
        List<Seat> seats = new ArrayList<>();
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= numSeatsPerRow; j++) {
                seats.add(new Seat(j, i));
            }
        }
    }

    // methods


    //getter and setter

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Seat> getSeating() {
        return seating;
    }

    public void setSeating(List<Seat> seating) {
        this.seating = seating;
    }
}
