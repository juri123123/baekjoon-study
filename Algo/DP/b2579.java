import java.util.*;
import java.io.*;

public class b2579 {
    static int n;
    //static int[][] dp;
    static Integer[] dp;
    static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        
        n = Integer.parseInt(br.readLine());

        arr = new int[n];
        dp = new Integer[n];

        for(int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }


        if(n >= 3) {
            dp[0] = arr[0];
            dp[1] = arr[0] + arr[1];
            dp[2] = Math.max(arr[1], arr[0]) + arr[2];

            bw.write(topDown(n-1) + "\n");
        } else if (n == 2) {
            dp[0] = arr[0];
            dp[1] = arr[0] + arr[1];
            bw.write(dp[n-1] + "\n");
        } else {
            dp[0] = arr[0];
            bw.write(dp[n-1] + "\n");
        }
        
        br.close();
        bw.flush();
    }

    //재귀
    public static Integer topDown(int x){

        if(dp[x] == null) {       
            dp[x] = Math.max(topDown(x-2), topDown(x-3) + arr[x-1]) + arr[x];
        }

        return dp[x];
       
    }

}
