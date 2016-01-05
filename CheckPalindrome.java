import java.util.*;
import java.lang.Character;


class CheckPalindrome {
	
	public static void main(String[] args){
		
		String phrase;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Input your phrase");
		phrase = sc.next().toLowerCase();
		Stack s = new Stack(phrase.length());
		Queue q = new Queue(phrase.length());
		
		if(phrase.isEmpty() == false){
			for(int i = 0; i < phrase.length(); i++){
				char c = phrase.charAt(i);
				s.push(c);
				q.enque(c);
			}	
		} else {
			System.out.println("surely you have something to try");
		}
		
		s.showAll();
		q.showAll();
		
		for(int i = 0; i < phrase.length(); i++){			
			if(s.pop() == q.deque()){
				System.out.println("is a palindrome");
			} else {
				System.out.println("is not a palindrome");
			}
		}
		
	}
}
