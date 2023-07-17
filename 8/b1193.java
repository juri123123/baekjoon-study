            import java.io.*;
            import java.util.*;

            public class b1193{
                public static void main(String[] args) throws IOException {
                    BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
                    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

                    int n = Integer.parseInt(br.readLine());
                    int count = 1;
                    int num = 1;
                    if(n == 1) {
                        System.out.println("1/1");
                    } else{
                        while(num<n) {
                            count++;
                            num += count;
                            
                        }
                        //System.out.println(count);
                        int sum = 0;
                        for (int i=1; i<=count-1; i++) {
                            sum += i;
                        }
                        int x = 0;
                        int y = 0;
                        if(count % 2 == 0) {
                            x = 1;
                            y = count;
                        
                            for(int i=1; i<n-sum; i++) {
                                    x++;
                                    y--;
                                }
                        } else {
                            x = count;
                            y = 1;

                            for(int i=1; i<n-sum; i++) {
                                x--;
                                y++;
                            }
                        }
                        System.out.println(x + "/" + y);
                    
                    }
                    


                    br.close();
                    bw.flush();

                }
            }
