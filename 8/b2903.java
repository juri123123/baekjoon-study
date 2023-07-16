            import java.io.*;
            import java.util.*;

            public class b2903{
                public static void main(String[] args) throws IOException {
                    BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
                    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

                    int n = Integer.parseInt(br.readLine());
                    int mul = 2;
                    int two = 1;

                    for(int i=0; i<n; i++) {
                        mul += two;
                        two *= 2;
                    }
                    
                    System.out.println(mul*mul);
                    
                    br.close();
                    bw.flush();

                }
            }
