package Movies.users;

import Movies.rooms.Seat;
import Movies.showtimes.Showtimes;

public class Reservation {

    //attribute
private Showtimes showtimes;
private Person person;
private Seat seat;
private int price;


    //constructor

    public Reservation(Showtimes showtimes, Person person, Seat seat, int price) {
        this.showtimes = showtimes;
        this.person = person;
        this.seat = seat;
        this.price = price;
    }


    // methods


    //getter and setter

    public Showtimes getShowtimes() {
        return showtimes;
    }

    public void setShowtimes(Showtimes showtimes) {
        this.showtimes = showtimes;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Seat getSeat() {
        return seat;
    }

    public void setSeat(Seat seat) {
        this.seat = seat;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
