            import java.io.*;
            import java.util.*;

            public class b2563{
                public static void main(String[] args) throws IOException {
                    BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
                    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

                    int[][] arr = new int[100][100];
                    int n = Integer.parseInt(br.readLine());
                    for(int i=0; i<n; i++) {
                        String input = br.readLine();
                        StringTokenizer st = new StringTokenizer(input);
                        int x = Integer.parseInt(st.nextToken());
                        int y = Integer.parseInt(st.nextToken());

                        for(int j=x; j<x+10; j++) {
                            for(int k=y; k<y+10; k++) {
                                arr[j][k] = 1;
                            }
                        }
                    }
                    int count = 0;
                    for(int i=0; i<100; i++) {
                        for(int j=0; j<100; j++) {
                            if(arr[i][j] > 0) {
                                count++;
                            }
                        }
                    }
                    System.out.println(count);
                    br.close();
                    bw.flush();

                }
            }