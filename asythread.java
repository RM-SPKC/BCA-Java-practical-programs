class asyn
{
 public void print(int x,int y,String tn)
 {
  try
  {
  for (int i=x;i<=y;i++)
  {
   System.out.println(tn+(i));
   Thread.sleep(1000);
  }
  }
  catch(InterruptedException e)
  {
	  System.out.println(e);
  }
 }
}
class asythread
{
 public static void main(String args[])
 {
  System.out.println("\t\t\tAsynchronous Threads");
  System.out.println("\t\t\t--------------------");
  asyn a=new asyn();
  Thread t1=new Thread()
  {
	public void run()
	{
	a.print(1,10,"Thread 1 : ");
	}
  };
  Thread t2=new Thread()
  {
	public void run()
    {
	a.print(90,100,"Thread 2 : ");
	}
  };
  t1.start();
  t2.start();
  
 }
}