package Problems;
import java.util.*;
import java.io.*;
public class sequential_search {
    public static void seqsearch(int array[], int x){
        int m = array.length;
        boolean found = false;
        for(int i=0;i<m;i++){
            if(array[i]==x){
                System.out.println("element found at index "+ " "+ i +" "+" and position "+" "+ (i+1));
                found = true;
            }
        }
        if (!found) {
            System.out.println("Element not found");
        }
    }
    public static void main(String args[]){

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
        seqsearch(arr,key);
        input.close();
    }

}
