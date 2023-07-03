import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int num1 = Integer.parseInt(br.readLine());
        String num2 = br.readLine();
        int num = Integer.parseInt(num2);
        
        int n1 = num2.charAt(2) - '0';
        int n2 = num2.charAt(1)- '0';
        int n3 = num2.charAt(0)- '0';
       
        
        System.out.println(num1 * n1);
        System.out.println(num1 * n2);
        System.out.println(num1 * n3);
        System.out.println(num1 * num);
   
    }
}