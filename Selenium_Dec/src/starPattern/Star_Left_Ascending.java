package starPattern;

public class Star_Left_Ascending {
	public static void main(String[] args) {
		//Triangle Left Ascending
		for (int a=1; a<=20; a++)
		{
			for(int b=1; b<=a; b++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
