import java.util.*;

public class AirplaneDemo
{
	private static Scanner kb;
	private static double ticketPrice;
	private static String passName;
	private static String seatNum;
	private static String available; 
	private static String cont;
	
	public static void main(String[] args)
	{
		do
		{	
			System.out.println("Has this ticket been purchased? (Y/N): ");
			available = kb.nextLine();
		
			if (available.equalsIgnoreCase("Y"))
			{	
				System.out.println("ticket price (include cents): ");
				ticketPrice = kb.nextDouble();
				kb.nextLine();
				System.out.println("Name of passenger: ");
				passName = kb.nextLine();
				System.out.println("Seat number (ex: 1-1): ");
				seatNum = kb.nextLine();
		
				Ticket ticket = new Ticket(ticketPrice, passName, seatNum);
		
		
				Seat seat = new Seat(true, ticket);
			}
		
			else
			{
				System.out.println("ticket price (include cents): ");
				ticketPrice = kb.nextDouble();
				passName = "none";
				System.out.println("Seat number (ex: 1-1): ");
				seatNum = kb.nextLine();
				
				Ticket ticket = new Ticket(ticketPrice, passName, seatNum);
				
				Seat seat = new Seat(false, ticket);
			}
		
		
			Airplane planeTest = new Airplane();
			System.out.println("Would you like to continue with more? (Y/N): ");
			cont = kb.nextLine();
			
			System.out.println(planeTest);
		} while (cont.equalsIgnoreCase("Y"));
		
	}


}
