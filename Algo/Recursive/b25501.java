import java.io.*;
import java.util.*;

public class b25501{
    static int count = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for(int i=0; i<n; i++) {
            count = 0;
            String input = br.readLine();
            bw.write(isPalindrome(input) + " " + count + "\n");
        }

        br.close();
        bw.flush();

    }

    public static int isPalindrome(String s) {
        return recursion(s, 0, s.length()-1);
    }

    public static int recursion(String s, int l, int r) {
        count++;
        if(l >= r) return 1;
        else if(s.charAt(l) != s.charAt(r)) {
            return 0;
        } else {    
            
            return recursion(s, l+1, r-1);
        }
    }
}
