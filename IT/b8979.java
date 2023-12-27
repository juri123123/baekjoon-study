import java.util.*;
import java.io.*;
public class b8979 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[][] arr = new int[n][5];

        for(int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
            arr[i][2] = Integer.parseInt(st.nextToken());
            arr[i][3] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {

                if(o1[1] != o2[1]) {
                    return o2[1] - o1[1];
                } else if(o1[2] != o2[2]) {
                    return o2[2] - o1[2];
                } else {
                    return o2[3] - o1[3];
                }
            }
        });
        int score = 1;
        arr[0][4] = score;
        for(int i = 1; i < n; i++){ 
            if(arr[i][1] == arr[i-1][1] && arr[i][2] == arr[i-1][2] && arr[i][3] == arr[i-1][3]) {
                arr[i][4] = score;
            } else {
                arr[i][4] = i+1;
                score = i+1;
            }
        }
       
        for(int i=0; i<n; i++) {
            if(arr[i][0] == k) {
                bw.write(arr[i][4] + "\n");
            }
        }

        br.close();
        bw.flush();
    }
}
