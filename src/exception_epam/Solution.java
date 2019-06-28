package exception_epam;

import java.io.*;
import java.util.*;

public class Solution {
    public static final MyCalculator my_calculator = new MyCalculator();
    
    public static void main(String[] args) throws Exception{
    	BufferedReader ip = new BufferedReader(new InputStreamReader(System.in));
    	System.out.println("enter");
    	int in = Integer.parseInt(ip.readLine());
        while (in>0) {
            int n = Integer.parseInt(ip.readLine());
            int p = Integer.parseInt(ip.readLine());
            
            try {
                System.out.println(my_calculator.power(n, p));
            } catch (Exception e) {
                System.out.println(e);
            }
            in--;
        }
    }
}
