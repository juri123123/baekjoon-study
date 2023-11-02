import java.io.*;
import java.util.*;

public class b14501{
    static int n;
    static int[][] arr;
    static int result;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        n = Integer.parseInt(br.readLine());
        arr = new int[n][2];

        for(int i=0; i<n; i++) {
            String input = br.readLine();
            StringTokenizer st = new StringTokenizer(input);
            
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }
        result = 0;
        dfs(0,0);

        bw.write(result + "\n");

        br.close();
        bw.flush();

    }

    static void dfs (int idx, int pay) {

        if (idx >= n) {
            result = Math.max(pay, result);
            //System.out.println(result);
            return;
        }

        if(arr[idx][0] + idx <= n) {
            dfs(arr[idx][0] + idx, pay + arr[idx][1]);
        } 

        dfs(idx+1, pay);

    }

}
