package methods;

import javax.swing.JOptionPane;

public class VotingBooth {
public static void main(String[] args) {
	String answer =  JOptionPane.showInputDialog("How old are you?");
	int num = Integer.parseInt(answer);
	 if(num >= 18){
		 JOptionPane.showInputDialog("Who should our next president be?");
		 
		 
	 }
	 
	 
	 else { JOptionPane.showMessageDialog(null, "No one cares what you think");
	
	
}
}
}
