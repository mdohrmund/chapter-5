package gameZone;
import java.util.Random;

import javax.swing.JOptionPane;
public class RandomGuess2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String user;
		Random rand = new Random();
		int rando = rand.nextInt(5) + 1;
		int num;
		
		user = JOptionPane.showInputDialog(null, "Pick a number 1-5");
		num = Integer.parseInt(user);
		
		if(num == 1) {
		     if (rando == 1) {
			JOptionPane.showInputDialog(null, "It was 1. You win");
		     }
			 if (rando == 2) {
			JOptionPane.showInputDialog(null, "It was 2. Too high");
			 }
			 if (rando == 3) {
			JOptionPane.showInputDialog(null, "It was 3. Too high");
			 }
			 if (rando == 4) {
			JOptionPane.showInputDialog(null, "It was 4. Too high");
			 }
			 if (rando == 5) {
			JOptionPane.showInputDialog(null, "It was 5. Too high");
			 }
		}
		
		if(num == 2) {
			 if (rando == 1) {
			JOptionPane.showInputDialog(null, "It was 1. Too high");
			 }
			 if (rando == 2) {
			JOptionPane.showInputDialog(null, "It was 2. You win");
			 }
			 if (rando == 3) {
			JOptionPane.showInputDialog(null, "It was 3. Too low");
			 }
			 if (rando == 4) {
			JOptionPane.showInputDialog(null, "It wasd 4. Too low");
			 }
			 if (rando == 5) {
			JOptionPane.showInputDialog(null, "It was 5. Too low");
			 }
		}
		if(num == 3) {
		     if (rando == 1) {
			JOptionPane.showInputDialog(null, "It was 1. Too high");
		     }
			 if (rando == 2) {
			JOptionPane.showInputDialog(null, "It was 2. Too high");
			 }
			 if (rando == 3) {
			JOptionPane.showInputDialog(null, "It was 3. You win");
			 }
			 if (rando == 4) {
			JOptionPane.showInputDialog(null, "It was 4. Too low");
			 }
			 if (rando == 5) {
			JOptionPane.showInputDialog(null, "It was 5. Too low");
			 }
		 }
		if(num == 4) {
		     if (rando == 1) {
			JOptionPane.showInputDialog(null, "It was 1. Too high");
		     }
			 if (rando == 2) {
			JOptionPane.showInputDialog(null, "It was 2. Too high");
			 }
			 if (rando == 3) {
			JOptionPane.showInputDialog(null, "It was 3. Too high");
			 }
			 if (rando == 4) {
			JOptionPane.showInputDialog(null, "It was 4. You win");
			 }
			 if (rando == 5) {
			JOptionPane.showInputDialog(null, "It was 5. Too low");
			 }
		}
	   if(num == 5) {
		     if (rando == 1) {
			JOptionPane.showInputDialog(null, "It was 1. Too high");
		     }
			 if (rando == 2) {
			JOptionPane.showInputDialog(null, "It was 2. Too high");
			 }
			 if (rando == 3) {
			JOptionPane.showInputDialog(null, "It was 3. Too high");
			 }
			 if (rando == 4) {
			JOptionPane.showInputDialog(null, "It was 4. Too high");
			 }
			 if (rando == 5) {
			JOptionPane.showInputDialog(null, "It was 5. You win");	 
			 }
	}
	}
}
