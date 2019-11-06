import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Closest_Number_VK {

    // Complete the closestNumbers function below.
    static void closestNumbers(int[] arr) {
        int n=arr.length;
        Arrays.sort(arr);
        int min=1000000;
        for(int i=0;i<n-1;i++)
        if(arr[i+1]-arr[i]<min)
        min=arr[i+1]-arr[i];

        for(int i=0;i<n-1;i++)
        if(arr[i+1]-arr[i]==min)
        System.out.print(arr[i]+" "+arr[i+1]+" ");

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        
        int n = scanner.nextInt();
        

        int[] arr = new int[n];

        

        for (int i = 0; i < n; i++) {
            
            arr[i] =  scanner.nextInt();
        }

        closestNumbers(arr);

        
        scanner.close();
    }
}
