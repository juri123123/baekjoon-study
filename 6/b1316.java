        import java.io.*;
        import java.util.*;

        public class b1316{
            public static void main(String[] args) throws IOException {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

                int n = Integer.parseInt(br.readLine());
                int count = 0;
                for(int i = 0; i < n; i++) {
                    String word = br.readLine();
                    int flag = 1;
                    ArrayList<Character> a = new ArrayList<Character>();
                    for (int j = 0; j < word.length(); j++) {
                        if(!a.contains(word.charAt(j))) {
                            a.add(word.charAt(j));
                        } else if (a.get(a.size()-1) == word.charAt(j)) {
                            continue;
                        } else {
                            flag = 0;
                            break;
                        }
                    }   
                     if(flag == 1) {
                            count++;
                        }       
                    
                }
                System.out.println(count);
                br.close();
                bw.flush();

            }
        }
        