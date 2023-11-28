import java.util.*;
import java.io.*;

public class b2156 {
    static int n;
    //static int[][] dp;
    static Integer[] dp;
    static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        
        n = Integer.parseInt(br.readLine());

        arr = new int[n];
        dp = new Integer[n+1];

        for(int i=0; i<n; i++) {
            int k = Integer.parseInt(br.readLine());
            arr[i] = k;
        }

        dp[0] = 0;
        dp[1] = arr[0];
        if(n > 1) {
            dp[2] = arr[0] + arr[1];
        }
        topDown(n);
        int result = dp[n];

        bw.write(result + "\n");
        
        br.close();
        bw.flush();
    }

    //재귀
    public static Integer topDown(int x){

        if(dp[x] == null) {

             dp[x] = Math.max(Math.max(arr[x-2] + topDown(x-3), topDown(x-2)) + arr[x-1], topDown(x-1));
        }

        return dp[x];
       
    }

}
