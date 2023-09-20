import java.util.*;
import java.io.*;

public class b4963 {
    static int w, h;
    static int[][] graph;
    static boolean[][] check;
    static int count = 0;
    // 상하좌우,상좌상우하좌하우
    static int[] dx = { 0, 0, -1, 1, -1, 1, -1, 1 };
    static int[] dy = { 1, -1, 0, 0, -1, -1, 1, 1 };

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            String input = br.readLine();
            //System.out.println(input);
            if (input.equals("0 0")){
                //System.out.println("break!");
                break;
            }
            
                

            StringTokenizer st = new StringTokenizer(input);
            w = Integer.parseInt(st.nextToken());
            h = Integer.parseInt(st.nextToken());

            graph = new int[w][h];
            check = new boolean[w][h];

            for (int i = 0; i < h; i++) {
                input = br.readLine();
                if (w == 1) {
                    graph[0][i] = Integer.parseInt(input);
                } else {
                    st = new StringTokenizer(input);
                    for (int j = 0; j < w; j++) {
                        graph[j][i] = Integer.parseInt(st.nextToken());
                    }

                }

            }
            count = 0;
            for(int i=0; i<w; i++) {
                for(int j=0; j<h; j++) {
                    if(!check[i][j] && graph[i][j] == 1) {
                        dfs(i,j);
                        count++;
                    }
                }

            }
            bw.write(count + "\n");
        }

        br.close();
        bw.flush();
    }

    public static void dfs(int x, int y) {
       
        check[x][y] = true;

        for (int i = 0; i < 8; i++) {
            int nextX = x + dx[i];
            int nextY = y + dy[i];

            if (nextX >= 0 && nextY >= 0 && nextX < w & nextY < h) {
                if (!check[nextX][nextY] && graph[nextX][nextY] == 1) {
                    dfs(nextX, nextY);
                }
            }
        }
    }
}
