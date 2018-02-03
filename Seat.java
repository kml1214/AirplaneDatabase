/**
 * This class stores data about seats.
 */

public class Seat
{
    private char seatRow;
    private int seatNumber;

    /**
     * This constructor initializes the row of the seats, and number of the seat.
     * @param seatRow1 The row of the seat
     * @param seatNumber1 The number of the seat
     */

    public Seats(char seatRow1, int seatNumber1)
    {
        seatRow = seatRow1;
        seatNumber = seatNumber1;
    }

    /**
     * This is copy constructor
     * @param object2 The object to copy
     */
    public Seats(Seat object2)
    {
        seatRow = object2.seatRow;
        seatNumber = object2.seatNumber;
    }

    /**
     * The set method sets a value for each field.
     * @param seatRow The row of the seat.
     * @param seatNumber The number of the seat.
     */

    public void set(char seatRow, int seatNumber)
    {
        this.seatRow = seatRow;
        this.seatNumber = seatNumber;
    }

    public char getSeatRow()
    {
        return this.seatRow;
    }

    public int getSeatNumber()
    {
        return this.seatNumber;
    }
    
    /**
     * toString method returns object as a string
     * @return A string containing the seat information.
     */

    public String toString()
    {
        String seat = "Seat Number: " + this.seatRow + this.seatNumber;
        return seat;
    }

}
