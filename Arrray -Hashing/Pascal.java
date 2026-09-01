import java.util.*;

public class Pascal {

    public static List<Integer> getRow(int rowIndex) {

        List<Integer> previous = new ArrayList<>();

        previous.add(1);

        for (int i = 1; i <= rowIndex; i++) {

            List<Integer> current = new ArrayList<>();

            current.add(1);

            for (int j = 1; j < i; j++) {
                current.add(previous.get(j - 1) + previous.get(j));
            }

            current.add(1);

            previous = current;
        }

        return previous;
    }

    public static void main(String[] args) {

        int rowIndex = 3;

        List<Integer> result = getRow(rowIndex);

        System.out.println(result);
    }
}