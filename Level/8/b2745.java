                import java.io.*;
                import java.util.*;

                public class b2745{
                    public static void main(String[] args) throws IOException {
                        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
                        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

                        String input = br.readLine();
                        StringTokenizer st = new StringTokenizer(input);
                        String n = st.nextToken();
                        int b = Integer.parseInt(st.nextToken());
                        int result = 0;
                        int bp = 1;
                        for(int i=n.length()-1; i>=0; i--) {
                            int a = n.charAt(i); 
                            //System.out.println(a);
                            if(n.charAt(i) >= 'A' && n.charAt(i) <= 'Z') {
                                a = n.charAt(i) - 'A' + 10;
                            } else {
                                a = n.charAt(i) - '0';
                            }
                            System.out.println(a);
                            result += a * bp;
                            bp *= b;
                            
                        }
                        if(result >= 1000000000) {
                            result = 1000000000;
                        }
                        System.out.println(result);
                        br.close();
                        bw.flush();

                    }
                }