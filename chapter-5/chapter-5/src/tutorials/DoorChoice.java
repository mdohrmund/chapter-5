package tutorials;
import javax.swing.JOptionPane;
public class DoorChoice 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
	
		String choiceString;
		int doorChoice;
		int response = 1;
		String responseString;
		
		while(response == 1) {
		
		choiceString = JOptionPane.showInputDialog(null, "Pick a door any door, 1, 2, or 3.",
						"Door Choice", JOptionPane.INFORMATION_MESSAGE);
		doorChoice = Integer.parseInt(choiceString);
				
		//if statement structure for door choice
			if (doorChoice == 1)		
			{
				JOptionPane.showMessageDialog(null, "You win nothing!");
			}
					
			if (doorChoice == 2)
					
			{
				JOptionPane.showMessageDialog(null, "You win less than nothing!");
			}
	
			if (doorChoice == 3)
			
			{
			   JOptionPane.showMessageDialog(null, "You win a brand new Huffy Bike!");	
			
			}
			
			else
				JOptionPane.showMessageDialog(null, "That number was not an option. Choose 1-3");

		responseString = JOptionPane.showInputDialog(null, "Would you like to play again? 1 for yes 2 for no");
			response = Integer.parseInt(responseString);
		}
		 JOptionPane.showMessageDialog(null, "You have exited the game");
	}
	   
}