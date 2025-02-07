import java.util.*;
public class Prime
{  
    public static void main(String a[])
	{   
        Scanner s = new Scanner(System.in);
		System.out.println("\t\t\tPrime numbers");
		System.out.println("\t\t\t-------------");
        System.out.print("\n\nEnter the limit: ");
        int limit = s.nextInt();
        System.out.println("\n\nPrime numbers up to " + limit + " are:");
        for (int n = 2; n <= limit; n++) 
		{   int c=0;
		    for(int i=1;i<=n;i++)
			{
            if(n%i==0)
			  c++;
			}
			if(c==2)
               System.out.print(n + "  ");			
        }
    }
}
