import java.util.*;

public class QuestionValidAnagram {

    static boolean checkAnagram(String s , String t){
        if (s.length() != t.length()) {
            return false ; 
        }
        HashMap<Character , Integer> strMap = new HashMap<>();
        for(int i = 0 ; i < s.length() ; i++){
            strMap.put(s.charAt(i), strMap.getOrDefault(s.charAt(i), 0) + 1);
        }

        for (int i = 0; i < s.length(); i++) {
            char ch = t.charAt(i);

            if (!strMap.containsKey(ch)) {
                return false;
            }

            strMap.put(ch, strMap.get(ch) - 1);

            if (strMap.get(ch) == 0) {
                strMap.remove(ch);
            }
        }
        return strMap.isEmpty();
    }

    public static void main(String[] args) {
        String s = "listen" ; 
        String t = "stneil" ;

        System.out.println(checkAnagram(s, t));
    }
}