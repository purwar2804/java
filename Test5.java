class One
{
	One()
	{
		System.out.println("hello word");
	}
}
class Two extends One
{
	
	void show()
	{
		System.out.println("Two class");
	}
}
class Test5
{
	public static void main(String args[])
	{
		One ob=new One();

	}
}