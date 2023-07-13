        import java.io.*;
        import java.util.*;

        public class b2444{
            public static void main(String[] args) throws IOException {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

                int n = Integer.parseInt(br.readLine());
                for(int i = 1; i < n; i++) {
                    for(int j = n-1; j >= i; j--) {
                        bw.write(".");
                    }
                    for (int j = 0; j < 2*i-1; j++) {
                        bw.write("*");
                    }
                 
                    bw.write("\n");
                }
                for(int i=0; i< 2*n-1; i++) {
                    bw.write("*");
                }
                bw.write("\n");
                for(int i = n-1; i > 0; i--) {
                    for(int j = 0; j < n-i; j++) {
                        bw.write(".");
                    }
                    for (int j = 0; j < 2*i-1; j++) {
                        bw.write("*");
                    }
               
                    bw.write("\n");
                }
                br.close();
                bw.flush();

            }
        }