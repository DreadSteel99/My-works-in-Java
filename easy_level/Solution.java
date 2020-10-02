import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args)throws IOException {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        int c=Integer.parseInt(in.readLine());
        String s="",s1="",s2="";
        for(int i=1;i<=c;i++){
            s=in.readLine();
            for(int j=0;j<s.length();j++){
                if(j%2==0)
                    s1=s1+s.charAt(j);
                else
                    s2=s2+s.charAt(j);
            }
            System.out.println(s1+" "+s2);
            s1="";
            s2="";
        }
    }
}

