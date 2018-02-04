/**
 * This class stores data about seats.
 */

public class Seat
{
    private boolean taken;
    private Ticket ticket;

    /**
     * This constructor initializes the row of the seats, and number of the seat.
     * @param taken The boolean for whether the seat is taken
     * @param ticket The ticket object
     */

    public Seat(boolean taken, Ticket ticket)
    {
        this.taken = taken;
        this.ticket = ticket;
    }

    public Seat()
    {
        taken = false;
        ticket = new Ticket(0,"","");
    }

    /**
     * This is copy constructor
     * @param seat2 The object to copy
     */
    public Seat(Seat seat2)
    {
        taken = seat2.taken;
        ticket = seat2.ticket;
    }

    public boolean getTaken()
    {
        return taken;
    }

    public Ticket getTicket()
    {
        return ticket;
    }

    /**
     * The set method sets a value for each field.
     * @param taken The boolean of whether the seat is taken
     * @param ticket The ticket object
     */

    public void set(boolean taken, Ticket ticket)
    {
        this.taken = taken;
        this.ticket = ticket;
    }

    /**
     * toString method returns object as a string
     * @return A string containing the seat information.
     */

    public String toString() //needs to be fixed
    {
        String str = "Seat Taken: " + taken + "\n" + ticket.toString();
        return str;
    }

}