import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Quicksort1_VK {

    // Complete the quickSort function below.
    static void quickSort(int[] arr) {
        int n=arr.length;
        for(int i=1;i<n;i++)
        if(arr[i]<arr[0])System.out.print(arr[i]+ " ");

        System.out.print(arr[0]+ " ");
        
        for(int i=1;i<n;i++)
        if(arr[i]>arr[0])System.out.print(arr[i]+ " ");
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
       

        int n = scanner.nextInt();
        

        int[] arr = new int[n];

        

        for (int i = 0; i < n; i++) {
            
            arr[i] = scanner.nextInt();
        }

        quickSort(arr);

        

        scanner.close();
    }
}
