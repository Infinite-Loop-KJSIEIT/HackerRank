import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Hackerrank_in_String_VK {

    // Complete the hackerrankInString function below.
    static String hackerrankInString(String s) {
        char[] c={'h','a','c','k','e','r','r','a','n','k'};
        int j=0;
        for(int i=0;i<s.length();i++)
        {
            if(j>9)
            break;
            if(c[j]==s.charAt(i))
            j++;
        }
        if(j>9)
        return("YES");
        else
        return("NO");


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();

            String result = hackerrankInString(s);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
