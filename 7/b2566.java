        import java.io.*;
        import java.util.*;

        public class b2566{
            public static void main(String[] args) throws IOException {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

                int[][] arr = new int[9][9];

                for(int i=0; i<9; i++) {
                    String input = br.readLine();
                    StringTokenizer st = new StringTokenizer(input);
                    for(int j=0; j<9; j++) {
                        arr[i][j] = Integer.parseInt(st.nextToken());
                    }
                }
                int max = 0;
                String index = "";
                for(int i=0; i<9; i++) {
                    for(int j=0; j<9; j++) {
                        if(max <= arr[i][j]) {
                            max = arr[i][j];
                            index = (i+1)+ " " + (j+1);
                        }
                    }
                }
                bw.write(max + "\n");
                bw.write(index);

                br.close();
                bw.flush();

            }
        }