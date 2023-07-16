            import java.io.*;
            import java.util.*;

            public class b2869{
                public static void main(String[] args) throws IOException {
                    BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
                    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

                    String input = br.readLine();
                    StringTokenizer st = new StringTokenizer(input);
                    int a = Integer.parseInt(st.nextToken()); //낮+
                    int b = Integer.parseInt(st.nextToken()); //밤-
                    int v = Integer.parseInt(st.nextToken()); //총

                    int result = (v-b)/(a-b);
                    if((v-b)%(a-b) != 0) {
                        result++;
                    }
                    System.out.println(result);

                    br.close();
                    bw.flush();

                }
            }
