class Mother
{
	int salary=10000;
}
class Child extends Mother
{
	int bonus=1000;
}
class Application
{
	public static void main(String args[])
	{
		Child ch=new Child();
		System.out.println(ch.salary);
		System.out.println(ch.bonus);
	}
}