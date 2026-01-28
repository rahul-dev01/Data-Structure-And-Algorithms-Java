import java.util.HashMap;

public class QuestionIsomorphicString {

    static boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()){
            return false ;
        }
        HashMap<Character , Character> strMap = new HashMap<>();
        for(int i = 0 ; i < s.length(); i++){
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);
            if(strMap.containsKey(ch1)){
                if(strMap.get(ch1) != t.charAt(i)){
                    return false ;
                }
            }
            else if(strMap.containsValue(ch2)){
                return false ;
            }
            else{
                strMap.put(ch1, ch2);
            }
        }
        return true ;
    }
    public static void main(String[] args) {
        String str1 = "aab" ;
        String str2 = "yyz" ;
        System.out.println(isIsomorphic(str1, str2));
    }
}
