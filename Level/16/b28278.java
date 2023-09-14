import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class b28278{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int a;
        int b;

        Stack<Integer> stack = new Stack<>();

        System.out.println();
        for(int i=0; i<n; i++) {
            String input = br.readLine();
            if(input.length() != 1) {
                StringTokenizer st = new StringTokenizer(input);
                a = Integer.parseInt(st.nextToken());
                b = Integer.parseInt(st.nextToken());
                
            } else {
                a = Integer.parseInt(input);
                b=0;
            }
            //System.out.println(a);
            switch(a){
                case 1: stack.push(b);
                break;
            
                case 2: if(stack.size() != 0) {
                    bw.write(stack.pop() + "\n");
                } else {
                    bw.write(-1 + "\n");
                }
                break;
                

                case 3: bw.write(stack.size()+ "\n");
                break;
                

                case 4: if(stack.size() != 0) {
                    bw.write(0 + "\n");
                } else {
                    bw.write(1 + "\n");
                }
                break;
                

                case 5: if(stack.size() != 0) {
                    bw.write(stack.peek() + "\n");
                } else {
                    bw.write(-1 + "\n");
                }
                break;
                

                default: break;
            }
        }
        br.close();
        bw.flush();

    }
}
