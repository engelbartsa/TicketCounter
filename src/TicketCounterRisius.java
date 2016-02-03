import java.util.Scanner;

/*
Write an application called TicketCounterYourLastName to pre-sell a limited number of private concert tickets.
 Each buyer can buy as many as 6 tickets. No more than 75 tickets can be sold. 
 Implement a program that prompts the user for the desired number of tickets and then displays the number of 
 remaining tickets.  Use a while loop in your implementation. Repeat until all tickets have been sold, 
 and then display the total number of buyers.

Hint: You will need to use a complex if statement.  You have several criteria that must be met in order for 
the tickets to be reduced - the requested number of tickets has to be between 1 and 6 and there have to be 
tickets remaining for the number they selected (i.e. if there are only 3 tickets left and they requested 4,
 then the buyers shouldn't be increased and the number of tickets shouldn't decreased).  If these criteria 
 are met, then the buyers increase and the remaining tickets decrease.  Otherwise, we just prompt for another 
 ticket amount until the remaining tickets is equal to zero. 
*/
public class TicketCounterRisius {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		// Ashley Risius

		int presaleTicketMax = 75;
		int ticketsSold = 0;
		int buyerTickets = 0;
		int buyerCounter = 0;

		while (ticketsSold < presaleTicketMax) {
			System.out.println("Enter number of tickets to purchase.");

			if (!in.hasNextInt()) {
				System.out.println("Error in entry.");
				String trash = in.next();
			} else {
				buyerTickets = in.nextInt();
				{
					if (buyerTickets == 0) {
						System.out.println("Must enter a ticket count greater than 1.");
						buyerTickets = 0;
					}
					else if (buyerTickets > 6) {
						System.out.println("Must enter a ticket count less than 6.");
						buyerTickets = 0;
					} else {
						int ticketsAvailable = presaleTicketMax - ticketsSold;
						if (buyerTickets > ticketsAvailable) {
							System.out.println("There are " + ticketsSold + ". Only 75 tickets total are available.");
						} else {
							ticketsSold += buyerTickets;
							buyerCounter++;
							System.out.println("Number of tickets sold: " + ticketsSold);
						}
					}
				}
			}
			System.out.println("The total number of buyers: " + buyerCounter);
		}
	}
}
