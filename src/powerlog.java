import java.util.Scanner;

public class powerlog {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int x=inp.nextInt();
        int n=inp.nextInt();
        int xn=power(x,n);
        System.out.println(xn);

    }
   public static int power(int x,int n){
        if(n==0){
            return 1;
        }
        int xpnb2=power(x,n/2);
        int xn=xpnb2*xpnb2;
        if(n%2==1){
            xn=x*xn;
        }
        return xn;


    }
}
