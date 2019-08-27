import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Mini_Max_Sum_VK

 {

    // Complete the miniMaxSum function below.
    static void miniMaxSum(int[] arr) 
    {
      int max=0;

      for(int i=0;i<arr.length;i++)
      {
          max=i;
            for (int j = i; j < arr.length; j++)
            { 
                if(arr[j]>arr[max])
                {
                    max=j;

                }
            }
            int temp=arr[max];
            arr[max]=arr[i];
            arr[i]=temp;

      }
      long maxz=(long)arr[0]+arr[1]+arr[2]+arr[3];
      long min=(long)arr[1]+arr[2]+arr[3]+arr[4];

      System.out.print(min+" "+maxz);

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[5];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        miniMaxSum(arr);

        scanner.close();
    }
}
