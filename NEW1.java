 
/*  *         	 
   ***		
  *****		
 *******		
********
*/
public class NEW1 
{    
public static void main(String args[])   
{    
//i for rows and j for columns      
//row denotes the number of rows you want to print  
int i, j;      
//Outer loop work for rows  
 
	for(i=1;i<=5;i++)// inner loop to handle number spaces
	{
		for(j=4;j>=i;j--)// printing spaces
		{
			System.out.print(" ");	
		}
		for(j=1;j<2*i;j++) //  inner loop to handle number of columns
		{
			System.out.print("*"); // printing stars
		}
		System.out.print(" \n");	//printing on next line
	}
}
}  