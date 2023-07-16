            import java.io.*;
            import java.util.*;

            public class b11005{
                public static void main(String[] args) throws IOException {
                    BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
                    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

                    String input = br.readLine();
                    StringTokenizer st = new StringTokenizer(input);
                    int n = Integer.parseInt(st.nextToken());
                    int b = Integer.parseInt(st.nextToken());

                    ArrayList<Character> list = new ArrayList<>();

                    while(n > 0) {
                        int p = n % b;
                        if(p >= 10) {
                            list.add((char) (p + 55));
                        } 
                        else {
                            list.add((char)(p+'0'));
                        }
                        n /= b;
                    }
                    
                    for(int i=list.size()-1; i>=0; i--) {
                        System.out.print(list.get(i));
                    }
                    br.close();
                    bw.flush();

                }
            }