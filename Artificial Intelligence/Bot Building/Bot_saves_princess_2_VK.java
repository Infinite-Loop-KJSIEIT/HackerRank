import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Bot_saves_princess_2_VK 
{

public void nextMove(int n, int r, int c, String [][] grid)
{
    int pi=0;
    int pj=0;
   for(int i = 0; i < n; i++)
        {
            
           for(int j=0; j<n; j++ )
           {
               if(grid[i][j].charAt(0)=='p') 
               {
                   pi=i;
                   pj=j;
                   break;
               }
           }
        }
        if(r<pi)
        System.out.println("DOWN");
        else if(r>pi)
        System.out.println("UP");
        else if(c<pj)
        System.out.println("RIGHT");
        else if(c>pj)
        System.out.println("LEFT");
    
  }

public static void main(String[] args)
{
        Scanner in = new Scanner(System.in);
        int n,r,c;
        n = in.nextInt();
        r = in.nextInt();
        c = in.nextInt();
        solution so=new solution();
        String grid[][] = new String[n][n];


        for(int i = 0; i < n; i++)
        {
            String temp=in.next();
           for(int j=0; j<n; j++ )
               grid[i][j] =temp.charAt(j)+""; 
            
        }

    so.nextMove(n,r,c,grid);

    }
}
