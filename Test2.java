class Animal
{
	void eat()
	{
		System.out.println("eating");
	}
}
class Dog extends Animal
{
	void bark()
	{
		System.out.println("barking");
	}
}
class Babydog extends Dog
{
	void weap()
	{
		System.out.println("weaping");
	}
}
class Test2
{
	public static void main(String args[])
	{
		Babydog d=new Babydog();
		d.eat();
		d.bark();
		d.weap();
	}
}