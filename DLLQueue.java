public class DLLQueue {
	private Node h;
	private Node rear;
	
	public DLLQueue() {
		h = new Node();
		h.l = null;
		h.next = null;
		rear = new Node();
	}
	
	public boolean insert(StudentListings newListing){
		Node n = new Node();
		if(n == null)
			return false;
		else{
			n.next = h.next;
			h.next = n;
			if(rear == null)
				rear = n;
			else{
				rear.next = n;
				rear = n;
			}	
			return true;
		}
	}
	
	public StudentListings fetch(String targetKey){
		Node p = h.next;
		while(p != null && !(p.l.compareTo(targetKey) == 0)){
			p = p.next;
		}
		if(p != null)
			return p.l;
		else
			return null;
	}
	
	public boolean delete(String targetKey){
		Node q = h;
		Node p = h.next;
		while(p != null && !(p.l.compareTo(targetKey) == 0)){
			q = p;
			p = p.next;
		}
		if(p != null){
			q.next = p.next;
			return true;
		}
		else
			return false;
	}
	
	public boolean update(String targetKey, StudentListings newListing){
		if(delete(targetKey) == false)
			return false;
		else if(insert(newListing) == false)
			return false;
		return true;
	}
	
	public void showAll(){
		Node p = h.next;
		while(p != null){
			System.out.println(p.l.toString());
			p = p.next;
		}
	}
	
	public class Node {
		private StudentListings l;
		private Node next;
		public Node(){
			
		}
	}
}
