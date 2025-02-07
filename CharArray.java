import java.util.*;
class CharArray
{
  public static void main(String args[])
 {
 int ch;
 char c[];
 Scanner s=new Scanner(System.in);
 System.out.println("\n\t\t\tString Operations using Character Array");
 System.out.println("\t\t\t---------------------------------------");
 System.out.println("\nEnter a String : ");
 c=s.next().toCharArray();
 
 System.out.println("\n\t\t\t1.Length of a string");
 System.out.println("\t\t\t--------------------");
 System.out.println("\nLength of the given String : "+c.length);
 
 System.out.println("\n\t\t\t2.Searching a character");
 System.out.println("\t\t\t----------------------");
 System.out.println("\nEnter an index to search a character :");
 int k=s.nextInt();
 System.out.println("Character at "+k+ "  is : "+ c[k]);

 System.out.println("\n\t\t\t3.Concatenate two Strings");
 System.out.println("\t\t\t------------------------");
 System.out.println("\nEnter a string to concatenate :");
 char n[]=s.next().toCharArray();
 int l=c.length+n.length;
 char r[]=new char[l]; 
 System.arraycopy(c,0,r,0,c.length);
 System.arraycopy(n,0,r,c.length,n.length);
 System.out.println("\nFirst string : " +new String(c));
 System.out.println("Second string : " +new String(n));
 System.out.println("Concatenated strings :" +new String(r));
	
  }
 }