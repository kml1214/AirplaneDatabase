import java.util.*;
public class Airplane 
{
	private Seat[][] plane = new Seat[8][4]; //assume all seats are taken

	public Airplane() //default constructor
	{
		Ticket def = new Ticket (0, "", ""); //creates default ticket for seats

		for (int r = 0; r < plane.length; r++)
		{
			for (int c = 0; c < plane[0].length; c++)
			{
				plane[r][c].set(false, def);
			}
		}
	}

	/**
     * This is a copy constructor
     * @param plane2 The Airplane object to copy
     */

	public Airplane(Seat[][] plane2) // copies another plane
	{
		for (int r = 0; r < plane.length; r++)
		{
			for (int c = 0; c < plane[0].length; c++)
			{
				plane[r][c].set(plane2[r][c].getTaken(), plane2[r][c].getTicket());
			}
		}
	}

	/**
     * The set method sets a value for each field.
     * @param plane2 is the Airplane object to copy 
     */
	
    public void set(Seat[][] plane2)
    {
        for (int r = 0; r < plane.length; r++)
		{
			for (int c = 0; c < plane[0].length; c++)
			{
				plane[r][c].set(plane2[r][c].getTaken(), plane2[r][c].getTicket());
			}
		}
    }
    

    /**
     * toString method returns object as a string
     * @return A string containing the seat information.
     */

    public String toString() //needs to be fixed
    {
        String str = "";

        for (int r = 0; r < plane.length; r++)
		{
			for (int c = 0; c < plane[0].length; c++)
			{
				str += plane[r][c].toString();

			}
		}
        
        return str;
    }


}