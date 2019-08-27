import java.io.*;
import java.util.*;

public class BotClean_VK
    static int count=0,x=0,y=0;
    static int c=0;
    static int min=9999999;
    static Map<String,String> way=new HashMap<String,String>();
    public static void main(String[] arg) 
    {
        bot_cleanmg obj1=new bot_cleanmg();

        Scanner sc=new Scanner(System.in);
        //taking the bot value
        String store=sc.next();
        x=Integer.parseInt(store);
        store=sc.next();
        y=Integer.parseInt(store);

        

        String board[][]=new String[5][5];
        
        count=0;
        store=sc.nextLine();
        for (int i=0;i<5;i++)
        {

            store=sc.nextLine();
            for(int j =0;j<5;j++)
            {
                board[i][j]=store.charAt(j)+"";   
                if(store.charAt(j)=='d')
                    count++;
            }
        } 

        
        int dirt[][]=new int[count][3];

        count=0;
        for (int i=0;i<5;i++)
        {

            for(int j =0;j<5;j++)
            {

                if(board[i][j].charAt(0)=='d')
                {
                    dirt[count][0]=count+1;
                    dirt[count][1]=i;
                    dirt[count][2]=j;
                    count++;
                } 
            }
        } 

        

        
        obj1.ways(dirt,0);
        obj1.nextmove(dirt);

    }

    private static void ways(int[][] arr, int index)
    {
        if(index >= count - 1)
        { //If we are at the last element - nothing left to permute

            //setting pattern of ways
            String temp="";
            for(int j=0;j<count;j++)
            {
                temp=temp+arr[j][0]+",";

            }

            //counting number of moves
            int nomove=0;
            for(int j=0;j<count-1;j++)
            {
                nomove+=Math.abs(arr[j][1]-arr[j+1][1])+Math.abs(arr[j][2]-arr[j+1][2]);
            }
            nomove+=Math.abs(x-arr[0][1])+Math.abs(y-arr[0][2]);
            if(nomove<min)
                min=nomove;
            way.put(nomove+"",temp);

            c++;  
            return;
        }

        for(int i = index; i < count; i++)
        { 

            //Swap the elements at indices index and i

            int t1 = arr[index][0];
            arr[index][0] = arr[i][0];
            arr[i][0] = t1;

            int t2 = arr[index][1];
            arr[index][1] = arr[i][1];
            arr[i][1] = t2;

            int t3 = arr[index][2];
            arr[index][2] = arr[i][2];
            arr[i][2] = t3;

            
            ways(arr, index+1);

            //Swap the elements back
            t1 = arr[index][0];
            arr[index][0] = arr[i][0];
            arr[i][0] = t1;

            t2 = arr[index][1];
            arr[index][1] = arr[i][1];
            arr[i][1] = t2;

            t3 = arr[index][2];
            arr[index][2] = arr[i][2];
            arr[i][2] = t3;
        }
    } 
    
    public void nextmove(int dirt[][])
    {
        String temp=way.get(min+"");int pos=0;
        for(int i=0;i<5;i++)
        {
            if(temp.charAt(i)==',')
            {
                pos=i;
                break;
            }
        }
        temp=temp.substring(0,pos);
        int g=Integer.parseInt(temp);
        if(dirt[g-1][1]==x && dirt[g-1][2]==y)
            System.out.println("CLEAN");

        if(dirt[g-1][1]>x )
            System.out.println("DOWN");

        else if(dirt[g-1][1]<x )
            System.out.println("UP");
        else if(dirt[g-1][2]>y)
            System.out.println("RIGHT");
        else if(dirt[g-1][2]<y)
            System.out.println("LEFT");

    }

}