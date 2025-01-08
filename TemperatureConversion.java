import java.util.*;
public class tempConversion 
 {  
   public static void main (String args[])  
    { 
          float Fahrenheit, Celsius; 
	  Scanner sc = new Scanner(System.in);
          System.out.println("Enter temperature in Celsius");  
          Celsius =sc.nextInt();  
          Fahrenheit =((Celsius*9)/5)+32;  
          System.out.println("Temperature in Fahrenheit is: "+Fahrenheit);  
    }
}  