import java.util.Scanner;

public class MaxArray {
    public static void main(String[] args) {

        System.out.print("enter the number of elements:");
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        int[] arr = new int[n];
        System.out.print("enter the elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = inp.nextInt();
        }
        System.out.print("max of array:");
      int maximum= max(arr,0);
      System.out.print(maximum);

    }
    public static int max(int[] arr,int idx){
        if(idx==arr.length-1){
            return arr[idx];
        }
        int misa=max(arr,idx+1);
        if(misa>arr[idx]){
            return misa;
        }else{
            return arr[idx];
        }
    }
}
