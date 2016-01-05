import java.util.Scanner;

public class Fibonacci{
public static void main(String[] args){

	Scanner input = new Scanner(System.in);
	int n = input.nextInt();
	long result = fib(n);
	System.out.println(result);
}
	public static long fib(int n){
		if(n == 1 || n == 2){
			return 1;
		}else{
			long rp1 = fib(n-1);
			long rp2 = fib(n-2);
			long gs = rp1 + rp2;
			return gs;
		}
	}
}
