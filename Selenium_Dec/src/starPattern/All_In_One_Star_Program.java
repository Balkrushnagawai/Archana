package starPattern;

public class All_In_One_Star_Program {
	public static void main(String[] args) {
		System.out.println("Horizontal print------------------------->");
		for(int a=1; a<=10; a++)
		{
			System.out.print("*");
		}
		
		System.out.println();
		System.out.println("Vertical print------------------------->");
		for (int a=1; a<=10; a++)
		{
			System.out.println("*");
		}
		
		System.out.println("Left Ascending------------------------->");
		for(int a=1; a<=10; a++)
		{
			for (int b=1; b<=a; b++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("Right Ascending------------------------->");
		for(int a=1; a<=10; a++)
		{
			for (int b=a; b<=10; b++)
			{
				System.out.print(" ");
			}
			for (int b=1; b<=a; b++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("Left Descending------------------------->");
		for(int a=1; a<=10; a++)
		{
			for (int b=a; b<=10; b++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("Right Descending------------------------->");
		for(int a=1; a<=10; a++)
		{
			for (int b=a; b<=10; b++)
			{
				System.out.print("*");
			}
			System.out.println();
			for(int c=1; c<=a; c++)
			{
				System.out.print(" ");
			}
		}
	}

}
