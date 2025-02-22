import java.util.*;
class excep
{
	 static int size,i;
	 static int a[];
	 static int sum=0;
 public static void main(String args[])
 {  
    System.out.println("\t\t\tException Handling");
	System.out.println("\t\t\t------------------");
	Scanner s=new Scanner(System.in);
    try
	{
	System.out.println("Enter the size : ");
	size=Integer.parseInt(s.next());
	}
	catch(NumberFormatException ne)
	{
	 System.out.println("(Number Format Exception)Trying to convert string into integer");
	 System.out.println("\nEnter the size in integer: ");
	 size=s.nextInt();
	 }
	try
	{
	  a=new int[size];
	}
	catch(NegativeArraySizeException n)
	{
		System.out.println("(Negative Array Size Exception)Enter the size of array in Positive : ");
		size=s.nextInt();
		a=new int[size];
	}
	try
	{   System.out.println("\nEnter the elements one by one:");
		for(i=0;i<=size;i++)
			a[i]=s.nextInt();
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println("(Array Index out of Bounds Exception)Index value out of bound");
	    System.out.println("\nOnce Again enter the elements one by one:");
		for(i=0;i<size;i++)
		{
			a[i]=s.nextInt();
		    sum=sum+a[i];
		}
		System.out.println("\tSum of array : "+sum);
	}
	try
	{
		System.out.println("\nEnter a denominator to divide the sum:");
		int d=s.nextInt();
		int r=sum/d;
	}
    catch(ArithmeticException ex)
	{
		System.out.println("\n(Arithmetic Exception)Enter a non-zero denominator : " );
	    int d=s.nextInt();
		int r=sum/d;
		System.out.println("\n\t\tAverage of an array : "+sum+"/"+d+"="+r);
	}
 }
}
 