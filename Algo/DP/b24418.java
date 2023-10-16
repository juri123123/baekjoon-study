import java.util.*;
import java.io.*;

public class b24418 {
    static int n;
    //static int[][] dp;
    static int[][] dp;

    static int count1;
    static int count2;

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
        matrix_path_rec(arr, n, n);

        System.out.println(count1 + " " + count2);
        
        br.close();
        bw.flush();
    }

    public static int matrix_path_rec(int[][] arr, int i, int j) {
        
        if(i == 0 || j == 0) {
            count1++;
            return 0;
        } else {
            return arr[i][j] + Math.max(matrix_path_rec(arr, i-1, j), matrix_path_rec(arr, i, j-1));
        }
    }

    //재귀
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
