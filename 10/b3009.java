import java.io.*;
import java.util.*;

public class b3009{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input1 = br.readLine();
        StringTokenizer st1 = new StringTokenizer(input1);
        String input2 = br.readLine();
        StringTokenizer st2 = new StringTokenizer(input2);
        String input3 = br.readLine();
        StringTokenizer st3 = new StringTokenizer(input3);
        int x = Integer.parseInt(st1.nextToken());
        int y = Integer.parseInt(st1.nextToken());

        int a = Integer.parseInt(st2.nextToken());
        int b = Integer.parseInt(st2.nextToken());

        int n = Integer.parseInt(st3.nextToken());
        int m = Integer.parseInt(st3.nextToken());

        int resultX;
        int resultY;

        if(x==a) {
            resultX = n;
        } else if (x==n){
            resultX = a;
        } else {
            resultX = x;
        }

        if(y==b){
            resultY = m;
        } else if(y==m) {
            resultY = b;
        } else {
            resultY = y;
        }


        bw.write(resultX + " " + resultY);


        br.close();
        bw.flush();

    }
}
