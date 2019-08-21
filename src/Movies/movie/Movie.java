package Movies.movie;

public class Movie {

    //attribute

    private String name;
    private String genre;
    private int runtime;

    //constructor

    public Movie(String name, String genre, int runtime) {
        this.name = name;
        this.genre = genre;
        this.runtime = runtime;
    }


    // methods


    //getter and setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getRuntime() {
        return runtime;
    }

    public void setRuntime(int runtime) {
        this.runtime = runtime;
    }
}
