/**
 * @(#)MethodExample.java
 *
 *
 * @author matt delashaw
 * @version 1.00 2014/9/3
 */
import java.util.*;

public class MethodExample {

    public static void main(String[] args) {

    	int ExpectHours = 2;
    	int credits;
    	int hours;
    	Scanner input = new Scanner(System.in);

    	System.out.print("Please enther the credits for this course as an interger: ");
    	credits = input.nextInt();
    	hours = hourCalculator(credits, ExpectHours);
    	System.out.println("hours to expect " + hours);
    }

	public static int hourCalculator(int c, int h) {
		return c * h;
	}

}
