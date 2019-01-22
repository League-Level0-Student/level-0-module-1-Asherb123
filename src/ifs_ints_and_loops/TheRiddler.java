package ifs_ints_and_loops;

import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0



public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
		int Score=0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
		String A=JOptionPane.showInputDialog("What goes up when the rain comes down?");
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
		if (A.equals("an umbrella")) {
			
		
		JOptionPane.showMessageDialog(null, "Correct!!!!!!");	
		Score=+1;
		
		}
		
		
		// 5. Otherwise, say "wrong" and tell them the answer
		if (!A.equals("an umbrella")) {
			JOptionPane.showMessageDialog(null, "Incorrect!!!     The answer is... an umbrella!!!");
		}
		// 6. Add some more riddles
		String S=JOptionPane.showInputDialog("How can a leopard change his spots?");
		
		if (S.equals("By walking one spot to another!!!")) {
			JOptionPane.showMessageDialog(null, "Correct!!!!");
		Score=+2;
		
		}
		
		
		
		
		// 2. Make a pop up to show the score.
		JOptionPane.showMessageDialog(null, "Here is your score!     "+Score);
	}
}

