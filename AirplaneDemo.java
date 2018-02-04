import java.util.*;
public class AirplaneDemo
{
	
	public static void main(String[] args)
	{
		Ticket ticket = new Ticket(35.99, "Arnold", "1-1");
		Seat seat = new Seat(true, ticket);
		// for testing purposes, setting every seat to these values

		Airplane planeTest = new Airplane();



		System.out.println(planeTest);
	}


}