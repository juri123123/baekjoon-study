import java.util.*;
import java.io.*;

public class b11053 {
    static int n;
    //static int[][] dp;
    static Integer[] dp;
    static int[] arr;
    static int max;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        
        n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        arr = new int[n];
        dp = new Integer[n+1];

        for(int i=0; i<n; i++) {
            int k = Integer.parseInt(st.nextToken());
            arr[i] = k;
        }
        

        for(int i=0; i<n; i++) {
            topDown(i);
        }
        max = dp[0];

        for(int i=1; i<n; i++) {
            max = Math.max(max, dp[i]);
        }

        bw.write(max + "\n");

        br.close();
        bw.flush();
    }

    //재귀
    public static Integer topDown(int x){
        

        if(dp[x] == null) {
            dp[x] = 1; //1로 초기화 
            for(int i=x-1; i>=0; i--) {
                if(arr[i] < arr[x]) {
                    dp[x] = Math.max(dp[x], topDown(i) + 1);
                }
            }
        }

        return dp[x];
       
    }

}
