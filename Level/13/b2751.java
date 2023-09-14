import java.io.*;
import java.util.*;

public class b2751{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        long[] arr = new long[n];
        for(int i=0; i<n; i++) {
            arr[i] = Long.parseLong(br.readLine());
        }

        Arrays.sort(arr);

        for(int i=0; i<n; i++) {
            bw.write(arr[i] + "\n");
        }
        br.close();
        bw.flush();

    }
}
