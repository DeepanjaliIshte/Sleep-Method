
public class Test {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			for( int i=1;i<=5;i++)
			{
				Thread.sleep(1000);
				System.out.println(i);
			}
		}
		catch (Exception e){
			System.out.println(e);
		}
	}

}
