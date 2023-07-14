            import java.io.*;
            import java.util.*;

            public class b10798{
                public static void main(String[] args) throws IOException {
                    BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
                    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

                    char[][] arr = new char[5][15];
                    int max = 0;

                    for(int i=0; i<5; i++) {
                        String input = br.readLine();
                        if(max < input.length()) max = input.length();
                        for(int j=0; j<input.length(); j++) {
                            arr[i][j] = input.charAt(j);
                        }
                    }
                    String result = "";
                    for(int i=0; i <max; i++) {
                        for(int j=0; j<5; j++) {
                            if(arr[j][i] != '\0'){
                                result += arr[j][i];
                            }
                            
                        }
                    }

                    System.out.println(result);

                    br.close();
                    bw.flush();

                }
            }