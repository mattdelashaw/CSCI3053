/**
 * @(#)DSDriver1_MD.java
 *
 *
 * @author matt delashaw
 * @version 1.00 2014/9/17
 */
import javax.swing.JOptionPane;

public class DSDriver1_MD {

    public static void main(String[] args){


		String name;
    	DataStructure1 d = new DataStructure1();
    	StudentListings s = new StudentListings();
    	StudentListings u = new StudentListings();

		for(int i=0; i <3; i++){
    		s.input();
    		d.insert(s);
    	}
		System.out.println(d.fetch(name = JOptionPane.showInputDialog("search name")));
		System.out.println(d.delete(name = JOptionPane.showInputDialog("Student to delete")));
		u.input();
		System.out.println(d.update(name = JOptionPane.showInputDialog("Student to update"), u));
    	d.showAll();
    }


}

