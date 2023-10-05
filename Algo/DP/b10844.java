import java.util.*;
import java.io.*;

public class b10844 {
    static int n;
    //static int[][] dp;
    static Long[][] dp;
  
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long result = 0;
        n = Integer.parseInt(br.readLine());
        //n의 자리 수에 들어갈 수 0~9
        dp = new Long[n+1][10];

        //n = 1 일 경우
        for(int i=0; i<10; i++) {
            dp[1][i] = 1L;
        }
        //n >= 2
        for(int i=0; i<9; i++) {

            result += topDown(n, i+1);
        }

        bw.write((result%1000000000) + "\n");

        br.close();
        bw.flush();
    }

    //재귀
    //x -> 자릿수 , y -> 1~9
    public static Long topDown(int x, int y){
       
        if(x == 1) return dp[x][y];

        if(dp[x][y] == null) {
            if(y == 0) {
                dp[x][y] = topDown(x-1, 1);
            } else if(y == 9) {
                dp[x][y] = topDown(x-1, 8);
            } else {
                dp[x][y] = topDown(x-1, y-1) + topDown(x-1, y+1);
            }
        }

        return dp[x][y] % 1000000000;
        
    }

}
