        import java.io.*;
        import java.util.*;

        public class b1157{
            public static void main(String[] args) throws IOException {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

                String input = br.readLine();
                String s = input.toUpperCase();

                int[] alphabet = new int[26];
                int max = 0;
                char result = '?';

                for (int i = 0; i < s.length(); i++) {
                    int n = s.charAt(i) - 'A';
                    alphabet[n]++;
                }
                for(int i = 0; i < 26; i++) {
                    if(max < alphabet[i]) {
                        max = alphabet[i];
                        result = (char) ('A' + i);
                    }
                    else if (max == alphabet[i]) {
                        result = '?';
                    }

                }

                System.out.println(result);


                br.close();
                bw.flush();

            }
        }