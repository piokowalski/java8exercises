import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;

public class ReduceMain {

    public static void main(String[] args) {

        List<Integer> n = Arrays.asList(3, 5, 8, -1, 4);

        int sum = n.stream()
                .reduce(0, (a, e) -> a + e);
        System.out.println("Suma: " + sum);

        int max = n.stream()
                .reduce(0, (a, e) -> a > e ? a : e);
//            .reduce(0, (a, e) -> {
//                if (a > e) {
//                    return a;
//                } else {
//                    return e;
//                }
//            });
        System.out.println("Max: " + max);

        List<Integer> even = n.stream()
                .reduce(new ArrayList<>(),
                        (a, e) -> {
                            if (e % 2 == 0) {
                                a.add(e);
                            }
                            return a;
                        },
                        ((list1, list2) -> {
                            ArrayList<Integer> list = new ArrayList<>();
                            list.addAll(list1);
                            list.addAll(list2);
                            return list;
                        }));

        even.forEach(System.out::println);
    }
}