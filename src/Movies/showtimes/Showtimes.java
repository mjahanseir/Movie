package Movies.showtimes;

import Movies.movie.Movie;
import Movies.rooms.Rooms;

import java.time.LocalTime;

public class Showtimes {
    //attribute
    private Movie movie;
    private Rooms theater;
    private LocalTime startTime;

    //constructor

    public Showtimes(Movie movie, Rooms theater, LocalTime startTime) {
        this.movie = movie;
        this.theater = theater;
        this.startTime = startTime;
    }


    // methods


    //getter and setter

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public Rooms getTheater() {
        return theater;
    }

    public void setTheater(Rooms theater) {
        this.theater = theater;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalTime startTime) {
        this.startTime = startTime;
    }
}
