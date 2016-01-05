/**
 * @(#)Database.java
 *
 *
 * @author matt delashaw
 * @version 1.00 2014/10/1
 */
import javax.swing.JOptionPane;
import java.util.Arrays;

public class Database {

    public static void main(String[] args) {

    	DataStructure1 d = new DataStructure1();
    	StudentListings s = new StudentListings();
    	int option;
    	String name;
		StudentListings u = new StudentListings();

    	do{
    	option = Integer.parseInt(JOptionPane.showInputDialog("1 to insert a new student's information\n"+
    		"2 to fetch and output a student's information\n"+
    		"3 to delete a student's information\n"+
    		"4 to update a student's information\n"+
    		"5 to output all the student information in sorted order\n"+
    		"6 to exit the program"));

    	if(option < 1 || option > 6){
    		JOptionPane.showMessageDialog(null, "Input was out of range.");
    	}

		switch(option){

    	case 1: s.input();
    		d.insert(s);
    		break;

    	case 2: JOptionPane.showMessageDialog(null, d.fetch(name = JOptionPane.showInputDialog("search name")));
    		break;

    	case 3:	JOptionPane.showMessageDialog(null, d.delete(name = JOptionPane.showInputDialog("student to delete")));
    		break;

    	case 4: u.input();
			d.update(JOptionPane.showInputDialog(null, "student name to update"), u);
    		break;

    	case 5: d.showAll();
    		break;
    	}

    	}while(option != 6);
    }


}
