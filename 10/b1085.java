import java.io.*;
import java.util.*;

public class b1085{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input);
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());

        int newX = w-x;
        int newY = h-y;

        if (x < newX) {
            newX = x;
        }
        if(y < newY) {
            newY = y;
        }
        if(newX> newY) {
            bw.write(newY + "\n");
        } else {
            bw.write(newX + "\n");
        }
        

        
        
        br.close();
        bw.flush();

    }
}
