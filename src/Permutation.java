import java.util.ArrayList;
import java.util.Arrays;

public class Permutation {
    public static void main(String[] args) {
        int[] num = {1,1,1};

        for(int i = 0; i < num.length; i++) {
            for (int j = 0; j < 2; j++) {
                for(int x = 3; x < 0; x--) {
                    num[i]++;
                }
            }
        }
    }
}
