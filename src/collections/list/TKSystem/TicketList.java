package collections.list.TKSystem;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TicketList 
{

	public static void main(String[] args) 
	{
		
	Ticket ticket1 = new Ticket(1001, "John", 500.60f , "Book ticket on weekdays","Missouri", "Virginia" );
	Ticket ticket2 = new Ticket(1002, "Jack",  700f , "Book ticket on weekend","Michigan", "Virginia" );
	Ticket ticket3 = new Ticket(1003,"Amy",  1500.50f , "Book ticket on offer price","Phoenix", "New york" );
	Ticket ticket4 = new Ticket(1004, "Smith",500f , "Book ticket on holidays","Missouri", "Florida" );
	Ticket ticket5 = new Ticket(1005, "Mike",700f , "Book ticket on holidays","Missouri", "London" );
	
		
		// create list of employee
		List<Ticket> listOfTickets = new ArrayList<Ticket>();
		
		// insert
		listOfTickets.add(ticket3);
		listOfTickets.add(ticket3);
		listOfTickets.add(ticket1);
		
		
		// insert data at index
		listOfTickets.add(0, ticket4);
		
		// replace 
		listOfTickets.set(1, ticket5);
		System.out.println(listOfTickets);
		
		System.out.println("---");
		//iterate over list
		
		Iterator<Ticket> itr = listOfTickets.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
				
		listOfTickets.get(0).name ="Noman";
		
		System.out.println("---");
		for(Ticket emp : listOfTickets) {
			System.out.println(emp.name);
		}

	}

}