        import java.io.*;
        import java.util.*;

        public class b2738{
            public static void main(String[] args) throws IOException {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

                String input = br.readLine();
                StringTokenizer st = new StringTokenizer(input);

                int n = Integer.parseInt(st.nextToken());
                int m = Integer.parseInt(st.nextToken());

                int[][] arr1 = new int[n][m];
                int[][] arr2 = new int[n][m];
                int[][] sum = new int[n][m];

                for(int i=0; i<n; i++) {
                    input = br.readLine();
                    StringTokenizer st2 = new StringTokenizer(input);
                    for(int j=0; j<m; j++) {
                        arr1[i][j] = Integer.parseInt(st2.nextToken());
                    }
                }
                for(int i=0; i<n; i++) {
                    input = br.readLine();
                    StringTokenizer st2 = new StringTokenizer(input);
                    for(int j=0; j<m; j++) {
                        arr2[i][j] = Integer.parseInt(st2.nextToken());
                    }
                }

                for(int i=0; i<n; i++) {
                    for(int j=0; j<m; j++) {
                        bw.write(arr1[i][j] + arr2[i][j] + " ");
                    }
                    bw.write("\n");
                }
                br.close();
                bw.flush();

            }
        }