import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MathMain {

    public static void main(String[] args) {

        List<Integer> data = Arrays.asList(5, -20, 121, 13, -87, 43);

        getResult(data, new MaxOperation());

        getResult(data, new MinOperation());


//        Using LAMBDAs

        MathOperation o = list -> Collections.max(list);
        getResult(data, o);

        getResult(data, lista -> Collections.min(lista));

    }

    public static void getResult(List<Integer> numbers,
                                 MathOperation operation) {

        Integer result = operation.calculate(numbers);
        System.out.println("Wynik: " + result);
    }
}