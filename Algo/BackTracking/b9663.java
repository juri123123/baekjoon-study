import java.io.*;
import java.util.*;

public class b9663{
    static int n;
    static int m;
    static int[] arr;
    static int count;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        count = 0;
        n = Integer.parseInt(br.readLine());
        arr = new int[n];
        for (int i=1; i<=n; i++) {
            arr = new int[n+1];
            arr[1] = i;//(1,i)에 queen -> 1열에는 퀸이 하나밖에 올 수 없음
            tracking(2);
        }
        bw.write(count + "\n");

        br.close();
        bw.flush();

    }

    static void tracking(int idx) {
        if(idx > n) {
            count++;
            return;
        }

        for(int i=1; i<=n; i++) {

            arr[idx] = i;
            if(check(idx)) {
                tracking(idx+1);
            }

        }
    }

    static boolean check(int idx) {
        for(int i=1; i<idx; i++) {
            //같은 행이면 false
            if (arr[i] == arr[idx]) return false;
            //대각선 (/\) 행과 열의 차의 절대값이 같으면
            else if (Math.abs(idx-i) == Math.abs(arr[idx]-arr[i])) {
                return false;
            }

        }
        return true;
    } 
}
