import java.util.*;
import java.io.*;
//증가하는 부분 수열의 길이 값 최대, 감소하는 부분 수열의 길이 값 최대!
public class b11054 {
    static int n;
    //static int[][] dp;
    static int[] dpL;
    static int[] dpR;
    static int[] arr;
    static int max;
    static int maxArr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        
        n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        arr = new int[n];
        dpL = new int[n+1];
        dpR = new int[n+1];
        maxArr = 0;

        for(int i=0; i<n; i++) {
            int k = Integer.parseInt(st.nextToken());
            arr[i] = k;
   
        }
        int result = 0;
        for(int i=0; i<n; i++) {
            dpL[i] = 1;
            for(int j=0; j<i; j++) {
                if(arr[i] > arr[j] && dpL[j]>= dpL[i]) {
                    dpL[i] = dpL[j] + 1;
                }
            }
        }

        for(int i=n-1; i>=0; i--) {
            dpR[i] = 1;
            for(int j=n-1; j>i; j--) {
                if(arr[i] > arr[j] && dpR[j] >= dpR[i]) {
                    dpR[i] = dpR[j] + 1;
                }
            }
        }

        for(int i=0; i<n; i++) {
            result = Math.max(result, dpL[i] + dpR[i]-1);
        }

        bw.write(result + "\n");

        br.close();
        bw.flush();
    }


}
