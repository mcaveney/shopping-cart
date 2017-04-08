/**
*
----------------------------------------------------
* File name: Project1
* Project name: Project 1
*
----------------------------------------------------
* Author’s name and email: Meredith Caveney
* Course-Section: CSCI-125-201 Intro to Computer Science
* Creation Date: 3/22/15
* Last modified: Meredith Caveney 3/22/15 mcaveney@embarqmail.com
*
----------------------------------------------------
*/
import java.util.Scanner;//imports scanner
public class Project1//start of class
/**
* Class Name: Project1 <br>
* Class Purpose: to simulate a shopping cart for a store with 3 kinds of climbing rope <br>
*
* <hr>
* Date created: 3/20/15 <br>
*Last modified: Meredith Caveney 3/22/15 mcaveney@embarqmail.com
* @author Meredith Caveney
*/
{
	public static void main(String args[])//start method
/**
* Method Name: main<br>
* Method Purpose: to simulate a shopping cart for a store with 3 kinds of climbing rope <br>
*
* <hr>
* Date created: 3/20/15 <br>
*Last modified: 3/22/15 <br>
*
* <hr>
* Notes on specifications, special algorithms, and assumptions:
* use I/O and use decision structures and repetition structures
*/
	{
		Scanner keyboard = new Scanner(System.in);//introduce new scanner a.k.a keyboard
		//Intro Page:
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");//basically clears page
		System.out.println("\n\n\n\n\n\n\n\n\n\n              CSCI-1250-201 - Intro to Computer Science\n\n\n\n");
		System.out.println("              Project 1\n\n\n\n");
		System.out.println("              by: Meredith Caveney\n\n\n\n");
		System.out.println("Press enter to continue...");
		keyboard.nextLine();//waits for a line entered to continue
		
		int option;//declares the variable for the options in the menu
		//declares all of the values for the ropes with the initial value to 0
		double dynamicRope = 0;
		double staticRope = 0;
		double webbing = 0;
		double salesTax = 0;
		//starts a do while loop to run until the option is not 1,2,3, or 4
		do{
			do{//display the menu until an option of 1,2,3,4 or 5 is given
				//Main Menu text:
				System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
				System.out.println("Main Menu");
				System.out.println("Type in the number of the option you would like.");
				System.out.println("\nOption 1:\nChange the number of feet of Dynamic Rope in your cart.");
				System.out.println("\nOption 2:\nChange the number of feet of Static Rope in your cart.");
				System.out.println("\nOption 3:\nChange the number feet of Webbing in your cart.");
				System.out.println("\nOption 4:\nDisplay the contents of your cart.");
				System.out.println("\nOption 5:\nQuit\n");
		
				option = keyboard.nextInt();//waits for the user to enter a value
		
				if(option != 1 && option != 2 && option != 3 && option != 4 && option != 5)//if you don't enter 1,2,3,4, or 5 ask again
					{
					System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
					System.out.println("Please type an option between 1 and 5.\nPress enter to continue...");						
					keyboard.nextLine();//press a key to continue
					keyboard.nextLine();//had to use this command twice to work
					}
		
			}while(option != 1 && option != 2 && option != 3 && option != 4 && option != 5);//only leave this loop if you enter 1,2,3,4 or 5
		
			switch(option)//what you typed for the option in the menu; can only be 1-5
				{
				case 1://change dynamic rope
					//ask whether you want to change your current amount of dynamic rope
					System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
					System.out.println("You currently have " + dynamicRope + " feet of Dynamic Rope. \nWould you like to change this? Y/N");
					char yesOrNo = keyboard.next().charAt(0);//takes in y,Y,n or N for if they want to change the feet of dynamic rope
					if(yesOrNo == 'y' || yesOrNo =='Y')//if they said they did want to change the # of feet, do what's in brackets
						{
						System.out.println("How many feet of Dynamic Rope would you like?");
						dynamicRope = keyboard.nextDouble();//takes in the number the user enters and stores it into dynamicRope
						while(dynamicRope < 0)//if the number is negative then ask again
							{
							System.out.println("That is not an acceptable value! Try again.");
							dynamicRope = keyboard.nextDouble();//takes a new value for the dynamic rope
							}//only ends loop if the number the user enters is greater than or equal to 0
					
					System.out.println("\nYou now have " + dynamicRope + " feet of Dynamic Rope.\n");//displays the new value of feet
					System.out.println("Press enter to return to the main menu.");
					keyboard.nextLine();//enter to return to menu
					keyboard.nextLine();//had to use this twice
					continue;//leaves switch to eventually return to main menu
						}
					else if(yesOrNo == 'n' || yesOrNo =='N')//if the user says they DON'T want to change # of feet
						{
						System.out.println("Okay. Press enter to return to the main menu.");
						keyboard.nextLine();//hit enter to return to the main menu
						keyboard.nextLine();//had to use twice?
						continue;//ends switch here
						}
					else
						{
						System.out.println("That is not a valid answer. Press enter to return to the main menu.");
						keyboard.nextLine();//go back to menu if they fail to hit y,Y,n or N
						keyboard.nextLine();
						continue;//end switch
						}//end else
		
				case 2://change static rope
		
					System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
					System.out.println("You currently have " + staticRope + " feet of Static Rope. \nWould you like to change this? Y/N");
					yesOrNo = keyboard.next().charAt(0);//gets answer as to whether user wants to change dynamic rope feet
					if(yesOrNo == 'y' || yesOrNo =='Y')//if they do want to change # of feet:
						{
						System.out.println("How many feet of Static Rope would you like?");
						staticRope = keyboard.nextDouble();//waits for user to enter a value
						while(staticRope < 0)//run until the number the user gives, staticRope, is positive or 0
							{
							System.out.println("That is not an acceptable value! Try again.");
							staticRope = keyboard.nextDouble();//asks for new, positive value for staticRope feet
							}//end if staticRope >= 0
						System.out.println("\nYou now have " + staticRope + " feet of Static Rope.\n");
						System.out.println("Press enter to return to the main menu.");
						keyboard.nextLine();//return to menu
						keyboard.nextLine();
						continue;//ends switch
						}
					else if(yesOrNo == 'n' || yesOrNo =='N')//if user does NOT want to change feet of staticRope
						{
						System.out.println("Okay. Press enter to return to the main menu.");
						keyboard.nextLine();//enter to continue
						keyboard.nextLine();
						continue;//ends switch
						}
					else//user did not enter n,N,y or Y
						{
						System.out.println("That is not a valid answer. Press enter to return to the main menu.");
						keyboard.nextLine();//enter to continue
						keyboard.nextLine();
						continue;//ends switch
						}//end else
				case 3://change webbing
		
					System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
					System.out.println("You currently have " + webbing + " feet of Webbing. \nWould you like to change this? Y/N");
					yesOrNo = keyboard.next().charAt(0);//asks for character if user wants to change feet of webbing
					if(yesOrNo == 'y' || yesOrNo =='Y')//if they do, ask how many feet they want
						{
						System.out.println("How many feet of Webbing would you like?");
						webbing = keyboard.nextDouble();//stores a new value for feet as webbing
						while(webbing < 0)//do this if the user enters a negative number
							{
							System.out.println("That is not an acceptable value! Try again.");
							webbing = keyboard.nextDouble();//asks for a new value for webbing
							}//end loop if webbing is positive or 0
						System.out.println("\nYou now have " + webbing + " feet of Webbing.\n");
						System.out.println("Press enter to return to the main menu.");
						keyboard.nextLine();//enter a line to continue
						keyboard.nextLine();
						continue;//ends switch
						}
					else if(yesOrNo == 'n' || yesOrNo =='N')//if user enters that they don't want to change feet of webbing return to menu
						{
						System.out.println("Okay. Press enter to return to the main menu.");
						keyboard.nextLine();//enter to continue
						keyboard.nextLine();
						continue;//ends switch
						}
					else//if the user didn't enter y,Y,n or N go here
						{
						System.out.println("That is not a valid answer. Press enter to return to the main menu.");
						keyboard.nextLine();//user hits enter to advance here
						keyboard.nextLine();
						continue;//ends switch
						}//end else
		
				case 4://view items in cart
			
					System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
					System.out.println("Do you live in a state with sales tax? Y/N");//asks about tax
					yesOrNo = keyboard.next().charAt(0);//takes value of the next character entered and if y or Y ask for a sales tax value
					if(yesOrNo == 'y' || yesOrNo =='Y')
						{
						System.out.println("What is the percent sales tax?\n");
						double percentTax = keyboard.nextDouble();//stores percent value as percentTax
						while(percentTax < 0 || percentTax > 100)//do loop if percentTax is not between 0 and 100
						{
						System.out.println("This is not an acceptable value. Please enter the percent sales tax in your state:");
						percentTax = keyboard.nextDouble();//new value for sales tax %
						}//ends when sales tax is between 0 and 100
						salesTax = percentTax / 100;//because user gives a percent value, divide by 100 for calculations
						}
					else
						{
						salesTax = 0;
						}//end else

					System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nShopping Cart:\n");
					//La Mathematics
					double dynamicTotal = dynamicRope * 3.99;//total $ for dynamic rope stored in dynamicTotal
					double staticTotal = staticRope * 2.99;//total $ for static rope in staticRope
					double webbingTotal = webbing * 0.50;//total $ for webbing in webbing
					double subtotal = dynamicTotal + staticTotal + webbingTotal;//total without tax is subtotal
					double taxTotal = (salesTax * subtotal);//tax value * subtotal = how much tax is added is taxTotal
					double grandTotal = taxTotal + subtotal;//tax plus subtotal stored in grandTotal
		
					//Receipt
					//displays how many feet of each rope and how much it costs
					System.out.println("Dynamic Rope: " + dynamicRope + " feet for $" + dynamicTotal + ".\n");
					System.out.println("Static Rope: " + staticRope + " feet for $" + staticTotal + ".\n");
					System.out.println("Webbing: " + webbing + " feet for $" + webbingTotal + ".\n");
					System.out.println("Subtotal: $" + subtotal + "\n");
					System.out.println("Sales Tax: $" + taxTotal + "\n");
					System.out.println("Total: $" + grandTotal + "\n");
					System.out.println("Press enter to return to the menu.");
					keyboard.nextLine();//enter to continue
					keyboard.nextLine();
					continue;//ends switch
		
				case 5://quit
					break;//ends switch
			
				default://if user enters number not 1-5 which is kinda impossible b/c already accounted for
					System.out.println("Something went wrong. Please notify me.");
					break;//ends switch
					
			}//end of switch (finally)
		}while(option == 1 || option == 2 || option == 3 || option == 4);//keep displaying menu while options of 1-4 are selected
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n goodbye!\n\n");//can only happen if option = 5
	}//end of method
}//end of class
