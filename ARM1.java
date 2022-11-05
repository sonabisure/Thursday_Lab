 
//function to check if the number is Armstrong or not  
 
import java.util.Scanner;

class ARM1 {

    public static void main(String[] args) {

        int originalNum, digit, cubeSum = 0,num;
        
        System.out.println("Enter the number:");
        Scanner sc = new Scanner(System. in );
        num = sc.nextInt();
        originalNum = num;
        

        while (num!= 0)
        {
            digit = num % 10;
            cubeSum += Math.pow(digit, 4);
            num /= 10;
            
        }

        if(cubeSum == originalNum)
            System.out.println(originalNum+ " is an Armstrong number");
        else
            System.out.println(originalNum+ " is not an Armstrong number");
    }
}