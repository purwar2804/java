class Second
{
	public static void main(String args[])
	{
		int i,j;
		for(i=0;i<4;i++)
		{
			for(j=3-i;j>0;j--)
			{
				System.out.print(" ");
			}
			for(j=i;j>=0;j--)
			{
				System.out.print("*");
				System.out.print(" ");
			}
			System.out.print("\n");
		}
	}
}