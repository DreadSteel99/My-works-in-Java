import java.util.*;
import java.io.*;
public class KaratsubaMul{
  public long karat(long x, long y){
    int length = (int) (Math.log10(x) + 1);
    if(length<2){return x*y;}
    long log1=(int)Math.pow(10,length/2);
    //System.out.println("log1:"+log1);
    long a=x/log1;
    long c=y/log1;
    long b=x%log1;
    long d=y%log1;
    long ac=karat(a,c);
    long bd=karat(b,d);
    long t=(int)Math.pow(10,length)*ac+bd+log1*(karat((a+b),(c+d))-ac-bd);
    //System.out.println(t);
    return t;
  }
  public static void main(String[] args){
    KaratsubaMul obj=new KaratsubaMul();
    System.out.println(obj.karat(2,3));
    System.out.println(obj.karat(12345678,12345679));
  }
}
