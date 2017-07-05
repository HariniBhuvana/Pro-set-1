  import java.io.*;
 import java.util.*;
 public class Leastno
{
  public static void main(String args[])throws IOException
  {
    
    BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
    int n=Integer.parseInt(br.readLine());
    n=Math.abs(n);
    String m=Integer.toString(n);
    int o=m.length();
    
    int b[]=new int[o];
    
    int i=0;
    while (n>0) {
      b[i]=n%10;
      
      n=n/10;
      i++;
      
    } 
    Arrays.sort(b);
    for( i=0;i<o;i++)
    {
      
      System.out.println(b[i]);  
    }
    System.out.println("Enter the number of digits to be eliminated");
    
    int a= Integer.parseInt(br.readLine());
    int h=o-a;
    for(i=0;i<h;i++)
    {
      System.out.println(b[i]);
       }
       

    
    
  } 
  
  
  
  
  
}
