import java.io.*;
import java.util.*;

public class s1859{

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int Test = Integer.parseInt(br.readLine());
        for(int t=1; t<=Test; t++) {
            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n];
            String input = br.readLine();
            StringTokenizer st = new StringTokenizer(input);
            for(int i=0; i<n; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }
            long sum = 0;
            int count = 0;
            int idx = -1;
            long result = 0;
            for(int i=0; i<n; i++) {
                for(int j=i+1; j<n; j++) {
                    if(arr[i] < arr[j]) {
                        sum += arr[i];
                        count++;
                        idx = j;
                        break;
                    }
                }

                if(i==idx) {
                    result += arr[idx]*count - sum;
                    sum = 0;
                    count = 0;
                }
                
            }
            bw.write("#" + t + " " + result + "\n");
        }


        br.close();
        bw.flush();

    }
}
