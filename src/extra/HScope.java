package extra;

import javax.swing.JOptionPane;

public class HScope {
public static void main(String[] args) {
	String answer = JOptionPane.showInputDialog("What is your star sign?");
	if (answer.equals("Aries")){
		JOptionPane.showMessageDialog(null,"Your energy and spunk should finally return after a couple days. Whatever you do, do it with passion. Let your courageous nature shine through.");
	} else if (answer.equals("Taurus")) {
		JOptionPane.showMessageDialog(null, " Have fun and don't worry too much about the consequences. Focus on enjoying yourself.");
	}
	else if(answer.equals("Gemini")) {
		JOptionPane.showMessageDialog(null, "You have the power to instigate major changes in your life. If you're wise, you will consider multiple ways to make them. Jump-start the battery that rules this aspect of your being.");
	}
	else if(answer.equals("Cancer" )) {
		JOptionPane.showMessageDialog(null, " If you aren't careful about the energy you dish out today, Cancer, you will find that it all comes back to smack you in the face. Other people are likely to be as stubborn as you. Try not to take anything too seriously.");
	}
	else if(answer.equals("Leo")) {
		JOptionPane.showMessageDialog(null, "There's an extra bit of fire in your words and emotions today. Your sensitivity is heightened. Seek the truth in all the issues you encounter.");
	}
	else if(answer.equals("Virgo")) {
		JOptionPane.showMessageDialog(null, " There may be serious challenges in your daily routine today. Take time to set a plan into motion. You may want to drift into another realm, so let those emotions roam free, just make sure you deal with your daily tasks first. ");
	}
	else if(answer.equals("Libra")) {
		JOptionPane.showMessageDialog(null, "You may feel idealistic today. This is fine, but make sure these ideals are rooted in reality. Feel free to escape to another mindset, but make sure you can still discern what's real and what isn't.");
	}
	else if(answer.equals("Scorpio")) {
		JOptionPane.showMessageDialog(null, "Your dreams and fantasies are more real than you know. Smile at the people you pass and watch them smile back. Your sensitive and fun-loving nature is infectious. Laughter is the remedy that cures all.");
	}
	else if(answer.equals("Sagittarius")) {
		JOptionPane.showMessageDialog(null, " Your sensitivity is especially heightened today. You're in tune with your emotions and your dreams. You have greater self-awareness, as well as the energy to get things done. Fantasy worlds may come to life if you let them.");
	}
	else if(answer.equals("Capricorn")) {
		JOptionPane.showMessageDialog(null, " You may be going through a confusing period now, Capricorn. Today's energy brings these issues into focus. A drastic life change is coming. This is your life and only you know what's best for you.");
	}
	else if(answer.equals("Aquarius")) {
		JOptionPane.showMessageDialog(null, "Spiritual concerns and fanciful daydreams move into sharp focus today. Perhaps you're pulled by playful emotions. Send your mind into the clouds, but definitely take time to report to your conscious self.");
	}
	else if(answer.equals("Pisces")) {
		JOptionPane.showMessageDialog(null, " Your sensitivity and psychic awareness are especially strong. Stick with what is real and say it like it is. Tension in your daily life may surface, but if you have things under control, you will ride through it just fine.");
	}
}
}
