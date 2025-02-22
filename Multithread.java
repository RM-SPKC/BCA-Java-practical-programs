import java.util.*;

class Multithread
{
  public static int n;

  public static void main(String args[])
  {
    Thread t1 = new Thread()
    {	
      public void run()
      {
        System.out.println("\n\t\t\tMultithreading");
		System.out.println("\t\t\t--------------");
		Random r = new Random();
        for(int i = 1; i <= 5; i++)
        {
          n = r.nextInt(50);
          System.out.println("\nGenerated Random Number: "+n);
          if(n % 2 == 0)
          {
            Thread t2 = new Thread()
            {
              public void run()
              {
                System.out.println("Square of " +n +" : "+ (n * n));
              }
            };
            t2.start();  // Start the thread here
          }
          else
          {
            Thread t3 = new Thread()
            {
              public void run()
              {
                System.out.println("Cube of  " +n +" : "+ (n * n * n));
              }
            };
            t3.start();  // Start the thread here
          }
		  try
          {
            Thread.sleep(1000);
          }
          catch(Exception e)
          {
            System.out.println(e);
          }
        }
      }
	  
    };

    t1.start();  // Start the main thread
  }
}
