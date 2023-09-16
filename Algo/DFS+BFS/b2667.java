import java.util.*;
import java.io.*;

public class b2667{
    static int n;
    static int[][] graph;
    static boolean[][] check;
    static int count;
    //상하좌우
    static int[] dx = {0,0,-1,1};
    static int[] dy = {1,-1,0,0};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        n = Integer.parseInt(br.readLine());
        graph = new int[n][n];
        check = new boolean[n][n];
        
        for(int i=0; i<n; i++) {
            String input = br.readLine();
            for(int j=0; j<n; j++) {
                if(input.charAt(j) == '1')
                graph[i][j] = 1;
            }
        }
        ArrayList<Integer> apartList = new ArrayList<>();
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                if(graph[i][j] == 1 && !check[i][j]){
                    count = 0;
                    dfs(i,j);
                    apartList.add(count);
                }
            }            
        }

        Collections.sort(apartList);

        bw.write(apartList.size() + "\n");
        
        for(int i=0; i<apartList.size(); i++) {
            bw.write(apartList.get(i) + "\n");
        }

        br.close();
        bw.flush();
    }

    public static void dfs(int x, int y) {

        check[x][y] = true;
        count++;

        for(int i=0; i<4; i++) {
            int nextX = x + dx[i];
            int nextY = y + dy[i];
            
            if(nextX >= 0 && nextY >= 0 && nextX < n & nextY <n) {
                if (!check[nextX][nextY] && graph[nextX][nextY] == 1) {
                    dfs(nextX,nextY);
                }
            }
        }  
    }
}
