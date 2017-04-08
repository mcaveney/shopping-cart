import java.util.Scanner;
public class shoppingCart
{
	public static void main(String args[])
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
		System.out.println("\n\n\n\n\n\n\n\n\n\n              CSCI-1250-201 - Intro to Computer Science\n\n\n\n");
		System.out.println("              Project 1\n\n\n\n");
		System.out.println("              by: Meredith Caveney\n\n\n\n");
		System.out.println("Press enter to continue...");
		keyboard.nextLine();
		
		int option;
		double dynamicRope = 0;
		double staticRope = 0;
		double webbing = 0;
		double salesTax = 0;
		do{
			do{
				System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
		
				System.out.println("Main Menu");
				System.out.println("Type in the number of the option you would like.");
				System.out.println("\nOption 1:\nChange the number of feet of Dynamic Rope in your cart.");
				System.out.println("\nOption 2:\nChange the number of feet of Static Rope in your cart.");
				System.out.println("\nOption 3:\nChange the number feet of Webbing in your cart.");
				System.out.println("\nOption 4:\nDisplay the contents of your cart.");
				System.out.println("\nOption 5:\nQuit\n");
		
				option = keyboard.nextInt();
		
				if(option != 1 && option != 2 && option != 3 && option != 4 && option != 5)
					{
					System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
					System.out.println("Please type an option between 1 and 4.\nPress enter to continue...");						keyboard.nextLine();
					keyboard.nextLine();
					}
		
			}while(option != 1 && option != 2 && option != 3 && option != 4 && option != 5);
		
			switch(option)
				{
				case 1://change dynamic rope
		
					System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
					System.out.println("You currently have " + dynamicRope + " feet of Dynamic Rope. \nWould you like to change this? Y/N");
					char yesOrNo = keyboard.next().charAt(0);
					if(yesOrNo == 'y' || yesOrNo =='Y')
						{
						System.out.println("How many feet of Dynamic Rope would you like?");
						dynamicRope = keyboard.nextDouble();
						if(dynamicRope < 0)
							{
							System.out.println("That is not an acceptable value! Try again.");
							dynamicRope = keyboard.nextDouble();
							}
					
					System.out.println("\nYou now have " + dynamicRope + " feet of Dynamic Rope.\n");
					System.out.println("Press enter to return to the main menu.");
					keyboard.nextLine();
					keyboard.nextLine();
					continue;
						}
					else if(yesOrNo == 'n' || yesOrNo =='N')
						{
						System.out.println("Okay. Press enter to return to the main menu.");
						keyboard.nextLine();
						keyboard.nextLine();
						continue;
						}
					else
						{
						System.out.println("That is not a valid answer. Press enter to return to the main menu.");
						keyboard.nextLine();
						keyboard.nextLine();
						continue;
						}
		
				case 2://change static rope
		
					System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
					System.out.println("You currently have " + staticRope + " feet of Static Rope. \nWould you like to change this? Y/N");
					yesOrNo = keyboard.next().charAt(0);
					if(yesOrNo == 'y' || yesOrNo =='Y')
						{
						System.out.println("How many feet of Static Rope would you like?");
						staticRope = keyboard.nextDouble();
						if(staticRope < 0)
							{
							System.out.println("That is not an acceptable value! Try again.");
							staticRope = keyboard.nextDouble();	
							}
						System.out.println("\nYou now have " + staticRope + " feet of Static Rope.\n");
						System.out.println("Press enter to return to the main menu.");
						keyboard.nextLine();
						keyboard.nextLine();
						continue;
						}
					else if(yesOrNo == 'n' || yesOrNo =='N')
						{
						System.out.println("Okay. Press enter to return to the main menu.");
						keyboard.nextLine();
						keyboard.nextLine();
						continue;
						}
					else
						{
						System.out.println("That is not a valid answer. Press enter to return to the main menu.");
						keyboard.nextLine();
						keyboard.nextLine();
						continue;
						}
				case 3://change webbing
		
					System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
					System.out.println("You currently have " + webbing + " feet of Webbing. \nWould you like to change this? Y/N");
					yesOrNo = keyboard.next().charAt(0);
					if(yesOrNo == 'y' || yesOrNo =='Y')
						{
						System.out.println("How many feet of Webbing would you like?");
						webbing = keyboard.nextDouble();
						if(webbing < 0)
							{
							System.out.println("That is not an acceptable value! Try again.");
							webbing = keyboard.nextDouble();
		
							}
						System.out.println("\nYou now have " + webbing + " feet of Webbing.\n");
						System.out.println("Press enter to return to the main menu.");
						keyboard.nextLine();
						keyboard.nextLine();
						continue;
						}
					else if(yesOrNo == 'n' || yesOrNo =='N')
						{
						System.out.println("Okay. Press enter to return to the main menu.");
						keyboard.nextLine();
						keyboard.nextLine();
						continue;
						}
					else
						{
						System.out.println("That is not a valid answer. Press enter to return to the main menu.");
						keyboard.nextLine();
						keyboard.nextLine();
						continue;
						}
		
				case 4://view items in cart
			
					System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
					System.out.println("Do you live in a state with sales tax? Y/N");
					yesOrNo = keyboard.next().charAt(0);
					if(yesOrNo == 'y' || yesOrNo =='Y')
						{
						System.out.print("What is the percent sales tax?\n");
						double percentTax = keyboard.nextDouble();
						salesTax = percentTax / 100;
						}

					System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nShopping Cart:\n");
					//La Mathematics
					double dynamicTotal = dynamicRope * 3.99;
					double staticTotal = staticRope * 2.99;
					double webbingTotal = webbing * 0.50;
					double subtotal = dynamicTotal + staticTotal + webbingTotal;
					double taxTotal = (salesTax * subtotal);
					double grandTotal = taxTotal + subtotal;
		
					//La Receipt
					System.out.println("Dynamic Rope: " + dynamicRope + " feet for $" + dynamicTotal + ".\n");
					System.out.println("Static Rope: " + staticRope + " feet for $" + staticTotal + ".\n");
					System.out.println("Webbing: " + webbing + " feet for $" + webbingTotal + ".\n");
					System.out.println("Subtotal: $" + subtotal + "\n");
					System.out.println("Sales Tax: $" + taxTotal + "\n");
					System.out.println("Total: $" + grandTotal + "\n");
					System.out.println("Press enter to return to the menu.");
					keyboard.nextLine();
					keyboard.nextLine();
		
				case 5:
					break;
			
				default:
					System.out.println("Something went wrong. Please notify me.");
					break;
					
			}//end of switch (finally)
		}while(option == 1 || option == 2 || option == 3 || option == 4);//end of do while menu loop
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n goodbye!\n\n");
	}//end of method
}//end of class
