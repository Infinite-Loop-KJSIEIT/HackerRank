import java.io.*;
import java.util.*;

public class Bot_saves_princess_VK 
{

    public static void main(String[] args) 
    {
        
      Scanner sc=new Scanner(System.in);
      
        int n=sc.nextInt();
        String s[][]=new String[n][n];
        String waste=sc.nextLine();
        int pp1=0,pp2=0,pm1=0,pm2=0,d=0,u=0,r=0,l=0;
        
        for (int i=0;i<n;i++)
        {
            
            String temp=sc.nextLine();
            for(int j =0;j<n;j++)
            {
             s[i][j]=temp.charAt(j)+"";   
             if(temp.charAt(j)=='p')
             {
             pp1=i;
             pp2=j;
            }
             if(temp.charAt(j)=='m')
             {
              pm1=i;
              pm2=j;
             }
            }
        }
        d=pp1-pm1;
        u=pm1-pp1;
        r=pp2-pm2;
        l=pm2-pp2;
        
        for (int i=0;i<d;i++)
        System.out.println("DOWN");
        for (int i=0;i<u;i++)
        System.out.println("UP");
        for (int i=0;i<l;i++)
        System.out.println("LEFT");
        for (int i=0;i<r;i++)
        System.out.println("RIGHT");
        
    }
}