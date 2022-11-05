/*A 
B C 
D E F 
G H I J 
K L M N O 
*/ 
public class pyramid3
{
    public static void main(String[] args)
    {
        int alphabet = 65;//ascii value of a

         
        for (int i = 0; i <= 4; i++)//initiation of loop for row
        {
            for (int j = 0; j <= i; j++)//loop for column
            {
                System.out.print((char) alphabet + " ");
                alphabet++;
            }
            System.out.println();//print the pattern
        }
    }
}

