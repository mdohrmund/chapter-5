package excercises;

import java.util.Scanner;

public class CondoSales2 {

static  Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int viewChosen;
		
		System.out.println("Choose 1 for park view, 2 for golf course view,"
				+ "or 3 for lake view");
	
		viewChosen = input.nextInt();
		
		
		if(viewChosen == 1)
		{
		    System.out.println("Park view condos cost $150,000.");
		garageOrParkingSpace();
		
		}
		
		else
		if(viewChosen == 2)
		{
			System.out.println("Golf course view condos cost $170,000.");
		garageOrParkingSpace();
		}
		
		else
		if(viewChosen == 3)
		{
			System.out.println("Lake view condos cost $210,000.");
		garageOrParkingSpace();
		}
		
		else
		{
			System.out.println("The price is $0.");
			}
	}
		
		public static void garageOrParkingSpace() {
		
	
		int GOPSchoice;
		
		System.out.println("Choose 1 for garage or 2 for parking space");
		
		GOPSchoice = input.nextInt();
		
		if(GOPSchoice == 1)
		{
			System.out.println("It will cost an additional $5,000");
		}
		
		if(GOPSchoice == 2)
		{
		
			System.out.println("You have claimed a parking space. Please choose the number for your parking spot"
					+ "between 1-30");
		}
		int parkingSpace = 0;
		if( parkingSpace > 30 || parkingSpace < 1)
		{
			System.out.println("That is not a valid number. Your cost has been reset to the original price");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	}

}
