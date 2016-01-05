/**
 * @(#)Queue.java
 *
 *
 * @author matt delashaw
 * @version 1.00 2014/10/7
 */


public class Queue {

	private Character[] data;
	private int size;
	private int numOfNodes;
	private int front;
	private int rear;

    public Queue() {
    	size = 100;
    	numOfNodes = 0;
    	front = 0;
    	rear = 0;
    	data = new Character[100];
    }

    public Queue(int n){
    	size = n;
    	numOfNodes = 0;
    	front = 0;
    	rear = 0;
    	data = new Character[n];
    }

    public boolean enque(Character newChar){
    	if(numOfNodes == size)
    		return false;
    	else
    		numOfNodes = numOfNodes + 1;
			data[rear] = newChar;
    		rear = (rear + 1) % size;
    		return true;
    }

    public Character deque(){
    	int frontLocation;
    	if(numOfNodes == 0)
    		return null;
    	else
    		frontLocation = front;
    		front = (front + 1) % size;
    		numOfNodes = numOfNodes - 1;
    		return data[frontLocation];
    }

    public void showAll(){
    	int i = front;
    	for(int c = 1; c <= numOfNodes; c++){
    		System.out.println(data[i]);
    		i = (i + 1) % size;
    	}
	}
}
