package excercises;

import java.util.Scanner;

public class PizzaHut {

	private static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
	String choiceYes;
	String size;
	
	System.out.print("Would you like a pizza? Yes or no? >>>> ");
	choiceYes = input.nextLine();
	if ("Yes".equalsIgnoreCase(choiceYes)||"Y".equalsIgnoreCase(choiceYes))
	{
		System.out.println("You said" + choiceYes + " to having pizza.");
		 System.out.print("Please choose a size small, medium or large? >>>> ");
		 size = input.nextLine();
		 if("small".equals(size)|| "Small".equals(size))
		 {
			 displayPizzaSize(size);
			 displayPizzaType();
			 displayPrice(size);
			 
		 }
		 
		 if("medium".equals(size)|| "Medium".equals(size))
		 {
			 displayPizzaSize(size);
			 displayPizzaType();
			 displayPrice(size);
			 
		 }
		 if("large".equals(size)|| "Large".equals(size))
		 {
			 displayPizzaSize(size);
			 displayPizzaType();
			 displayPrice(size);
			 
		 }
	
	
	
	}
	else
		displayHotDog();
	
	}
public static void displayPizzaSize(String size)
{
	System.out.println("You said " + size + " pizza size.");
}
public static void displayPizzaType()
{
	System.out.print("What kind of pizza do you want? Pepperoni, Sausage or Cheese?");
	String pizzaKind = input.nextLine();
	System.out.print("You want " + pizzaKind + " $");
}
public static void displayPrice(String size)
{
	double mediumCost = 9.99;
	double largeCost = 12.99;
	double smallCost = 6.99;
	if("small".equalsIgnoreCase(size))
		System.out.print(smallCost);
	if("medium".equalsIgnoreCase(size))
		System.out.print(mediumCost);
	if("large".equalsIgnoreCase(size))
		System.out.print(largeCost);
}

public static void displayHotDog()
{
	System.out.println("Mmmm hot dogs");
}
}




















