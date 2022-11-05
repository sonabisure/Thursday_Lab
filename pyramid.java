/*1
   01
  101
 0101
10101
*/


public class pyramid
{
    // Function to demonstrate printing pattern
    public static void main (String[] args)
    {
    	A();
    }
    /**
     * 
     */
    public static void A()
    {
int i,j;
		// // outer loop to handle number of rows
		for(i=1;i<=5;i++)
		{
			for(j=4;j>=i;j--)//  //  inner loop to handle number of columns
			{
				System.out.print(" ");	// printing num with a space
			}
			for(j=1;j<=i;j++)
			{
				if(i%2==0)
				{
					if(j%2==0)
					{
						System.out.print("1");
					}
					else
					{
						System.out.print("0");
					}
				}
				else
				{
					if(j%2==0)
					{
						System.out.print("0");//PRINT THE VALUE OF 0
					}
					else
					{
						System.out.print("1");//PRINT THE VALUE OF 1
					}
				}
			}
			
			System.out.println();// ending line after each row
		}
		
		

	}

}