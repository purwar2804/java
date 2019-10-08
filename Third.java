class Third
{
	public static void main(String args[])
	{
		int i,j;
		for(i=0;i<=3;i++)
		{
			for(j=i;j>0;j--)
			{
				System.out.print(" ");
			}
			for(j=4-i;j>0;j--)
			{
				System.out.print("*");
				System.out.print(" ");
			}
			System.out.print("\n");
		}
	}
}