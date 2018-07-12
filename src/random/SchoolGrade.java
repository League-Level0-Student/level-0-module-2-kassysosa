package random;

import javax.swing.JOptionPane;

public class SchoolGrade {
public static void main(String[] args) {
	String answer = JOptionPane.showInputDialog("What is your grade?");   
	int grade = Integer.parseInt(answer); 
	
	if(grade >= 70) {
		JOptionPane.showMessageDialog(null, "You passed!");  
		
		
	}
	else { 
		JOptionPane.showMessageDialog(null, "You failed");
	}
	
}
}
