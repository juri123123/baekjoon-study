import java.io.*;
import java.util.*;

public class b14888{
    static int n;
    static int[] arr;
    static int[] cal;
    static int min = Integer.MAX_VALUE;
    static int max = Integer.MIN_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        n = Integer.parseInt(br.readLine());
        arr = new int[n];
        cal = new int[4];
        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input);
        for(int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        input =  br.readLine();
        st = new StringTokenizer(input);
        for(int i=0; i<4; i++) {
            cal[i] = Integer.parseInt(st.nextToken());
        }

        tracking(arr[0], 1);

        bw.write(max + "\n");
        bw.write(min + "\n");

        br.close();
        bw.flush();

    }

    static void tracking(int value, int x) {
        
        
        
        if(x >= n) {
            //System.out.println(value);
            max = Math.max(value, max);
            min = Math.min(value, min);
            return;
        }

        for(int i=0; i<4; i++) {
            if(cal[i] > 0) {
                cal[i]--;
                switch(i) {
                    case 0: 
                        tracking(value + arr[x], x+1);
                        break;
                    case 1: 
                        tracking(value - arr[x], x+1);
                        break;
                    case 2: 
                        tracking(value * arr[x], x+1);
                        break;
                    case 3: 
                        tracking(value / arr[x], x+1);
                        break;
                }

                cal[i]++;
            }
            
        }

        
    }
}
