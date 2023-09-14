        import java.io.*;
        import java.util.*;

        public class b10988{
            public static void main(String[] args) throws IOException {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

                String input = br.readLine();
                int n = input.length();
                int flag = 1;
                if (n%2 == 0) {
                    for(int i = 0; i < n/2; i++){
                        if(input.charAt(i) == input.charAt(n-i-1)) {
                            flag =1;
                        } else {
                            flag = 0;
                            System.out.println(0);
                            break;
                        }
                    }
                    if(flag == 1) {
                        System.out.println(1);
                    }
                } else {
                    for(int i = 0; i < n/2-1; i++){
                        if(input.charAt(i) == input.charAt(n-i-1)) {
                            flag = 1;
                        } else {
                            flag = 0;
                            System.out.println(0);
                            break;
                        }
                    }
                    if(flag == 1) {
                        System.out.println(1);
                    } 
                }

                br.close();
                bw.flush();

            }
        }