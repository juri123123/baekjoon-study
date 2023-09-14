import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class b9012{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();

        for(int i=0; i<n; i++) {
           String input = br.readLine();
           int flag = 0;
           for(int j=0; j<input.length(); j++) {
            if(input.charAt(j) == '(') {
                stack.push(0);
            } else if (stack.size() != 0){
                stack.pop();
            } else {
                bw.write("NO\n");
                flag = 1;
                break;
            }
           }
           
           if(stack.size() == 0 && flag == 0) {
            bw.write("YES\n");
           } else {
            bw.write("NO\n");
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
