        import java.io.*;
        import java.util.*;

        public class b2941{
            public static void main(String[] args) throws IOException {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

                String[] alpha = {"c=","dz=", "lj", "nj","c-","d-","s=","z="};

                String input = br.readLine();
                
                for(int i=0; i< alpha.length; i++) {
                    if(input.contains(alpha[i])){
                        input = input.replace(alpha[i], "!");
                    }
                }
                System.out.println(input);
                System.out.println(input.length());
                
                

                br.close();
                bw.flush();

            }
        }