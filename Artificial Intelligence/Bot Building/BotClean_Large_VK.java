import java.io.*;
import java.util.*;

public class BotClean_Large_VK
{
    static int count=0,x=0,y=0;
    
    
    public static void main(String[] arg) 
    {
        
        
        
        Scanner sc=new Scanner(System.in);
        
        //taking the bot value
        String store=sc.next();
        x=Integer.parseInt(store);
        store=sc.next();
        y=Integer.parseInt(store);
        
        //board size
        
        store=sc.next();
        int h=Integer.parseInt(store);
        store=sc.next();
        int b=Integer.parseInt(store);
        
        
        String board[][]=new String[h][b];
        //taking the board value
        count=0;
        store=sc.nextLine();
        for (int i=0;i<h;i++)
        {

            
            store=sc.nextLine();
            for(int j =0;j<b;j++)
            {
                board[i][j]=store.charAt(j)+"";   
                if(store.charAt(j)=='d')
                    count++;
            }
        } 
        
        
        
        int dirt[][]=new int[count][3];
        
        count=0;
        for (int i=0;i<h;i++)
        {
            
            for(int j =0;j<b;j++)
            {
                
                  
                if(board[i][j].charAt(0)=='d')
                   {
                       dirt[count][0]=count;
                       dirt[count][1]=i;
                       dirt[count][2]=j;
                       count++;
                    } 
            }
        } 
        
        int min=1000000;
        int pos=0;
        for (int i=0;i<count;i++)
        {   
            int temp=Math.abs(dirt[i][1]-x)+Math.abs(dirt[i][2]-y);
                if(temp<min)
                   {
                       min=temp;
                       pos=dirt[i][0];
                    } 
            
        } 
        
        if(dirt[pos][1]==x && dirt[pos][2]==y)
         System.out.println("CLEAN");
         else if(dirt[pos][1]>x )
          System.out.println("DOWN");
          else if(dirt[pos][1]<x )
          System.out.println("UP");
          else if(dirt[pos][2]>y )
          System.out.println("RIGHT");
          else if(dirt[pos][2]<y )
          System.out.println("LEFT");
       
       
        
        
    }
    
}