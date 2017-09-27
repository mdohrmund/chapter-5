package excercises;

import java.util.Scanner;

public class AscendingAndDescending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int one, two, three;
        int small, medium, highest;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please enter an integer >>> ");
        one = input.nextInt();
        
        System.out.println("Please enter an integer >>> ");
        two = input.nextInt();
        
        System.out.println("Please enter an integer >>> ");
        three = input.nextInt();
        
        //Biggest
        if(one >= two & one >= three)
        highest = one;
        
        else
        	if(two >= one & two >= three) 
        {
        		highest = two;	
     	}
        
        else
        	{
        		highest = three;
        	}
        
        //Medium
        if(one >= two & one <= three)
            {
        	    medium = one;
            }
        
        else
        	if(two >= one & two <= three)
        	{
        		medium = two;
        	}
        
        else
        	{
        		medium = three;
        	}
       
        //Smallest
        if(one <= three & one <= two)
        {
        	small = one;
        }
        
        else
        	if(two <= one & two <= three)
        {
        	small = two;
        }
        
        else
        	if(three <= one & three <= two)
        {
        	small = three;
    	}
        
        System.out.print("Biggest number to smallest: " + highest + ", " +
        medium + ", " + small);
        
        
        
        
        
        
        
        
        
        
        
        
        
	}

}
