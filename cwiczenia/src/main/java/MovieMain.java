import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MovieMain {

    public static void main(String[] args) {
        List<Movie> movies = Arrays.asList(
                new Movie("Avatar", 180, 5.2,
                        categories(MovieCategory.SCIFI, MovieCategory.DOCUMENTARY)),

                new Movie("Rambo", 90, 8.0,
                        categories(MovieCategory.ACTION, MovieCategory.COMEDY)),

                new Movie("Rocky", 100, 6.8,
                        categories(MovieCategory.ACTION, MovieCategory.DRAMA)),

                new Movie("Godfather", 200, 9.3,
                        categories(MovieCategory.FAMILY, MovieCategory.HORROR, MovieCategory.ACTION)),

                new Movie("Despicable Me", 100, 10.0,
                        categories(MovieCategory.COMEDY, MovieCategory.DRAMA, MovieCategory.FAMILY))
        );

        System.out.println(movies);
    }

    public static Set<MovieCategory> categories(MovieCategory... c) {
        Set<MovieCategory> result = new HashSet<>();
        for (MovieCategory e : c) {
            result.add(e);
        }
        return result;
    }
}