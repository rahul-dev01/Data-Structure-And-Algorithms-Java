// Toggle all the character of the string 

import java.util.Scanner;

public class QuestionString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder str = new StringBuilder(sc.nextLine());

        
    
        for(int i = 0 ; i < str.length() ; i++ ){

            char ch = str.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                str.setCharAt(i, (char)(ch - 32));
            }
            else if (ch >= 'A' && ch <= 'Z') {
                str.setCharAt(i, (char)(ch + 32));
            }
        }

        System.out.println(str);
    }
}
