package tanzeela;

public class NestedIf 
{
	public static void main(String[] args) 
	{
		int number = 5;
		if(number <= 10) //outer if
		{
			if(number==5) //inner if
			{
				System.out.println("Number is equal to 5");
			}
			else //inner else
			{
				System.out.println("Number is not equal to 5");
			}
		}
		else   //outer else
		{
			System.out.println("Number is greater than 10");
		}
	}
}


