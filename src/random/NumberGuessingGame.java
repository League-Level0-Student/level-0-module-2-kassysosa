package random;

import java.util.Random;

import javax.swing.JOptionPane;

public class NumberGuessingGame {
public static void main(String[] args) {
	
	String answer = JOptionPane.showInputDialog("Guess a number between 0, 1, and 2");
	int r = 0; 
    Random factory = new Random(); 
    r = factory.nextInt(2);
    System.out.println(r);
   
    int num = Integer.parseInt(answer);
    if(num == r) {
    	JOptionPane.showMessageDialog(null, "Correct!");
    }
   
    
    else {	JOptionPane.showMessageDialog(null, "Better luck next time!");
    	
    }
    }}



