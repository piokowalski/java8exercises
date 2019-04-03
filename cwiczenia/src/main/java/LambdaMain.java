import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class LambdaMain {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>(Arrays.asList(
                "Arek",
                "Artur",
                "Ania",
                "",
                "Paulina",
                "Piotrek",
                "",
                null,
                "Ewelina"
        ));



        for (String s : list) {
            System.out.print("["+s+"]");
        }
        System.out.println();

        //list.removeIf(s -> s == null || s.length() == 0);

        //list.removeIf((String s) -> {
        //    return s == null || s.length() == 0;
        //});

        // usun to co jest null
        list.removeIf(o -> o == null);

        // usun to co ma dlugosc 0
        list.removeIf(s -> s.length() == 0);

        list.removeIf(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s == null || s.length() == 0;
            }
        });

        for (String s : list) {
            System.out.print("["+s+"]");
        }
        System.out.println();

        list.forEach(param -> System.out.println(param.toUpperCase()));

        getLengths(list).forEach(i -> System.out.println(i));

        //Referencja do metody:

        list.forEach(System.out::println);

    }



    public static List<Integer> getLengths(List<String> list) {
        List<Integer> result = new ArrayList<>();

        list.forEach(e -> result.add(e.length()));

//        for (String e : list) {
//            result.add(e.length());
//        }

        return result;
    }
}