
public class Sleep_multithreading extends Thread
	{
		public void run() 
		{
				try
				{
					for( int i=1;i<=5;i++)
					{
						
					System.out.println(i+" : "+Thread.currentThread().getName());
					Thread.sleep(1000);
					}
				}
				catch(Exception e)
				{
					System.out.println(e);
				}
		}
		public static void main (String[] args)
		{
			Sleep_multithreading sm=new Sleep_multithreading();
			//sm.run();
			sm.start();
			Sleep_multithreading sm1=new Sleep_multithreading();
			//sm1.run();
			sm1.start();
		}
}