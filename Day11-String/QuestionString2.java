//check palindrome of string 

public class QuestionString2 {

    public static void main(String[] args) {

        // String original = "aabbcbbaa";
        // String reversed = new StringBuilder(original).reverse().toString();

        // if (original.equals(reversed)) {
        // System.out.println("Palindrome");
        // } else {
        // System.out.println("Not Palindrome");
        // }

        String s = "aabbcbbaa";
        int i = 0, j = s.length() - 1;

        boolean isPalindrome = true;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                isPalindrome = false;
                break;
            }
            i++;
            j--;
        }

        System.out.println(isPalindrome ? "Palindrome" : "Not Palindrome");
    }

}
