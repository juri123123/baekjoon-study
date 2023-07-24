import java.io.*;
import java.util.*;

public class b2798{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input);
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        String input2 = br.readLine();
        StringTokenizer st2 = new StringTokenizer(input2);

        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(st2.nextToken());
        }
        int sum = 0;
        int tmp = 0;
        for(int i=0; i<n; i++) {
            for(int j=i+1; j<n; j++) {
                for(int k=j+1; k<n; k++) {
                    sum = arr[i] + arr[j] + arr[k];
                    //System.out.println(sum);
                    if(sum <= m && sum > tmp) {
                        tmp = sum;
                        //System.out.println(tmp);
                    }
                }
            }
        }

        bw.write(tmp+"\n");
        
        br.close();
        bw.flush();

    }
}
