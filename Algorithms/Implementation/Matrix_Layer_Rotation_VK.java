import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Matrix_Layer_Rotation_VK {

    // Complete the matrixRotation function below.
    static void matrixRotation(int[][] a, int r)
    {
        
       int m = a.length;
       int n = a[0].length;
       int min=0;
       if(m<n)
       min=m/2;
       else
       min=n/2;
        int st[]=new int[min];
       // r=r%(2*(m+n-2));

        for (int i = 0; i < min; i++) 
        {
            int rot=r%(2*(m+n-2-4*i));
        for(int x=0;x<rot;x++)
        {
            
                st[i] = a[i][i];
                // first row
                for (int j = i; j < n - i - 1; j++) {
                    a[i][j] = a[i][j + 1];
                }
                // last column
                for (int j = i; j < m - i - 1; j++) {
                    a[j][n - i - 1] = a[j + 1][n - i - 1];
                }
                // last row
                for (int j = n - i - 1; j > i; j--) {
                    a[m - i - 1][j] = a[m - i - 1][j - 1];
                }
               
                // first colum
                
                for (int j = m - i - 1; j > i + 1; j--) {
                   // System.out.println("i="+i+"j="+j);
                    a[j][i] = a[j - 1][i];
                }
                a[i + 1][i] = st[i];
            }
        }
       

       //output
       for(int i=0;i<m;i++)
       {
           for(int j=0;j<n;j++)
           {
               System.out.print(a[i][j]+" ");
           }
            System.out.println();
       }
    }

    public static void main(String[] args)  {
        Scanner sc=new Scanner(System.in);
       

        int m =sc.nextInt();

        int n = sc.nextInt();

        int r = sc.nextInt();
        sc.nextLine();

        int[][] matrix = new int[m][n];

        for (int i = 0; i < m; i++) {
            

            for (int j = 0; j < n; j++)
            {
               matrix[i][j]=sc.nextInt();
            }
           
           
        }
       
        matrixRotation(matrix, r);

       
    }
}
