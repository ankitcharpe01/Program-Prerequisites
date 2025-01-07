import java.util.*;
public class addTwoNumbers {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
	 	System.out.println("Enter First Number");
		double first_Number = sc.nextInt();
		System.out.println("Enter Second Number");
		double second_Number = sc.nextInt();
		System.out.println("Your Addition is:"+(first_Number+second_Number));
	}
}