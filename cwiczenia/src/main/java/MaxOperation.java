import java.util.List;

public class MaxOperation
        implements MathOperation {

    @Override
    public Integer calculate(List<Integer> list) {
        Integer max = Integer.MIN_VALUE;

        for (Integer i : list) {
            if (i > max) {
                max = i;
            }
        }

        return max;
    }
}

