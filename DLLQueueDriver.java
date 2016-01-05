import java.util.Scanner;

public class DLLQueueDriver {
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		DLLQueue q = new DLLQueue();
		System.out.println("input new node");
		q.insert(input.next());
	}
}
