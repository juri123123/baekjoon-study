import java.util.*;
import java.io.*;

public class b11724{
    static int n, m;
    static int[][] graph;
    static boolean[] check;
    static int count = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input);

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        graph = new int[n+1][n+1];
        check = new boolean[n+1];

        for(int i=0; i<m; i++) {
            input = br.readLine();
            st = new StringTokenizer(input);
            
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());

            graph[u][v] = graph[v][u] = 1;
        }

        for(int i=1; i<=n; i++) {
           if (!check[i]) {
                dfs(i);
                count++;
           }
        }
        bw.write(count + "\n");


        br.close();
        bw.flush();
    }

    public static void dfs(int x) {
        if(check[x]) return;
        check[x] = true;

        for(int i=1; i<=n; i++) {
            if(graph[x][i] == 1) {
                dfs(i);
            }
        }
    }
}
