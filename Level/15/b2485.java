import java.io.*;
import java.util.*;

public class b2485{

    public static int GCD(int a, int b) {
        if(b==0) {
            return a;
        }
        return GCD(b, a%b);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        int[] dArr = new int[n-1];
        for(int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        for(int i=0; i<n-1; i++) {
            dArr[i] = arr[i+1] - arr[i];
        }
        int min = Integer.MAX_VALUE;
        for(int i=0; i<n-2; i++) {
            int a = GCD(dArr[i], dArr[i+1]);
            if(min > a) min = a;
        }
        Arrays.sort(arr);
        int p = (arr[n-1] - arr[0]) / min + 1;
        System.out.println(p);
        bw.write(p-arr.length + "\n");
        
        br.close();
        bw.flush();

    }
}
