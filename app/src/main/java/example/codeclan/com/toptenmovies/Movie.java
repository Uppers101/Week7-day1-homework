package example.codeclan.com.toptenmovies;
/**
 * Created by user on 17/04/2017.
 */

public class Movie {
    private String title;
    private String genre;
    private int currentRanking;

    public Movie(String title, String genre, int currentRanking){
        this.title = title;
        this.genre = genre;
        this.currentRanking = currentRanking;
    }

    public String getTitle(){
        return this.title;
    }

    public String getGenre(){
        return this.genre;
    }

    public int getRating() {
        return this.currentRanking;
    }

    public void setTitle(String newTitle) {
        this.title = newTitle;
    }

    public void setGenre(String newGenre) {
        this.genre = newGenre;
    }

    public void setFilmRating(int newFilmRating) {
        this.currentRanking = newFilmRating;
    }

    public String getAllDetails() {
        return "Title: " + this.title + " Genre: " + this.genre + " Rating: " + this.currentRanking;
    }
}