import java.io.*;
import java.util.*;

public class b2587{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] arr = new int[5];
        int sum = 0;
        for(int i=0; i<5; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            sum += arr[i];
        }

        Arrays.sort(arr);
        bw.write(sum/5 + "\n");
        bw.write(arr[2]+"\n");
        br.close();
        bw.flush();

    }
}
