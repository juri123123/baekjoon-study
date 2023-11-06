import java.io.*;
import java.util.*;

public class b15651{
    static int n;
    static int m;
    static int[] arr;
    static boolean[] flag;

    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        

        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input);

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new int[n];
        flag = new boolean[n];

        tracking(0);

        br.close();
        bw.flush();

    }

    static void tracking(int idx) throws IOException{
        if(idx == m) {
            for(int i=0; i<m; i++) {
                bw.write(arr[i] + " ");
            }
            bw.write("\n");
            return;
        }

        for(int i=0; i<n; i++) {
            if(true) {
                //flag[i] = true;
                arr[idx] = i+1;
                tracking(idx + 1);

                //flag[i] = false;
            }
        }

    }


}
