import java.io.*;
import java.util.*;

public class b11651{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][2];

        for(int i=0; i<n; i++) {
            String input = br.readLine();
            StringTokenizer st = new StringTokenizer(input);

            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            arr[i][0] = x;
            arr[i][1] = y;
        }

        Arrays.sort(arr, new Comparator<int[]>() {

            @Override
            public int compare(int[] o1, int[] o2) {
                
                if(o1[1] == o2[1]){
                    return o1[0] - o2[0];
                } else {
                    return o1[1] - o2[1];
                }
            }
            
        });
        //Arrays.sort(yArr);

        for(int i=0; i<n; i++) {
            bw.write(arr[i][0] + " " + arr[i][1] + "\n");
        }
        br.close();
        bw.flush();

    }
}
