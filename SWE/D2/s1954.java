import java.io.*;
import java.util.*;

public class s1954{
    static int n;
    static Integer[][] dp;
    static int[] dr = {0,1,0,-1};
    static int[] dc = {1,0,-1,0};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());

        
        for(int i=1; i<=t; i++) {
            n = Integer.parseInt(br.readLine());
            dp = new Integer[n+1][n+1];
            int idx = 1;
            int r=0, c=0; //시작좌표
            for(int a=1; a<= n*n; a++) {
                dp[r][c] = i;
                if(r+dr[idx] >= n || r+dr[idx] < 0 || c+dc[idx] >= n || c+dc[idx] < 0) {
                    if(dp[r+dr[idx]][c+dc[idx]] != null) {
                        idx = (idx+1 ) % 4;
                    }
                    r += dr[idx];
                    c += dc[idx];
                }
            }

            bw.write("#" + i + "\n");
            for(int a=0; a<n; a++) {
                for(int b=0; b<n; b++) {
                    bw.write(dp[a][b] + " ");
                }
                bw.write("\n");
            }

            
        }

        br.close();
        bw.flush();

    }
}
