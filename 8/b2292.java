            import java.io.*;
            import java.util.*;

            public class b2292{
                public static void main(String[] args) throws IOException {
                    BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
                    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

                    int n = Integer.parseInt(br.readLine());
                    int a = 1;
                    int six = 6;
                    int count = 1;
                    if (n == 1) {
                        System.out.println(1);
                    } else {
                        while(a < n) {
                            a += six * count;
                            count++;
                        }
                        System.out.println(count);
                    }

                    
                    
                    br.close();
                    bw.flush();

                }
            }
