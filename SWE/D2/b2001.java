import java.io.*;
import java.util.*;

public class b2001{
    static int n;
    static int m;
    static int[][] arr;
    static int max = Integer.MIN_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int k = Integer.parseInt(br.readLine());
        
        for(int i=1; i<=k; i++) {
            String input = br.readLine();
            StringTokenizer st = new StringTokenizer(input);

            n = Integer.parseInt(st.nextToken());
            m = Integer.parseInt(st.nextToken());
            arr = new int[n][n];

            for(int a=0; a<n; a++) {
                input = br.readLine();
                st = new StringTokenizer(input);
                for(int b=0; b<n; b++) {
                    arr[a][b] = Integer.parseInt(st.nextToken());
                }
            }

            for(int a=0; a<=n-m; a++) {
                for(int b=0; b<=n-m; b++) {
                    search(a,b);
                }
            }

            bw.write("#" + i + " " + max + "\n");
            max = Integer.MIN_VALUE;

        }

        br.close();
        bw.flush();

    }

    static void search(int x, int y) {
        int sum = 0;
        for(int i=x; i<x+m; i++) {
            for(int j=y; j<y+m; j++) {
                sum += arr[i][j];
            }
        }

        max = Math.max(sum, max);
        
    }
}
