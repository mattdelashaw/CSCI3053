/**
 * @(#)StudentListings.java
 *
 *
 * @author
 * @version 1.00 2014/9/15
 */
import javax.swing.JOptionPane;

public class StudentListings {

	private String name;
	private int idnum;
	private double gpa;

	public StudentListings(){
	}

    public StudentListings(String n, int id, double g) {
    	name = n;
    	idnum = id;
    	gpa = g;
    }

    public String toString() {
    	return("Name is " + name + "\nID Number is " + idnum + "\nGPA is " + gpa + "\n");
    }

    public StudentListings deepCopy(){
    	StudentListings clone = new StudentListings(name, idnum, gpa);
    	return clone;
    }

    public int compareTo(String targetKey){
    	return(name.compareTo(targetKey));
    }

    public void input(){
    	name = JOptionPane.showInputDialog("Enter new name");
    	idnum = Integer.parseInt(JOptionPane.showInputDialog("Enter new ID number"));
    	gpa = Double.parseDouble(JOptionPane.showInputDialog("Enter new GPA"));
    }
}
