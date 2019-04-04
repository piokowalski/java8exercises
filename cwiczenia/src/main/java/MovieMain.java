import java.util.*;
import java.util.stream.Collectors;


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

        System.out.println("-.-.-.-Sorting - rating.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-");

        //Sorting - rating
        movies.stream()
                .sorted((m1, m2) -> (int) (m1.getRating() - m2.getRating()))
                .collect(Collectors.toList())
                .forEach(System.out::println);
        System.out.println("-.-.-.No horrors on the list.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-");
        //No horrors on the list
        movies.stream()
                .filter( f-> !f.getCategories().contains(MovieCategory.HORROR))
                .collect(Collectors.toList())
                .forEach(System.out::println);
        System.out.println("-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-");
        //Remove movies with rating <7
        movies.stream()
                .filter(m -> m.getRating() >=7)
                .collect(Collectors.toList())
                .forEach(System.out::println);
        System.out.println("-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-");
        //Sorting by length from longest to shortest
        movies.stream()
                .sorted((m1, m2) -> m2.getLength() - m1.getLength())
                .collect(Collectors.toList())
                .forEach(System.out::println);
        System.out.println("-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-");
        // Sum of length of all movies
        int totalLength = movies.stream()
        .map(d ->d.getLength())
                .reduce(0, (a,e) -> a+e);
        System.out.println(totalLength);

        System.out.println("-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-");
        // Movies name sorting
        movies.stream()
                .map(f -> f.getTitle())
                .sorted()
                .collect(Collectors.toList())
                .forEach(System.out::println);
        System.out.println("-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-");
        // Generating set of all categories
        //(using flatMap)
        movies.stream()
                .map(Movie::getCategories)
                .flatMap(c -> c.stream())
                .collect(Collectors.toSet())
                .forEach(System.out::println);

    }


    public static Set<MovieCategory> categories(MovieCategory... c) {
        Set<MovieCategory> result = new HashSet<>();
        for (MovieCategory e : c) {
            result.add(e);
        }
        return result;
    }
}