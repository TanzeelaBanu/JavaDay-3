package tanzeela;

public class Pattern4 
{
	public static void main(String[] args) 
	{
		for(int i=1;i<=4;i++)
		{
			for(int k=1;k<=3-i+1;k++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=2*i-1;j++)
			{
				if(i==1||i==4||j==1||j<=2*i-1)
				{
				    System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}

