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
class Test1
{
	public static void main(String args[])
	{
		Dog d=new Dog();
		d.eat();
		d.bark();
	}
}