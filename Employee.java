class Employee
{
	int id;
	String name;
	int salary;
	void insert(int i,String n,int s)
	{
		id=i;
		name=n;
		salary=s;
	}
	void display()
	{
		System.out.println(id+" "+name+" "+salary);
	}
	public static void main(String args[])
	{
		Employee obj=new Employee();
		obj.insert(12,"utkarsh",2000);
		obj.display();

	}
}