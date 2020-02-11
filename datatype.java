import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        double o=scan.nextDouble();
        scan.nextLine();
         String t=scan.nextLine();
        
        System.out.println(i+n);
        System.out.println(d+o);
        System.out.println(s+t);


        scan.close();
    }
}
