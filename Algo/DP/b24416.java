import java.util.*;
import java.io.*;

public class b24416 {
    static int n;
    //static int[][] dp;
    static Integer[] dp;
    static int[] arr;

    static int count1;
    static int count2;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        n = Integer.parseInt(br.readLine());

        arr = new int[n];
        dp = new Integer[n+1];

        count1 = 0;
        count2 = 0;

        fib(n);
        topDown(n);

        System.out.println(count1 + " " + count2);
        
        br.close();
        bw.flush();
    }

    public static int fib(int n) {
        
        if(n == 1 || n == 2) {
            count1++;
            return 1;
        } else {
            return fib(n-1) + fib(n-2);
        }
    }

    //재귀
    public static Integer topDown(int x){
        
        dp[1] = dp[2] = 1;
        for(int i=3; i<=x; i++) {
            count2++;
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[x];
    }

}
