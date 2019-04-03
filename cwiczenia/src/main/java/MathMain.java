import java.util.Arrays;
import java.util.List;

public class MathMain {

    public static void main(String[] args) {

        List<Integer> data = Arrays.asList(5, -20, 121, 13, -87, 43);

        getResult(data, new MinOperation());

        getResult(data, new MaxOperation());
    }

    public static void getResult(List<Integer> numbers,
                                 MathOperation operation) {

        Integer result = operation.calculate(numbers);
        System.out.println("Wynik: " + result);
    }
}