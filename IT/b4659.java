import java.util.*;
import java.io.*;
public class b4659 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        
        boolean check = false;

        while (true) {
            check = false;
            String input = br.readLine();
            if(input.equals("end")) break; 

            for(int i=0; i<input.length(); i++) { //a,e,i,o,u 중 하나를 반드시 포함
                if(input.charAt(i) == 'a' || input.charAt(i) == 'e' || input.charAt(i) == 'i' || input.charAt(i) == 'o' || input.charAt(i) == 'u') {
                    check = true;
                    break;
                }
            }
            //System.out.println("1 " + check);

            int counta = 0;
            int countb = 0;
            for(int i=0; i<input.length(); i++) {
                if(input.charAt(i) == 'a' || input.charAt(i) == 'e' || input.charAt(i) == 'i' || input.charAt(i) == 'o' || input.charAt(i) == 'u') {
                    counta++;
                    countb = 0;
                } else {
                    countb++;
                    counta = 0;
                }
                if(counta == 3 || countb == 3) {
                    check = false;
                    break;
                }
            }
            //System.out.println("2 " + check);

            char pre = '?';
            int count = 0;
            for(int i=0; i<input.length(); i++) {
                if(pre == input.charAt(i)) {
                    if(pre == 'e' || pre == 'o') {
                        count++;
                        if(count == 2) {
                            check = false;
                            break;
                        }
                    } else {
                        check = false;
                        break;
                    }
                    
                } else {
                    count = 0;
                    pre = input.charAt(i);
                }
            }
            //System.out.println("3 " + check);

            if(check) {
                System.out.println("<" + input + "> is acceptable");
            } else {
                System.out.println("<" + input + "> is not acceptable");
            }
            

        }

        //br.close();
        //bw.flush();
    }
}
