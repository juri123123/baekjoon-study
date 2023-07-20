import java.io.*;
import java.util.*;

public class b9063{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int xMin = Integer.MAX_VALUE;
        int xMax = Integer.MIN_VALUE;
        int yMin = Integer.MAX_VALUE;
        int yMax = Integer.MIN_VALUE;

        for(int i=0; i<n; i++){
            String input = br.readLine();
            StringTokenizer st = new StringTokenizer(input);

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            if(xMin > a) xMin = a;
            if(yMin > b) yMin = b;
            if(xMax < a) xMax = a;
            if(yMax < b) yMax = b;

        }

        int result = (xMax - xMin) * (yMax - yMin);

        bw.write(result+"\n");


        br.close();
        bw.flush();

    }
}
