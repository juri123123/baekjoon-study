import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class b10773{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();

        for(int i=0; i<n; i++) {
           int a = Integer.parseInt(br.readLine());
           if(a == 0) {
            stack.pop();
           } else {
            stack.push(a);
           }
        }

        int sum = 0;
        for(int i=0; i<stack.size(); i++) {
            sum += stack.get(i);
        }
        bw.write(sum + "\n");
        br.close();
        bw.flush();

    }
}
