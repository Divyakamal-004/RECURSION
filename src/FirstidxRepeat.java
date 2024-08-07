import java.util.Scanner;

public class FirstidxRepeat {
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

       int F1= idxFind(arr,0,data);

       System.out.println("first index of the given number:"+F1);

    }
    static int idxFind(int[] arr,int idx,int data){
        if(idx==arr.length){
            return -1;
        }
        if(arr[idx]==data){
            return idx;
        }
        else{
            return idxFind(arr,idx+1,data);
        }

        }

    }

