import java.util.*;
class Randomno
{
 public static void main(String arg[])
 {
    int rn,i;
    Scanner s=new Scanner(System.in);
	System.out.println("\n\t\t\tRandom Numbers Generation");
	System.out.println("\t\t\t-------------------------");
    System.out.println("\nEnter the lower limit : ");
	int l=s.nextInt();
    System.out.println("Enter the upper limit : ");
	int u=s.nextInt();
	
	Random r=new Random();
	System.out.println("How many random numbers have to generate? : ");
	int n=s.nextInt();
	System.out.println("\n\t\tRandom numbers are : ");
	System.out.println("\t\t------------------- ");
	for(i=1;i<=n;i++)
	{
	 rn=r.nextInt(u-l+1)+l;
	 int mid=(u+l)/2;
	 if(rn>mid)
	   System.out.println("\n"+rn + "--> is in the higher range ");
     else if(rn<mid)
	   System.out.println("\n"+rn + "--> is in the lower range ");
	 else
	   System.out.println("\n"+rn + "--> is in the mid range ");
	}
 }
}