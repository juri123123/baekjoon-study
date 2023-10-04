import java.util.*;
import java.io.*;

public class b1904 {
    static int n;
    //static int[][] dp;
    static Integer[] dp;
  
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        n = Integer.parseInt(br.readLine());
        dp = new Integer[n+1];

        if(n==1) bw.write(1 + "\n");
        else if(n==2) bw.write(2 + "\n");
        else bw.write(topDown(n) + "\n");

        br.close();
        bw.flush();
    }

    //재귀
    public static Integer topDown(int x){

        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;

        if(dp[x] == null && x >= 3) {
            dp[x] = (topDown(x-1) + topDown(x-2)) % 15746;
        }

        return dp[x];
    }

}
