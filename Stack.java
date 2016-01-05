/**
 * @(#)Stack.java
 *
 *
 * @author matt delashaw
 * @version 1.00 2014/10/7
 */


public class Stack {

	private Character[] data;
	private int top;
	private int size;

    public Stack() {
    	top = -1;
    	size = 100;
    	data = new Character[100];
    }

    public Stack(int n){
    	top = -1;
    	size = n;
    	data = new Character[n];
    }

    public boolean push(Character newChar){
    	if(top == size - 1)
    		return false;
    	else
    		top = top + 1;
    		data[top] = newChar;
    		return true;
    }

    public Character pop(){
    	int topLocation;
    	if(top == -1)
    		return null;
    	else
    		topLocation = top;
    		top = top - 1;
    		return data[topLocation];
    }

	public boolean isEmpty(){
			if(data != null)
				return false;
			else
				return true;
	}

    public void showAll(){
    	for(int i = top; i >= 0; i--)
    		System.out.println(data[i]);
    }

}
