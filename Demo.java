
public class Demo extends Thread {
	public void run() {
		
			for( int i=1;i<=5;i++)
			{
			try
			{
				Thread.sleep(500);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			System.out.println(i);
		}
	}
			public static void main (String[] args)
			{
				Demo d=new Demo();
				d.start();
			}
	}
	

