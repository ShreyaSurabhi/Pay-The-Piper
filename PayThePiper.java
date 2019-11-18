import java.util.Random;
import java.util.Scanner;
public class PayThePiper
{
	public static void main(String args[])
	{
		Scanner menu = new Scanner(System.in);
		System.out.println("\nWelcome to game.. Pay The Piper.  ");
		System.out.println("\n\n        * * * MENU * * * \n\n     1. Let's play!\n     2. Reload\n     3. I will return later.");
		int choice1 = menu.nextInt();
		
		Random prog = new Random();
		int amount = prog.nextInt(60);
		
		switch(choice1)
		{
			case 1:
			{
				
				int sum = 0;
				System.out.println("The amount to be paid is: " + amount);
				Scanner game = new Scanner(System.in);
				
				 do
					{
						System.out.println("\nChoose the coin denominations to pay: \n    1. Rs1/- \n    2. Rs2/- \n    3. Rs5/- \n    4. Rs10/-");
						int coin = game.nextInt();
				
						switch(coin)
						{
							case 1:
							{
								sum = 1 + sum;
								System.out.println("Amount paid is: " + sum);
								break;
							}	
					
							case 2:
							{
								sum = 2 + sum;
								System.out.println("Amount paid is: " + sum);
								break;
							}
					
							case 3:
							{
								sum = 5 + sum;
								System.out.println("Amount paid is: " + sum);
								break;
							}
				
							case 4:
							{
								sum = 10 + sum ;
								System.out.println("Amount paid is: " + sum);
								break;
							}
						}//end of switch case.
					}while(sum != amount && sum < amount);   //end of do loop.
				
				if(sum > amount)
				{
					System.out.println("\n       You need to pay Rs" + amount + ".\n       ...Try again!!");
				    
				}
			
				if(sum == amount)
				{
					System.out.println("You paid the amount!!!");
				}
				break;
            } //end of case-1
			
			case 2:
			{
				int sum = 0;
				System.out.println("The amount that should be paid is: " + amount);
				Scanner game = new Scanner(System.in);
				
				
				do
				{
				System.out.println("Choose the coin denominations: \n 1. Rs1/- \n 2. Rs2/- \n 3. Rs5/- \n 4. Rs10/-");
				int coin = game.nextInt();
				
				switch(coin)
				{
					case 1:
						{
							sum = 1 + sum;
							System.out.println("Sum is: " + sum);
							break;
						}	
					
					case 2:
						{
							sum = 2 + sum;
							System.out.println("Sum is: " + sum);
							break;
						}
					
					case 3:
						{
							sum = 5 + sum;
							System.out.println("Sum is: " + sum);
							break;
						}
				
					case 4:
						{
							sum = 10 + sum ;
							System.out.println("Sum is: " + sum);
							break;
						}
				}
				}while(sum != amount && sum < amount);
				
			
				if(sum == amount)
				{                                     
					System.out.println("You paid the amount!!!");
				}
				break;
			}
			
			
			
	     	case 3:
	     	{
	     		System.out.println("\n      See you later...!!!");
	     		
	     		break;
	     	} //end of case-3.
		 
		} //end of switch case.	
	} //end of main
} //end of program