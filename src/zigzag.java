import java.util.Scanner;

public class zigzag {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int n=inp.nextInt();
        pzz(n);
    }
    static void pzz(int n){
        if(n==0){
            return;
        }
        System.out.println("pre"+n);
        pzz(n-1);
        System.out.println("in"+n);
        pzz(n-1);
        System.out.println("post"+n);

    }
}
