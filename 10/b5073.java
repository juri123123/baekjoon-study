import java.io.*;
import java.util.*;

public class b5073{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while(true) {
            String input = br.readLine();
            StringTokenizer st = new StringTokenizer(input);

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            if(a==0 && b==0 && c==0) {
                break;
            }

            if(a==b && b==c) {
                    bw.write("Equilateral\n");
            } else {
                int max = Integer.MIN_VALUE;
                int sum = 0;

                if(max < a) {
                    max = a;
                    sum = b+c;
                }
                if(max < b) {
                    max = b;
                    sum = a+c;
                }
                if(max < c) {
                    max = c;
                    sum = b+a;
                }
                
                if(max >= sum) {
                    //System.out.println(max + " " + sum);
                    bw.write("Invalid\n");
                } else if(a==b || b==c || c==a) {
                    bw.write("Isosceles\n");
                } else {
                    bw.write("Scalene\n");
                }
            }

            
            

        }

        br.close();
        bw.flush();

    }
}
