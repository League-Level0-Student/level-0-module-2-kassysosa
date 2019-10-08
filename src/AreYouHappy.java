import javax.swing.JOptionPane;

public class AreYouHappy {
public static void main(String[] args) {
	String answer = JOptionPane.showInputDialog("Are You Happy?");
	if(answer.equals("Yes")) {
		JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing!");
	}else if(answer.equals("No")) {
		String answertwo = JOptionPane.showInputDialog("Do you want to be happy?");
		if(answertwo.equals("Yes")) {
			JOptionPane.showMessageDialog(null, "Change something.");
		}else if(answertwo.equals("No")) {
			JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing.");
		}
	}
	
}
}
