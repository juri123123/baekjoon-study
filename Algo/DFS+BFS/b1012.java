import java.util.*;
import java.io.*;

public class b1012{
    static int m, n, k;
    static int[][] graph;
    static boolean[][] check;
    static int count = 0;
    //상하좌우
    static int[] dx = {0,0,-1,1};
    static int[] dy = {1,-1,0,0};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        //BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int x = Integer.parseInt(br.readLine());
        
        for(int i=0; i<x; i++) {
            count = 0;
            String input = br.readLine();
            StringTokenizer st = new StringTokenizer(input);
 
            m = Integer.parseInt(st.nextToken());
            n = Integer.parseInt(st.nextToken());
            k = Integer.parseInt(st.nextToken());
            
            graph = new int[m][n];
            check = new boolean[m][n];
            
            for(int j=0; j<k; j++) {
                input = br.readLine();
                st = new StringTokenizer(input);

                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                graph[a][b] = 1;

            }

            for(int q=0; q<m; q++) {
                for(int w=0; w<n; w++) {
                    if(graph[q][w] == 1 && !check[q][w]){
                        dfs(q,w);
                        count++;
                    }
                }            
            }

            System.out.println(count);
        }

        br.close();
       // bw.flush();
    }

    public static void dfs(int x, int y) {

        check[x][y] = true;

        for(int i=0; i<4; i++) {
            int nextX = x + dx[i];
            int nextY = y + dy[i];
            
            if(nextX >= 0 && nextY >= 0 && nextX < m & nextY <n) {
                if (!check[nextX][nextY] && graph[nextX][nextY] == 1) {
                    dfs(nextX,nextY);
                }
            }
        }  
    }
}
