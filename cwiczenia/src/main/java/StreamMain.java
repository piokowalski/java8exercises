import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMain {

    public static void main(String[] args) {
        List<Dish> dishes = Arrays.asList(
                new Dish("Pizza", false, 1800),
                new Dish("KFC", false, 2000),
                new Dish("Jablko", true, 50),
                new Dish("BigMac", false, 660),
                new Dish("Falafel", true, 400),
                new Dish("Hummus", false, 300)
        );

        sortByCalories(dishes).forEach(System.out::println);
    }

    public static List<Dish> sortByCalories(List<Dish> dishes) {
        return dishes.stream()
                .sorted((d1, d2) -> d1.getCalories() - d2.getCalories())
                .collect(Collectors.toList());
    }
}