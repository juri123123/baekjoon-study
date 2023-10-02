import java.util.*;
import java.io.*;

public class b1932 {
    static int n;
    //static int[][] dp;
    static Integer[][] dp;
    static int[][] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        
        n = Integer.parseInt(br.readLine());
        StringTokenizer st;

        arr = new int[n][n];
        dp = new Integer[n][n];

        for(int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<i+1; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        //맨 아랫줄 dp는 arr와 같다
        for(int i=0; i<n; i++) {
            dp[n-1][i] = arr[n-1][i];
        }

        

        System.out.println(topDown(0, 0));
 
        br.close();
        bw.flush();
    }
    //재귀
    public static Integer topDown(int x, int y){
        if(x == n-1) return dp[x][y];

        if(dp[x][y] == null) {
            dp[x][y] = Math.max(topDown(x+1, y), topDown(x+1, y+1)) + arr[x][y];
            //System.out.println(dp[x][y]);
        }

        
        return dp[x][y];
    }

}
