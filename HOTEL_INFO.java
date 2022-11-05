import java.util.Scanner;

public class HOTEL_INFO {

	 
		public class for_demo 
		{

			public static void main(String[] args) 
			{ 
				disp1();
			}
			
			public static void disp1()
			{
				try (Scanner SC = new Scanner(System.in)) {
					int i,min , max ;
					
					System.out.println("Enter the minimum number");
					min=SC.nextInt();
					System.out.println("Enter the maximum number");
					max=SC.nextInt();
					
					for(i=min;i<=max;i++)
					{
						System.out.println(i);
					}
				}
			}


	}

}
