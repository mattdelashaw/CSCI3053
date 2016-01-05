/**
 * @(#)DataStructure1.java
 *
 *
 * @author matt delashaw
 * @version 1.00 2014/9/17
 */
import javax.swing.JOptionPane;
import java.util.Arrays;

public class DataStructure1 {

	private int next;
	private int size;
	private StudentListings[] data;

    public DataStructure1() {
    	next = 0;
    	size = 100;
    	data = new StudentListings[size];
    }

    public DataStructure1(int s){
    	next = 0;
    	size = s;
    	data = new StudentListings[s];
    }

    public boolean insert(StudentListings newListing){
    	if(next >= size)
    		return false;
    		data[next] = newListing.deepCopy();

    	if(data[next] == null)
    		return false;
    		next = next + 1;
    		return true;
    }

    public StudentListings fetch(String targetKey){
    	StudentListings studentlisting;
    	StudentListings temp;

    	int i = 0;
    	while(i < next && !(data[i].compareTo(targetKey) == 0)){
    		i++;
    	}
    	if(i == next)
    		return null;
    	studentlisting = data[i].deepCopy();

    	if(i != 0){
    		temp = data[i - 1];
    		data[i - 1] = data[i];
    		data[i] = temp;
    	}
    	return studentlisting;
    }

    public boolean delete(String targetKey){
    	int i = 0;
    	while(i < next && !(data[i].compareTo(targetKey) == 0)){
    		i++;
    	}
    	if(i == next)
    		return false;
    	data[i] = data[next - 1];
    	data[next - 1] = null;
    	next = next - 1;
    	return true;
    }

    public boolean update(String targetKey, StudentListings newListing){
		if(delete(targetKey) == false)
    		return false;
    	else if(insert(newListing) == false)
    		return false;
    	else
    		return true;
    }

    public void showAll(){
		for(int i = 0; i < next; i++)
    		JOptionPane.showMessageDialog(null, data[i].toString());
    }
}
