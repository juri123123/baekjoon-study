import java.io.*;
import java.util.*;

public class b10101{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());

        if(a==b && b==c) {
            bw.write("Equilateral\n");
        } else if(a+b+c==180 && (a==b || b==c || c==a)){
            bw.write("Isosceles\n");
        } else if(a+b+c==180 && (a!=b && b!=c && c!=a)){
            bw.write("Scalene\n");
        } else {
            bw.write("Error\n");
        }


        br.close();
        bw.flush();

    }
}
