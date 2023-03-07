import java.util.ArrayList;
import java.util.Arrays;

public class Main2 {
    public static void main(String[] args) {

        int[] possibleNums = {1,2,3,4};
        ArrayList<ArrayList> possibleNums2 = new ArrayList<ArrayList>();
        ArrayList<ArrayList> perm = new ArrayList<ArrayList>();

        ArrayList<ArrayList> perm2;
        ArrayList<Integer> newPerm = new ArrayList<>();

        for(int i = 0; i < possibleNums.length; i++) {
            possibleNums2.add(new ArrayList<Integer>(Arrays.asList(possibleNums[i])));
        }

        perm2 = (ArrayList<ArrayList>) possibleNums2.clone();

        for (int j = 0; j < 3; j++) {
            for (int i = 0; i < possibleNums2.size(); i++) {

                for (int x = 0; x < perm2.size(); x++) {
                    ((ArrayList<Integer>) possibleNums2.get(i).clone()).removeAll(newPerm);
                    ArrayList<Integer> temp = possibleNums2.get(i);
                    ArrayList<Integer> perm2C = (ArrayList<Integer>) perm2.get(x).clone();

                    temp.addAll(perm2C);

                    newPerm = temp;

                    perm.add(newPerm);

                }
            }
            perm2 = (ArrayList<ArrayList>) perm.clone();
            perm.clear();
        }

        System.out.println(perm2);
        System.out.println(perm2.size());
    }
}
