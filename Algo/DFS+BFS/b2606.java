package Algo.DFS;

import java.util.*;
import java.io.*;

public class b2606{
    static int[][] graph;
    static boolean[] visited;
    static int count = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int node = Integer.parseInt(br.readLine());
        int line = Integer.parseInt(br.readLine());

        graph = new int[node+1][node+1]; //그래프를 인접행렬로 표시
        visited = new boolean[node+1];

        for(int i=0; i<line; i++) {
            String input = br.readLine();
            StringTokenizer st = new StringTokenizer(input);

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            graph[a][b] = graph[b][a] = 1;
        }

        dfs(1);

        bw.write(count-1 + "\n");
        br.close();
        bw.flush();

    }

    public static void dfs(int x) {
        if(visited[x] == true) return;

        visited[x] = true;
        count++;

        for(int i=0; i<graph[x].length; i++) {
            if(!visited[i] && graph[x][i] == 1) {
                dfs(i);
            }
        }
    }
}
