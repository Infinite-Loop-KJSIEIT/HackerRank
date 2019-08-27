import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Time_Conversion_VK
{

    /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s)
   {
       if(s.charAt(8)=='A')
       {
           if((s.substring(0,2).equals("12")))
           return("00"+s.substring(2,8));

           else
           return(s.substring(0,8));

           //return(temp+s.substring(2,8));
       }
       
       else
       {
           int temp=Integer.parseInt(s.substring(0,2));
           if(temp!=12)
           temp+=12;
           return(temp+s.substring(2,8));
       }
        /*
         * Write your code here.
         */

    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scan.nextLine();

        String result = timeConversion(s);

        bw.write(result);
        bw.newLine();

        bw.close();
    }
}
