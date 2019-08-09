
public class HelloWorld {

	public void add(int a,int b)
	{
		System.out.println(a+b);
	}
	
	public static void main(String... aargs)
	{
		HelloWorld hw=new HelloWorld();
		hw.add(12, 13);
		
		
		System.out.println("Hello World");
	}
}
