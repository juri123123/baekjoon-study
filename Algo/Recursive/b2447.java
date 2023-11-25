import java.io.*;
import java.util.*;

public class b2447{
    static int n;
    static char[][] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        n = Integer.parseInt(br.readLine());
        arr = new char[n][n];
        recursion(0,0,n,false);

        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                bw.write(arr[i][j]);
            }
            bw.write("\n");
        }
        br.close();
        bw.flush();

    }

    public static void recursion(int x, int y, int size, boolean isBlank) {
        if(isBlank) {
            for(int i=x; i<x+size; i++) {
                for(int j=y; j<y+size; j++) {
                    arr[i][j] = ' ';
                }
            }
            return;
        }

        if(size == 1) {
            arr[x][y] = '*';
            return;
        }

        int newSize = size/3;
        int count = 0;
        for(int i=x; i<x+size; i+=newSize) {
            for(int j=y; j<y+size; j+=newSize) {
                count++;
                if(count == 5) {
                    recursion(i, j, newSize, true);
                } else {
                    recursion(i, j, newSize, false);
                }
            }
        }
    }
}
