 import java.io.*;
import java.util.*;

public class BotClean_Stochastic_VK
{
    
    public static void main(String[] arg) 
    {

        Scanner sc=new Scanner(System.in);
        bot_clean2 w=new bot_clean2();
        
        String n=sc.nextLine();
        int posr=n.charAt(0)-48; 
        int posc=n.charAt(2)-48;
        
        char s[][]=new char[5][5];
        int posdi=0;
        int posdj=0;
        

        
        for (int i=0;i<5;i++)
        {

            String temp=sc.nextLine();
            for(int j =0;j<5;j++)
            {
                s[i][j]=temp.charAt(j);   
                if(temp.charAt(j)=='d')
                {
                    posdi=i;
                    posdj=j;
                }
                    
            }
        } 
        if(posr==posdi && posc==posdj)
        System.out.println("CLEAN");    
        
        else if(posr<posdi )
        System.out.println("DOWN");
        else if(posr>posdi  )
        System.out.println("UP");
        else if(posc<posdj )
        System.out.println("RIGHT");
        else if(posc>posdj)
        System.out.println("LEFT");

        
             

    }
    
    
    
   
}