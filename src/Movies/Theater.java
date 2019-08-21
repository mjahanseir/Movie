package Movies;

import Movies.users.Reservation;
import Movies.movie.Movie;
import Movies.rooms.Rooms;
import Movies.rooms.Seat;
import Movies.showtimes.Showtimes;
import Movies.users.Person;

import java.time.LocalTime;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Theater<Room> {
    private Set<Movie> movies;
    private Set<Room> rooms;
    private List<Showtimes> showtimes;
    private List<Reservation> reservations;

    private final static int GENERAL_ADMISSION = 1000;

    public Theater(Set<Movie> movies, int numRooms, List<Showtimes> showtimes,
                   List<Reservation> reservations) {
        this.movies = movies;
        this.showtimes = showtimes;
        this.reservations = reservations;
        Set<Room> rooms = new HashSet<>();
        for (int i = 1; i <= numRooms; i++) {
            boolean add = rooms.add(new Room(i, 200, 20));
        }
        this.rooms = rooms;
    }

    public Set<Movie> getMovies() {
        return movies;
    }

    public Set<Room> getRooms() {
        return rooms;
    }

    public List<Showtimes> getShowtimes() {
        return showtimes;
    }

    public List<Reservation> getReservations() {
        return reservations;
    }

    public void addMovie(Movie movie) {
        this.movies.add(movie);
    }

    public void removeMovie(Movie movie) {
        this.movies.remove(movie);
    }

    public void addShowtime(Movie movie, Room room, LocalTime startTime) {
        this.showtimes.add(new Showtimes(movie, room, startTime));
    }

    public void removeShowtime(Showtimes showtime) {
        this.showtimes.remove(showtime);
    }

    public Reservation makeReservation(Person person, Movie movie, LocalTime startTime, Seat seat) {
        return this.showtimes.stream()
                .filter(showtime -> showtime.getMovie().equals(movie))
                .filter(showtime -> showtime.getStartTime().equals(startTime))
                .findFirst()
                .map(selectedShowtimes -> new Reservation(selectedShowtimes, seat, person, GENERAL_ADMISSION))
                .orElseThrow(() -> new IllegalArgumentException("no showtime selected"));
    }
}