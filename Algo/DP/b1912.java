import java.util.*;
import java.io.*;

public class b1912 {
    static int[] dp;
    static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        dp = new int[n];
        arr = new int[n];

        for(int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        bw.write(bottomUp(n) + "\n");

        

        
        br.close();
        bw.flush();
    }
    
    public static int bottomUp(int n){
        dp[0] = arr[0];
        int max = arr[0];
        for(int i=1; i<n; i++) {
            //이전부터 계속 연속된 값 vs 현재 값
            if(dp[i-1] + arr[i] > arr[i]) {
                dp[i] = dp[i-1] + arr[i];
            } else {
                dp[i] = arr[i];
            }
            if(max < dp[i]) max = dp[i];
        }

        return max;
    }

}
