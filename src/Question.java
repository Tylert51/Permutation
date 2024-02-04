import java.util.ArrayList;

public class Question {
    public static void main(String[] args) {
    
        
        ArrayList<String> ans = new ArrayList<>();

        Permutation.permute("12345678", "", ans);

        ArrayList<String> subset = new ArrayList<>();


        for(int i = 0; i < ans.size(); i++){
            
            String perm = ans.get(i).trim();


            boolean first = false;

            int index5 = perm.indexOf("5");            
            if(index5 != 0 && index5 != perm.length() - 1) {
            
                int numAfter = Integer.parseInt(perm.charAt(index5+1) + "");
                int numBefore = Integer.parseInt(perm.charAt(index5-1) + "");

                if(numAfter > 5 && numBefore > 5) {
                    first = true;
                }   
            }              
            
            int index6 = perm.indexOf("6");            
            if(index6 != 0 && index6 != perm.length() - 1 && first) {
            
                int numAfter = Integer.parseInt(perm.charAt(index6+1) + "");
                int numBefore = Integer.parseInt(perm.charAt(index6-1) + "");

                if(numAfter < 6 && numBefore < 6) {
                    subset.add(perm);
                }   
            }
            


        }

        System.out.println(subset);
        System.out.println(subset.size());

        
        
    }
}
