package excercises;

import javax.swing.JOptionPane;

public class EvenOdd {

	public static void main(String[] args) {
		
		String num;
		int math;
		int answer;

		num = JOptionPane.showInputDialog(null, "Enter a number. ", "Number", JOptionPane.INFORMATION_MESSAGE);
		math = Integer.parseInt(num);
		answer = (math % 2);
			if(answer == 0)
				JOptionPane.showMessageDialog(null, "It is even");
			else
				JOptionPane.showMessageDialog(null, "It is odd");
			
	
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
