/**
 * @(#)Example.java
 *
 *
 * @author: matt delashaw
 * @version 1.00 2014/8/27
 */
import java.util.Scanner;

public class Example {

    public static void main(String[] args) {
    	int ExpectHours = 2;
    	int credits;
    	String cont = "y";
    	Scanner input = new Scanner(System.in);

		//for {int i = 0; i < 3; i++){
    	do {
    		System.out.print("Please enter the credits for this course as an integer: ");
    		credits = input.nextInt();
    		if (credits >= 4) {
    			credits = 4;
    		}
    		System.out.println("Expect to spend "+(ExpectHours * credits) );
    		System.out.println("Do another calculation? y/N");
    		cont = input.next();
    	} while (cont.equalsIgnoreCase("y"));
    	//}
    }


}
