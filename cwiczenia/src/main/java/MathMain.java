import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class MathMain {

    public static void main(String[] args) {

        List<Integer> data = Arrays.asList(5, -20, 121, 13, -87, 43);

//        getResult(data, new MinOperation());
//
//        getResult(data, new MaxOperation());

//        MathOperation o = l -> Collections.max(l);
//        getResult(data, o);

        getResult(data, list -> Collections.max(list),
                i -> System.out.println("Max to: " + i)); // impl

        getResult(data, superDane -> {
                    Integer max = Integer.MIN_VALUE;

                    for (Integer i : superDane) {
                        if (i > max) {
                            max = i;
                        }
                    }

                    return max;
                },
                wynik -> System.out.println("Wynik pomnozony przez 2 to: " + 2*wynik));
    }

    public static void getResult(List<Integer> numbers,
                                 Function<List<Integer>, Integer> operation,
                                 Consumer<Integer> consumer) {

        Integer result = operation.apply(numbers); // wywolanie

        consumer.accept(result);
    }
}