public class Unary   
{  
public static void main(String args[])  
{  
int x = 2; 
int y=++x;
int z=x++ + ++y;
int m=x++ + ++x + y++ - z--;
System.out.println(y);  

System.out.println(z);

System.out.println(m);
   }
}
