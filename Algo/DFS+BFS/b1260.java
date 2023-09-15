import java.io.*;
import java.util.*;

public class b1260{

    static int[][] graph;
    static boolean[] check;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input);

        int node = Integer.parseInt(st.nextToken());
        int line = Integer.parseInt(st.nextToken());
        int start = Integer.parseInt(st.nextToken());

        graph = new int[node+1][node+1];
        check = new boolean[node+1];

        for(int i=0; i<line; i++) {
            input = br.readLine();
            st = new StringTokenizer(input);

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            graph[a][b] = graph[b][a] = 1;
        }

        dfs(start);
        System.out.println();
        for(int i=0; i<node+1; i++) {
            check[i] = false;
        }
        bfs(node, start);

        br.close();
        bw.flush();

    }
    public static void dfs(int x) {

        check[x] = true;
        System.out.print(x+ " ");

        for(int i=0; i<graph[x].length; i++) {
            if(!check[i] && graph[x][i] == 1) {
                dfs(i);
            }
        }
    }

    public static void bfs(int node, int x) {
        Queue<Integer> q = new LinkedList<>();
        check[x] = true;
        q.add(x);

        while(!q.isEmpty()) {
            int now = q.poll();
            System.out.print(now + " ");
            for(int i=0; i<=node; i++) {
                if(graph[now][i] == 1 && !check[i]) {
                    check[i] = true;
                    q.add(i);
                }
            }
        }
    }
}
