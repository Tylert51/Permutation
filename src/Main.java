import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // int[] possibleNums = {1,2,3};
        ArrayList<String> ans = new ArrayList<>();

        Permutation.permute("1234", "", ans);

        System.out.println(ans);
        System.out.println(ans.size());

        for(int i = 0; i < ans.size(); i++) {
            System.out.println(ans.get(i));
        }
    }
}
