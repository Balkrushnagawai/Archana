package starPattern;

public class Star_Equilateral_Download {
	public static void main(String[] args) {
		for(int a=1; a<=4; a++)
		{
			for (int b=a; b<=7-2; b++)
			{
				System.out.print("*");
			}
			for (int c=1; c<=a; c++)
			{
				System.out.print(" ");
			}
			System.out.println();
		}
	}
	

}
