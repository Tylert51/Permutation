import java.util.ArrayList;
import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        ArrayList<Integer> one = new ArrayList<>(Arrays.asList(4,5,6));
        ArrayList<Integer> two = new ArrayList<>();

        two = (ArrayList<Integer>) one.clone();

        System.out.println(two);

    }
}
