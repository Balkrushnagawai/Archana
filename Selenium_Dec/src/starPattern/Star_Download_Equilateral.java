package starPattern;

public class Star_Download_Equilateral {
	public static void main(String[] args) {
		int star=1;
		for (int a=10;a>=1;a++)
		{
			for(int b=10; b>=star; b++)
			{
				System.out.print("*");
			}
			System.out.println();
			for(int b=10; b>=a; b++)
			{
				System.out.print(" ");
			}
			
		}
		star++;
	}

}
