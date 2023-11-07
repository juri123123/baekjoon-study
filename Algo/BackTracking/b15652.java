import java.io.*;
import java.util.*;

public class b15652{
    static int n;
    static int m;
    static int[] arr;
    static boolean[] flag;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input);

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new int[n];
        flag = new boolean[n];

        tracking(0, 0);

        br.close();
        bw.flush();

    }

    static void tracking(int idx, int start) {
        if(idx == m) {
            for(int i=0; i<m; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            return;
        }

        for(int i=start; i<n; i++) {
            if(true) {
                //flag[i] = true;
                arr[idx] = i+1;
                tracking(idx + 1, i);

               // flag[i] = false;
            }
        }
    }


}
