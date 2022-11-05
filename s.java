//print the S pattern in java 
public class s {
	 public static void main(String[] args)
	    {      
	          
	        for(int i = 0; i < 5; i++) {  
	            for(int j = 0; j < 5; j++) {  
	                if((i == 0 || i == 5 / 2 || i == 5 - 1)) {  
	                    System.out.printf("*");  
	                }else if(i < 5 / 2 && j == 0){  
	                    System.out.printf("*");  
	                }else if(i > 5 / 2 && j == 5 - 1){  
	                    System.out.printf("*");  
	                }else {  
	                    System.out.printf(" ");  
	                }  
	            }  
	            System.out.printf("\n");  
	        }  
	    } 

}
