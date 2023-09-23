import java.util.*;
import java.io.*;

public class b11399 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input);
        for(int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);
        int[] time = new int[n];
        for(int i=0; i<n; i++) {
            for(int j=0; j<=i; j++) {
                time[i] += arr[j];
            }
        }

        int result = 0;
        for(int i=0; i<n; i++) {
            result += time[i];
            //System.out.print(time[i] + " ");
        }

        bw.write(result + "\n");

        br.close();
        bw.flush();
    }
}
