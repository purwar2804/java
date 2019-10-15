class Mother
{
	void show()
	{
		System.out.println("Mother class");
	}
}
class Child extends Mother
{
	static void show()
	{
		System.out.println("Child class");
	}
}
class Test4
{
	public static void main(String args[]) {
		Child ch=new Child();
		ch.show();
	}
	
}