package gameZone;
import java.util.Random;

import javax.swing.JOptionPane;
public class RockPaperScissors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String user;
		int choice;
		
		Random rand = new Random();
		int rando = rand.nextInt(3) + 1;
		user = JOptionPane.showInputDialog(null, "Pick"
				+ "one\n1 - Rock\n2 - Paper\n3 - Scissors");
		choice = Integer.parseInt(user);
		if(choice == 1) {
			    if (rando == 1) {
		
			     	JOptionPane.showMessageDialog(null, "You picked rock. It's a tie.");
			    }
		        if(rando == 2) {
		
			        JOptionPane.showMessageDialog(null, "You picked rock. You lose.");
		        }
		        if(rando == 3) {
	    
		    	   JOptionPane.showMessageDialog(null, "You picked rock. You win.");
		        }
	}
		if(choice == 2) {
				if (rando == 1) {
			
					JOptionPane.showMessageDialog(null, "You picked paper. You win.");
				}
			    if(rando == 2) {
			
				    JOptionPane.showMessageDialog(null, "You picked paper. It's a tie.");
			    }
			    if(rando == 3) {
		    
			    	JOptionPane.showMessageDialog(null, "You picked paper. You lose.");
			    }
		}

		if(choice == 3) {
				if (rando == 1) {
				
					JOptionPane.showMessageDialog(null, "You picked scissors. You lose.");
				}
			    if(rando == 2) {
				    JOptionPane.showMessageDialog(null, "You picked scissors. You win.");
			    }
			    if(rando == 3) {
				  	JOptionPane.showMessageDialog(null, "You picked scissors. It's a tie.");
			    }
			}
				}

			}