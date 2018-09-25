import javax.swing.JOptionPane;

public class RollerCoaster {
public static void main(String[] args) {
	 String answer = JOptionPane.showInputDialog("How tall are you in inches?");  
	 int height = Integer.parseInt(answer);
			 if(height >= 48) {
				 JOptionPane.showMessageDialog(null, "Enjoy Your Ride!");
				 
			 }	 		
			 else {JOptionPane.showMessageDialog(null, "Sorry, try growing a bit");
				 
			 }
			 }
}

