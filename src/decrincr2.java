import java.util.Scanner;

public class decrincr2 {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int n=inp.nextInt();
        pdi(n);
    }
    static void pdi(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        pdi(n-1);
        System.out.println(n);
    }
}
