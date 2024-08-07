import java.util.Scanner;

public class LastIndex {
    public static void main(String[] args) {
        System.out.print("enter the number of elements:");
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        int[] arr = new int[n];
        System.out.print("enter the elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = inp.nextInt();
        }
        System.out.print("enter the data :");
        int data=inp.nextInt();
        int li=lastidx(arr,0,data);
        System.out.print("last index of the given number: "+li);
    }
   public static int lastidx(int[] arr,int idx,int data){
        if(idx==arr.length){
            return -1;
        }

        int liisa=lastidx(arr,idx+1,data);
        if (liisa == -1) {

            if(arr[idx]==data){
                return idx;
            }
            else {
                return -1;
            }
        }
        else{
            return liisa;
        }

    }
}
