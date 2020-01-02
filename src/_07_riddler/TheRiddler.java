package _07_riddler;

import javax.swing.JOptionPane;

public class TheRiddler {

	public static void main(String[] args) {

		int score = 0;

		String answer = JOptionPane.showInputDialog(null,
				"When you add two letters to a five letter word, it becomes shorter. how can this be? (Type in the original five letter word)");

		if (answer.equalsIgnoreCase("Short")) {
			JOptionPane.showMessageDialog(null, "Correct, good job!");
			score++;
		} else {
			JOptionPane.showMessageDialog(null, " WRONG! The five letter word is 'Short'!");
		}
		String yesNoAnswer = JOptionPane.showInputDialog(null, "Do you want to play again?");
		if (yesNoAnswer.equalsIgnoreCase("Yes")) {
			String answerTwo = JOptionPane.showInputDialog(null,
					"What belongs to you but other people use it more often than you?");
			if (answerTwo.equalsIgnoreCase("your name")) {
				score++;
				JOptionPane.showMessageDialog(null, "Correct! Game over (Check your score)!");

			} else {
				JOptionPane.showMessageDialog(null, "WRONG! the answer is your name. Game over (Check your score)!");

			}

		} else {
			JOptionPane.showMessageDialog(null, "See ya later (Check your score)!");
		}
		System.out.println(score);
	}
}