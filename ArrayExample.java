/**
 * @(#)ArrayExample.java
 *
 *
 * @author matthew delashaw
 * @version 1.00 2014/9/3
 */
import java.util.*;

public class ArrayExample {

    public static void main(String[] args) {

    int[] saved = new int[3];
    int ExpectHours = 2;
    Scanner input = new Scanner(System.in);

    for (int count = 0; count < 3; count ++) {
    	System.out.println("Please enter the credits for this course as an integer: ");
    	int credits = input.nextInt();
    	saved[count] = ExpectHours * credits;
    }
    	System.out.println(Arrays.toString(saved));
    }


}
