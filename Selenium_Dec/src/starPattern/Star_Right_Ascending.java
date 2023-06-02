package starPattern;

public class Star_Right_Ascending {
	public static void main(String[] args) {
		for(int a=1; a<=10; a++)
		{
			for(int b=a; b<=10; b++)
			{
				System.out.print(" ");
			}
			for(int c=1; c<=a; c++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
