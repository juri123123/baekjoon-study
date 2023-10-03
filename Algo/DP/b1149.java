import java.util.*;
import java.io.*;

public class b1149 {
    static int n;
    //static int[][] dp;
    static Integer[][] dp;
    static int[][] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        
        n = Integer.parseInt(br.readLine());
        StringTokenizer st;

        arr = new int[n][3];
        dp = new Integer[n][3];

        for(int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<3; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        //맨 윗줄 dp는 arr와 같다
        for(int i=0; i<3; i++) {
            dp[0][i] = arr[0][i];
        }

        int min = Math.min(Math.min(topDown(n-1, 0), topDown(n-1, 1)), topDown(n-1, 2));
        bw.write(min + "\n");
        
        br.close();
        bw.flush();
    }

    //재귀
    public static Integer topDown(int x, int y){
        if(x == 0) return dp[x][y];

        if(dp[x][y] == null) {
            
            int red = arr[x][0];
            int green = arr[x][1];
            int blue = arr[x][2];
            
            dp[x][0] = Math.min(topDown(x-1, 1), topDown(x-1, 2)) + red;
            dp[x][1] = Math.min(topDown(x-1, 0), topDown(x-1, 2)) + green;
            dp[x][2] = Math.min(topDown(x-1, 0), topDown(x-1, 1)) + blue;
            
            //System.out.println(dp[x][y]);

             
        }

        return dp[x][y];
       
    }

}
