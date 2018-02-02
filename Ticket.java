
public class Ticket 
{
	private double price;		// price of the ticket
	private String passName;		// name of the passenger
	private String seatNum;		// seat number of the ticket
	
	/** 
	 * This constructor initializes the price, passName, and 
	 * seatNum fields
	 * @param price1 The price of the ticket.
	 * @param passName1 The name of the passenger.
	 * @param seatNum1 The number of the seat.
	 */
	
	public Ticket(double price1, String passName1, String seatNum1)
	{
		price = price1;
		passName = passName1;
		seatNum = seatNum1; 
	}
	
	/**
	 * The set method sets a value for each of the fields.
	 * @param price2 The price of the ticket.
	 * @param passName2 The name of the passenger.
	 * @param seatNum2 The number of the seat.
	 */
	
	public void set(double price2, String passName2, String seatNum2)
	{
		price = price2;
		passName = passName2;
		seatNum = seatNum2; 
	}
	
	/**
	 * toString method which provides this object as a string.
	 * @return String containing the ticket information.
	 */
	
	public String toString()
	{
		String str = "Passenger: " + passName +
					 "\nSeat No.: " + seatNum +
					 "\nPrice: " + price;
		return str;
	}
}
