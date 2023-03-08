import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Permutation {

    public static ArrayList<ArrayList> probabilityPermutation(int[] possibleNums, int len) {

        ArrayList<ArrayList> possibleNums2 = new ArrayList<ArrayList>();
        ArrayList<ArrayList> perm = new ArrayList<ArrayList>();

        ArrayList<ArrayList> perm2;

        for(int i = 0; i < possibleNums.length; i++) {
            possibleNums2.add(new ArrayList<Integer>(Arrays.asList(possibleNums[i])));
        }

        perm2 = (ArrayList<ArrayList>) possibleNums2.clone();

        for (int j = 0; j < len - 1; j++) {
            for (int i = 0; i < possibleNums2.size(); i++) {

                for (int x = 0; x < perm2.size(); x++) {
                    ArrayList<Integer> temp = (ArrayList<Integer>) possibleNums2.get(i).clone();
                    ArrayList<Integer> perm2C = (ArrayList<Integer>) perm2.get(x).clone();

                    temp.addAll(perm2C);

                    ArrayList<Integer> newPerm = temp;

                    perm.add(newPerm);

                }
            }
            perm2 = (ArrayList<ArrayList>) perm.clone();
            perm.clear();
        }

        return perm2;
    }

    public static ArrayList<ArrayList> permute(ArrayList<Integer> values) {
        ArrayList<ArrayList> possibleNums = new ArrayList<>();
        for(int i = 0; i < values.size(); i++) {
            possibleNums.add(new ArrayList<Integer>(Arrays.asList(values.get(i))));
        }

        ArrayList<ArrayList> perm = new ArrayList<>();
        perm.add(possibleNums);

        for (int i = 0; i < possibleNums.size(); i++) {
            ArrayList<Integer> num = possibleNums.get(i);


        }

        return possibleNums;
    }

    public static String printPermutn(String str, String ans, String builder)
    {

        // If string is empty
        if (str.length() == 0) {
            builder = (ans + " ");
        }

        for (int i = 0; i < str.length(); i++) {

            // ith character of str
            String letter = str.charAt(i) + "";

            // Rest of the string after excluding
            // the ith character
            String ros = str.substring(0, i) +
                    str.substring(i + 1);

            // Recursive call
            printPermutn(ros, ans + letter, builder);

        }
        return builder;
    }



    /*
    private static ArrayList<Integer> swap(ArrayList<Integer> list, int ind1, int ind2) {
        ArrayList<Integer> copy = (ArrayList<Integer>) list.clone();

        copy.set(ind1, list.get(ind2));
        copy.set(ind2, list.get(ind1));

        return copy;
    }

     */

}
