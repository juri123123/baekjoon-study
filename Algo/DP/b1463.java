import java.util.*;
import java.io.*;

public class b1463 {
    static int n;
    //static int[][] dp;
    static Integer[] dp;
  
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        n = Integer.parseInt(br.readLine());
        dp = new Integer[n+1];


        bw.write(topDown(n) + "\n");
        br.close();
        bw.flush();
    }

    //재귀
    public static Integer topDown(int x){

        dp[0] = 0;
        dp[1] = 0;

        if(dp[x] == null) {
            if(x%6 == 0) {
                dp[x] = Math.min(Math.min(topDown(x/3), topDown(x/2)), topDown(x-1)) + 1;
            } else if(x%3 == 0) {
                dp[x] = Math.min(topDown(x/3), topDown(x-1)) + 1;
            } else if (x%2 == 0) {
                dp[x] = Math.min(topDown(x/2), topDown(x-1)) + 1;
            } else {
                dp[x] = topDown(x-1) + 1;
            }
        }

        return dp[x];
    }

}
