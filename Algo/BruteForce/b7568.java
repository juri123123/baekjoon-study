import java.io.*;
import java.util.*;

public class b7568{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][2];
        for(int i=0; i<n; i++) {
            String input = br.readLine();
            StringTokenizer st = new StringTokenizer(input);

            int kg = Integer.parseInt(st.nextToken());
            int cm = Integer.parseInt(st.nextToken());

            arr[i][0] = kg;
            arr[i][1] = cm;
        }

        for(int i=0; i<n; i++) {
            int k = 1;
            for(int j=0; j<n; j++) {
                if(arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1]) {
                    k++;
                }
            }
            bw.write(k + " ");
        }
        br.close();
        bw.flush();

    }
}
