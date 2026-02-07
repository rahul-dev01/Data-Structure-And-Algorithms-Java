public class StringPermutation {

    static void printPermutation(String str , String empty){

        if(str.equals("")){
            System.out.println(empty);
            return ;
        }

        for(int i = 0 ; i < str.length() ; i++){
            char ch = str.charAt(i); 
            String left = str.substring(0, i) ;
            String right = str.substring(i + 1) ;
            String rem = left + right ; 

            printPermutation(rem, empty + ch);
        }
    }   

    public static void main(String[] args) {
        String str = "abc" ; 
        printPermutation(str , "");
    }
}
