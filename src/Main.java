import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] possibleNums = {1,2,3};
        ArrayList<String> ans = new ArrayList<>();

        Permutation.permute("12345678", "", ans);

        System.out.println(ans);
        System.out.println(ans.size());
    }
}
