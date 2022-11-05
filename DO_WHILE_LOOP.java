//WRITE A PROGRAM TO ACCEPT NUMBER FROM THE USER AND FOUND OUT THE FACTORIAL  

 /*import java.util.Scanner;
class DO_WHILE_LOOP
{
  @SuppressWarnings("resource")
public static void main(String args[])
  {
    int no1, no2, factorial = 1;

    System.out.println("Enter an integer:");
    Scanner sc = new Scanner(System.in);

    no1 = sc.nextInt();

    if (factorial < 0)
      System.out.println("Number should be non-negative.");
    else
    {
      for (no2 = 1; no2 <= no1; no2++)
        factorial = factorial*no2;

      System.out.println("Factorial of "+no1+" is = "+factorial);
    }
  }
}
	*/
		
		
/*import java.util.Scanner;  
  
 public class DO_WHILE_LOOP  {  
    @SuppressWarnings("resource")
	public static void main(String[] args) {  
          
        //declaring and initializing variables   
        int fact = 1;  
        int i = 1;  
  
        //creating object of Scanner class  
        Scanner sc = new Scanner(System.in);  
  
        //accepting a number from the user  
        System.out.println("Enter a number: ");  
        int num = sc.nextInt();  
          
        //counting the factorial using while loop  
        while( i <= num ){  
            fact = fact * i;   
            i++; //increment i by 1   
        }     
  
        //printing the result  
        System.out.println("\nFactorial of " + num + " is: " + fact);  
    }  
}  


*/

//importing Scanner class  
/*import java.util.Scanner;  
  
public class  DO_WHILE_LOOP{  
    
	public static void main(String[] args) { 
    	fact();

    }
    @SuppressWarnings("resource")
	public static void fact()  {
        //declaring and initializing variables   
        int fact = 1;  
        int i = 1;  
  
        //creating object of Scanner class  
        Scanner sc = new Scanner(System.in);  
  
        //accepting a number from the user  
        System.out.println("Enter a number : ");  
        int num = sc.nextInt();  
          
        //counting the factorial using do-while loop  
        do {  
            fact = fact * i;   
            i++;   
        } while( i <= num );  
  
        //printing the result  
        System.out.println("\nFactorial of " + num + " is: " + fact);  
    } 

}
*/
/*
  import java.util.Scanner;

class DO_WHILE_LOOP {
    public static void main(String[] args) {
     System.out.println("Enter a number: ");
        num=sc.nextlnt();
          for(i=2;i<=num;i++)
          {
        	  if(num%i==0)
        	  {
        		  break;
        	  }
          if(num==i)
          {
        	  System.out.print( "number is prime"+num);
        	  
          }
          else {
        	  System.out.print( "number is not prime"+num);
        	  
          }
          }
       
          
  */  	
/*

          import java.util.Scanner;
          public class DO_WHILE_LOOP
          {
             public static void main(String[] args) 
             {
                int number, s, e;
                Scanner sc = new Scanner(System.in);
                System.out.println("Please enter a number: ");
                number = sc.nextInt(); 
                s = 1;
                e = 0; 
                while(s <= number)
                {
                   if((number % s) == 0) 
                      e = e + 1;
                   s++;
                }
                if(e == 2)
                {
                   System.out.println(number + " is a prime number.");
                }
                else
                {
                   System.out.println(number + " is not a prime number.");
                }
                sc.close();
             }
          }
		
*/

import java.util.Scanner;
public class  DO_WHILE_LOOP 
{
    public static void main(String[] args) 
    {
     fibo();  
    }
    public static void fibo(){ 
    int n, a = 0, b = 0, c = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of n:");
        n = sc.nextInt();
        System.out.print("Fibonacci Series is:");
        for(int i = 1; i <= n; i++)
        {
            a = b;
            b = c;
            c = a + b;
            System.out.print(a+" ");
        }
    }
}


 