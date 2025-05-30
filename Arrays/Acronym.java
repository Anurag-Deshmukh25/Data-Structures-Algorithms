package Arrays;
import java.util.List;
import java.util.Arrays;


public class Acronym {
    public boolean acronym(List<String> words, String s){
        if(words.size() != s.length()) return false;
        for(int i = 0; i < words.size(); i++){
            if(s.charAt(i) != words.get(i).charAt(0)) return false;
        }

        return true;
    }

    public static void main(String[] args) {
        Acronym acronymChecker = new Acronym();
        List<String> words = Arrays.asList("National", "Aeronautics", "Space", "Administration");
        String s = "NASA";

        boolean isAcronym = acronymChecker.acronym(words, s);
        System.out.println("Is Acronym: " + isAcronym); // Output: true
    }
}
