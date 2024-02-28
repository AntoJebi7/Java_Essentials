package Problems;

import java.util.Scanner;

public class binary_search {
    public static int b_search(int arr[],int lf,int rt, int element) {
        //int mid = 0;
        if (rt >= 1) {
            int mid = lf + (rt - 1)/ 2;
            if (arr[mid] == element) {
                System.out.println(mid);
            }
            if (arr[mid] > element) {
                return b_search(arr, 0,mid - 1, element);
            }
            if (arr[mid] < element) {
                return b_search(arr, mid + 1, rt, element);
            }
        }
        return -1;
    }

    public static void main(String args[]){
        binary_search bs = new binary_search();
        System.out.println("enter the number of elements in an array");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the array elements");
        for (int i = 0; i<n;i++){
            System.out.println("enter elemnt "+ (i+1) + " of index "+ i + " : ");
            arr[i]= input.nextInt();
        }
        System.out.println("The Entered array elements are : ");
        StringBuilder concat = new StringBuilder();
        for(int j=0;j<n;j++){
            //System.out.println(arr[j]+" ");
            concat.append(arr[j]);
            if (j != n - 1) {
                concat.append(" ");
            }
        }
        System.out.println(concat.toString());
        System.out.println("Enter the element to be searched : ");
        int key = input.nextInt();

        int result= bs.b_search(arr,0,n-1,key);
        
        input.close();
    }

}
