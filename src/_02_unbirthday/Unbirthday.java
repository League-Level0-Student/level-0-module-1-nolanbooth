package _02_unbirthday;

import javax.swing.JOptionPane;

public class Unbirthday {
	public static void main(String[] args) {
		String birthdayMonth = JOptionPane.showInputDialog(null, "When is your birthday month?");
		String birthdayDay = JOptionPane.showInputDialog(null, "When is your birthday day?");
		if (birthdayMonth.equalsIgnoreCase("august")) {

			if (birthdayDay.equalsIgnoreCase("21")) {
				JOptionPane.showMessageDialog(null, "Happy Birthday!!!");

			}
		} else {

			JOptionPane.showMessageDialog(null, "Happy UNbirthday!!!");

		}

	}
}
