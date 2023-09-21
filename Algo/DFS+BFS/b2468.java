import java.util.*;
import java.io.*;

public class b2468 {
    static int n;
    static int[][] graph;
    static int[][] newGraph;
    static boolean[][] check;
    static int count = 0;
    static ArrayList<Integer> countList;
    // 상하좌우
    static int[] dx = { 0, 0, -1, 1};
    static int[] dy = { 1, -1, 0, 0};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        n = Integer.parseInt(br.readLine());
        int maxHeight = -1;

        graph = new int[n][n];
        newGraph = new int[n][n];
        //check = new boolean[n][n];
        countList = new ArrayList<>();

        //graph 저장 
        for(int i=0; i<n; i++) {
            String input = br.readLine();
            StringTokenizer st = new StringTokenizer(input);
            for( int j=0; j<n; j++) {
                
                int h = Integer.parseInt(st.nextToken());
                graph[i][j] = h;

                if(h > maxHeight) maxHeight = h;

            }
        }
        //System.out.println(maxHeight);

        //높이가 달라질수록
        for(int i=0; i<maxHeight; i++) {
            //높이에 따른 newGraph 저장
            for(int j=0; j<n; j++) {
                for(int k=0; k<n; k++) {
                    if(graph[j][k] > i) {
                        newGraph[j][k] = 1;
                    } else {
                        newGraph[j][k] = 0;
                    }
                }
            }
            // for(int j=0; j<n; j++) {
            //     for(int k=0; k<n; k++) {
            //         System.out.print(newGraph[j][k] + " ");
            //     }
            //     System.out.println();
            // }
            // System.out.println();

            //count, check 초기화
            count = 0;
            check = new boolean[n][n];
            

            for(int j=0; j<n; j++) {
                for(int k=0; k<n; k++) {
                    if(newGraph[j][k] == 1 && !check[j][k]) {
                        count++;
                        dfs(j, k);
                        
                    }
                }
            }

            countList.add(count);

        }
        Collections.sort(countList);
    
       bw.write(countList.get(countList.size()-1) + "\n");

        br.close();
        bw.flush();
    }

    public static void dfs(int x, int y) {
       
        check[x][y] = true;

        for (int i = 0; i < 4; i++) {
            int nextX = x + dx[i];
            int nextY = y + dy[i];

            if (nextX >= 0 && nextY >= 0 && nextX < n & nextY < n) {
                if (!check[nextX][nextY] && newGraph[nextX][nextY] == 1) {
                    dfs(nextX, nextY);
                }
            }
        }
    }
}
