
public class QuestionPrintAllSubString {
    public static void main(String[] args) {
        String str = "abcd" ; //0 to 3

        for(int i = 0 ; i < str.length() ; i++ ){
            for(int j = i+1 ; j <= str.length() ; j++){
                System.out.println(str.substring(i, j ) + " ");
            }
        }
 
    }
}
