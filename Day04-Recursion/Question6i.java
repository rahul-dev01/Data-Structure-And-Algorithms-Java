public class Question6i {

    static int powfn(int p , int q ){
        if(q == 0) return 1 ;
        return powfn(p, q-1) * p ;
    }

    public static void main(String[] args) {
        System.out.println(powfn(2, 3));
    }
}
