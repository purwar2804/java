abstract class Animal
{
abstract void makeVoice();
}
class Cow extends Animal
{
	void makeVoice()
	{
		System.out.println("Cow Voice");
	}
}
class Dog extends Animal
{
	void makeVoice()
	{
		System.out.println("Dog voice");
	}
}
class Pig extends Animal
{
	void makeVoice()
	{
		System.out.println("Pig Voice");
	}
}
class Goat extends Animal
{
	void makeVoice()
	{
		System.out.println("Goat Voice");
	}
}
class Lion extends Animal
{
	void makeVoice()
	{
		System.out.println("Lion Voice");
	}
}
class Voice
{
	Animal animal[];
	int i;
	void prepareVoice()
	{
		animal=new Animal[5];
		animal[0]=new Cow();
		animal[1]=new Dog();
		animal[2]=new Pig();
		animal[3]=new Goat();
		animal[4]=new Lion();
	}
	void hear()
	{
		for(i=0;i<5;i++)
		{
			animal[i].makeVoice();
		}
	}
	void run()
	{
		prepareVoice();
		hear();
	}
}
class Test6
{
	public static void main(String[] args) {
		Voice v=new Voice();
		v.run();
	}
}