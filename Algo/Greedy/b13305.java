import java.util.*;
import java.io.*;

public class b13305 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        long[] length = new long[n-1];
        long[] cost = new long[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<n-1; i++) {
            length[i] = Long.parseLong(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n-1; i++) {
            cost[i] = Long.parseLong(st.nextToken());
        }

        long sum = 0;
        long minCost = cost[0];
        for(int i=0; i<n-1; i++) {
            if(minCost > cost[i]) {
                minCost = cost[i];
            }
            sum += minCost * length[i];
        }

        bw.write(sum + "\n");

        br.close();
        bw.flush();
    }
}
