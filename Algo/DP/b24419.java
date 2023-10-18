import java.util.*;
import java.io.*;

public class b24419 {
    static int n;
    //static int[][] dp;
    static int[][] dp;

    static long count1;
    static long count2;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        n = Integer.parseInt(br.readLine());

        int[][] arr = new int[n+1][n+1];
        dp = new int[n+1][n+1];

        for(int i=0; i<n; i++) {
            String input = br.readLine();
            StringTokenizer st = new StringTokenizer(input);
            for (int j=0; j<n; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        count1 = 0;
        count2 = 0;

        matrix_path(arr, n);
        matrix_path_rec(arr, n);

        System.out.println((count1 % 1000000007) + " " + (count2 % 1000000007));
        
        br.close();
        bw.flush();
    }

    public static int matrix_path_rec(int[][] arr, int n) {
        
        if(n==1) return 2;
        if(n==0) return 0;

        int result = 0;

        for (int i=1; i<=n; i++) {
            for(int j=1; j<=n; j++) {
                result = arr[i][j] + Math.max(arr[i-1][j], arr[i][j-1]);
                count1++;
            }
        }
        return result;
    }

    
    public static int matrix_path(int[][] arr, int n){
        
        for (int i=0; i<n; i++) {
            dp[i][0] = 0;
        }
        for(int j=0; j<n; j++) {
            dp[0][j] = 0;
        }
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n; j++) {
                dp[i][j] = arr[i][j] + Math.max(dp[i-1][j], dp[i][j-1]);
                count2++;
            }
        }
        return dp[n][n];   
    }

}
