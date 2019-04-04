import java.util.Set;

/**
 * public enum MovieCategory {
 *     COMEDY,
 *     HORROR,
 *     THRILLER,
 *     DRAMA,
 *     SCIFI,
 *     CARTOON,
 *     DOCUMENTARY,
 *     FAMILY;
 * }
 */
public class Movie {

    private final String title;

    private final int length;

    private final double rating;

    private final Set<MovieCategory> categories;

    public Movie(String title, int length, double rating,
                 Set<MovieCategory> categories) {
        this.title = title;
        this.length = length;
        this.rating = rating;
        this.categories = categories;
    }

    public String getTitle() {
        return title;
    }

    public int getLength() {
        return length;
    }

    public double getRating() {
        return rating;
    }

    public Set<MovieCategory> getCategories() {
        return categories;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Movie{");
        sb.append("title='").append(title).append('\'');
        sb.append(", length=").append(length);
        sb.append(", rating=").append(rating);
        sb.append(", categories=").append(categories);
        sb.append('}');
        return sb.toString();
    }
}