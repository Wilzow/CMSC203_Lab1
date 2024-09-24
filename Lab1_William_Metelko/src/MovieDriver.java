import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MoveAction;

public class MovieDriver {

	public static void main(String[] args) {
		
		boolean cont = true;
		
		while(cont) {
			Scanner scanner = new Scanner(System.in);
			Movie movie = new Movie();
			
			System.out.println("Enter the title of a movie: ");
			movie.setTitle(scanner.nextLine());
			
			System.out.println("Enter the rating of the movie: ");
			movie.setRating(scanner.nextLine());
			
			System.out.println("Enter the tickets sold: ");
			movie.setSoldTickets(scanner.nextInt());
			
			System.out.println(movie);
			
			System.out.println("Do you want to enter another? (y/n)");
			
			if(scanner.next().charAt(0) != 'y') {
				cont = false;
			}
		}
		
		System.out.println("Goodbye");
		
		
	}

}
