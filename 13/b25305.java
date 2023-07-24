import java.io.*;
import java.util.*;

public class b25305{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input);

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];
        String input2 = br.readLine();
        StringTokenizer st2 = new StringTokenizer(input2);
        for(int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(st2.nextToken());
        }

        Arrays.sort(arr);


        bw.write(arr[n-k]+"\n");
        br.close();
        bw.flush();

    }
}
