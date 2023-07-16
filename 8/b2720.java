            import java.io.*;
            import java.util.*;

            public class b2720{
                public static void main(String[] args) throws IOException {
                    BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
                    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

                    int n = Integer.parseInt(br.readLine());
                    int[] money = new int[4];
                    //25 10 5 1

                    for(int i=0; i<n; i++) {
                        int a = Integer.parseInt(br.readLine());
                        
                        money[0] = a/25;
                        bw.write(money[0]+ " ");
                        a %= 25;
                        money[1] = a/10;
                        bw.write(money[1]+ " ");
                        a %= 10;
                        money[2] = a/5;
                        bw.write(money[2]+ " ");
                        a %= 5;
                        money[3] = a;
                        bw.write(money[3]+ " ");

                        bw.write("\n");
                    
                    }

                    
                    br.close();
                    bw.flush();

                }
            }