

import java.util.Scanner;

public class Tic_tac_toe_VK
{

    private static final Scanner sc = new Scanner(System.in);    
    static  char ms=' ',os= ' ';
     
    public static void main(String[] args) 
    {
      String mys=sc.nextLine();
      ms=mys.charAt(0);
    
      if(ms=='X')
        os='O';
      else
        os='X';
    
      char[][] board=new char[3][3];
      int dep=0;
      for(int i=0;i<3;i++)
        {
                String s=sc.nextLine();
                if(s.charAt(0)=='_')
                    dep++;
                if(s.charAt(1)=='_')
                    dep++;
                if(s.charAt(2)=='_')
                    dep++;
                board[i][0]=s.charAt(0);
                board[i][1]=s.charAt(1);
                board[i][2]=s.charAt(2);
            
        }
      dep=9-dep;
      System.out.println(findBestMove(board,dep));
            

       
    }
    public  static int evaluate(char b[][]) 
    { 
       
        for (int i = 0; i<3; i++) 
        { 
            if (b[i][0]==b[i][1] && b[i][1]==b[i][2]) 
            { 
                if (b[i][0]==ms) 
                   return +10; 
                else if (b[i][0]==os) 
                   return -10; 
            } 
            
            if (b[0][i]==b[1][i] && b[1][i]==b[2][i]) 
            { 
                if (b[0][i]==ms) 
                    return +10; 
                else if (b[0][i]==os) 
                    return -10; 
            } 
        } 
      
        if (b[0][0]==b[1][1] && b[1][1]==b[2][2]) 
        { 
            if (b[0][0]==ms) 
                return +10; 
            else if (b[0][0]==os) 
                return -10; 
        } 
        if (b[0][2]==b[1][1] && b[1][1]==b[2][0]) 
        { 
            if (b[0][2]==ms) 
                return +10; 
            else if (b[0][2]==os) 
                return -10; 
        } 
      
       
        return 0; 
    }
    public static int minimax(char board[][], int depth, boolean isMax) 
    { 
        int score = evaluate(board); 
    
        if (score == 10) 
            return score;
        if (score == -10) 
            return score; 
      
       
        if (isMovesLeft(board)==false) 
            return 0; 
      
       
        if (isMax) 
        { 
            int best = -1000; 
      
            for (int i = 0; i<3; i++) 
            { 
                for (int j = 0; j<3; j++) 
                { 
           
                    if (board[i][j]=='_') 
                    { 
                   
                        board[i][j] =ms; 
                        best = Math.max( best,minimax(board, depth+1, !isMax) ); 
      
                        board[i][j] = '_'; 
                    } 
                } 
            } 
            return best; 
        } 
      
      
        else
        { 
            int best = 1000; 
      
          
            for (int i = 0; i<3; i++) 
            { 
                for (int j = 0; j<3; j++) 
                { 
                  
                    if (board[i][j]=='_') 
                    { 
                     
                        board[i][j] = os; 
      
                    
                        best = Math.min(best, 
                               minimax(board, depth+1, !isMax)); 
      
                    
                        board[i][j] = '_'; 
                    } 
                } 
            } 
            return best; 
        } 
    }
    private static boolean isMovesLeft(char[][] board)
    { 
        for (int i = 0; i<3; i++) 
        {
            for (int j = 0; j<3; j++) 
            {
                if (board[i][j]=='_') 
                    return true; 
            }
        }
        return false; 
    } 
    
    public static String  findBestMove(char board[][],int dep) 
    { 
        int bestVal = -1000; 
        int row=0;
        int col=0;
        int flag=0;
     
        for (int i = 0; i<3; i++) 
        { 
            for (int j = 0; j<3; j++) 
            { 
               
                if (board[i][j]=='_') 
                { 
                  
                    board[i][j] = ms; 
      
                    // compute evaluation function for this 
                    // move. 
                    int moveVal = minimax(board, dep, false); 
      
                    // Undo the move 
                    board[i][j] = '_'; 
      
                    // If the value of the current move is 
                    // more than the best value, then update 
                    // best/ 
                    if (moveVal > bestVal) 
                    { 
                        row = j; 
                        col = i; 
                        bestVal = moveVal; 
                    } 
                    
                    if(bestVal==10)
                    {
                        flag=1;
                        break;
                     }
                } 
            } 
            if(flag==1)
            break;
        } 
      
       
      
        return (col+" "+row); 
    } 

}
