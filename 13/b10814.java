import java.io.*;
import java.util.*;

public class b10814{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        String[][] arr = new String[n][2];

        for(int i=0; i<n; i++) {
            String input = br.readLine();
            StringTokenizer st = new StringTokenizer(input);

            String age = st.nextToken();
            String name = st.nextToken();

            arr[i][0] = age;
            arr[i][1] = name;

        }

        Arrays.sort(arr, new Comparator<String[]>() {

            @Override
            public int compare(String[] o1, String[] o2) {
                return Integer.parseInt(o1[0]) - Integer.parseInt(o2[0]);
            }
            
        });

        for(int i=0; i<n; i++) {
            bw.write(arr[i][0] + " " + arr[i][1] + "\n");
        }

        br.close();
        bw.flush();

    }
}
