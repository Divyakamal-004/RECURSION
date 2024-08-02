import java.util.Scanner;

public class Towerofhanoi {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int n=inp.nextInt();
        int t1d=inp.nextInt();
        int t2d=inp.nextInt();
        int t3d=inp.nextInt();
        toh(n,t1d,t2d,t3d);


    }
    static void toh(int n,int t1id,int t2id,int t3id){
        if(n==0){
            return;
        }
        toh(n-1,t1id,t3id,t2id);//this will print the instruction to move two disc from tower 1 to tower 3 using tower 2
        System.out.println(n+"["+t1id+"->"+t2id+"]");
        toh(n-1,t3id,t2id,t1id);//this will move two disc from t3 to t2 using t1 and we already moved last disc to tower 2
    }
}
