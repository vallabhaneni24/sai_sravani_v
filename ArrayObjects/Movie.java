import java.util.*;

class Movie {
    private int yearReleased;
    private double rating;
    private double budget;
    private double collectionAmount;

    // Constructor
    public Movie(int yearReleased, double rating, double budget, double collectionAmount) {
        this.yearReleased = yearReleased;
        this.rating = rating;
        this.budget = budget;
        this.collectionAmount = collectionAmount;
    }

    // Getters and Setters
    public int getYearReleased() {
        return yearReleased;
    }

    public void setYearReleased(int yearReleased) {
        this.yearReleased = yearReleased;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public double getCollectionAmount() {
        return collectionAmount;
    }

    public void setCollectionAmount(double collectionAmount) {
        this.collectionAmount = collectionAmount;
    }

    // Comparator to sort by rating and profit
    public static Comparator<Movie> ratingAndProfitComparator = Comparator
            .comparing(Movie::getRating)
            .thenComparing((m1, m2) -> Double.compare(m2.getCollectionAmount() - m2.getBudget(),
                    m1.getCollectionAmount() - m1.getBudget()));

    // Comparator to sort by year released and rating
    public static Comparator<Movie> yearAndRatingComparator = Comparator
            .comparing(Movie::getYearReleased)
            .thenComparing(Movie::getRating);

    // Example usage
    public static void main(String[] args) {
        // Creating a list of movies
        List<Movie> movieList = new ArrayList<>();
        movieList.add(new Movie(2005, 8.5, 50.0, 200.0));
        movieList.add(new Movie(2010, 7.8, 80.0, 150.0));
        movieList.add(new Movie(2005, 8.0, 40.0, 180.0));

        // Sorting the movies by rating and profit
        movieList.sort(Movie.ratingAndProfitComparator);
        System.out.println("Sorted Movies by Rating and Profit:");
        movieList.forEach(movie -> System.out.println("Year: " + movie.getYearReleased() +
                ", Rating: " + movie.getRating() +
                ", Profit: $" + (movie.getCollectionAmount() - movie.getBudget())));

        // Sorting the movies by year released and rating
        movieList.sort(Movie.yearAndRatingComparator);
        System.out.println("\nSorted Movies by Year Released and Rating:");
        movieList.forEach(movie -> System.out.println("Year: " + movie.getYearReleased() +
                ", Rating: " + movie.getRating()));
    }
}