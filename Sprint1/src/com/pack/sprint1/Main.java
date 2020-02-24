package com.pack.sprint1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	
	 //static List<Movie> listOfMovies = new ArrayList<Movie>() ; 
	 //static List<Screen> listOfScreens= new ArrayList<Screen>(); 
	 //static List<Theatre> listOfTheatres= new ArrayList<Theatre>(); 
	 //static List<Show> listOfShows = new ArrayList<Show>();
	 
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		
		//  listOfMovies = DataHandler.getMovies(); 
		//  listOfScreens =DataHandler.getListOfScreens(); 
		//  listOfTheatres =DataHandler.getListOfTheatres(listOfMovies, listOfScreens); 
		//  listOfShows =DataHandler.getlistOfShows();
		 
		
		System.out.println("\t\t\t\tONLINE MOVIE TICKET SYSTEM\n\n");
		int s1=1;
		do 
		{
			
			System.out.println("Press:\n\t1.Add Theater\n\t2.Add Movie\n\t3.Add Screen"
					+ "\n\t4.Add Show\n\t5.Delete Theatre\n\t6.Delete Movie\n\t.7Delete Screen\n\t8.Delete Show");
			int ch=s.nextInt();
			switch(ch) {
			case 1  :{
				List<Theatre> lOTheatre;
				System.out.println("Enter the Asked Deatils: ");
				lOTheatre =Admin.addTheatre();
				System.out.println("Contents of Theater List: ");
				for(Theatre t: lOTheatre) {
					System.out.println("Theater ID         :   " + t.getTheaterId());
					System.out.println("Theater Name       :   " + t.getTheaterName());
					System.out.println("Theater City       :   " + t.getTheaterCity());
					System.out.println("Movies Deatils     :   " + t.getMovies());
					System.out.println("Screen Details     :   " + t.getListOfScreens());
					System.out.println("Manager Name       :   " + t.getManagerName());
					System.out.println("Manager Contact    :   " + t.getManagerContact());	
				}	
			}
			case 2  :{
				List<Movie> movies;
				System.out.println("Enter The Asked Details: ");
				movies=Admin.addMovie();
				System.out.println("Contents of Movies List: ");
				for (Movie m : movies) {
					System.out.println("Movie ID         :   " + m.getMovieId());
					System.out.println("Movie Name       :   " + m.getMovieName());
					System.out.println("Movie Duration   :   " + m.getMovieLength());
					System.out.print("Languages        :   ");
					for (String l : m.getLanguages())
						System.out.print(l + "  ");
					System.out.println();
					System.out.println("Release Date     :   " + m.getMovieReleaseDate());
		         }
			}
			case 3  :{
				List<Screen> lOScreen;
				System.out.println("Enter The Asked Details: ");
				lOScreen=Admin.addScreen();
				System.out.println("Contents of Screen List: ");
				for(Screen sl : lOScreen) {
					System.out.println("Screen  ID         :   " + sl.getScreenId());
					System.out.println("Theater ID         :   " + sl.getTheatreId());
					System.out.println("Screen Name        :   " + sl.getScreenName());
					System.out.println("Movie End Date     :   " + sl.getMovieEndDate());
					System.out.println("Show List          :   " + sl.getShow());
					System.out.println("Row Number         :   " + sl.getRows());
					System.out.println("Column Number      :   " + sl.getColumns());
				}
			}
			case 4  :{
				List<Show> show;
				System.out.println("Enter The Asked Details: ");
				show=Admin.addShow();
				System.out.println("Contents of Show List: ");
				for(Show sw : show) {
					System.out.println("Show ID            :   " + sw.getShowId());
					System.out.println("Show Start Time    :   " + sw.getShowStartTime());
					System.out.println("Show End Time      :   " + sw.getShowEndTime());
					System.out.println("Seats List         :   " + sw.getSeats());
					System.out.println("Show name          :   " + sw.getShowName());
					System.out.println("Movie Name         :   " + sw.getMovieName());
				}
				
			}
			case 5  : { 
				System.out.println("Enter the Theatre id you want to delete: ");
				 int id=s.nextInt();
				boolean x =Admin.deleteTheatre(id);
				System.out.println("If deleted result will be true and if not then false would be returned: Result is " + x);
			}
			case 6  :{
				System.out.println("Enter the MovieId you want to delete: ");
				int movieId=s.nextInt();
				boolean y=Admin.deleteMovie(movieId);
				System.out.println("If deleted result will be true and if not then false would be returned: Result is " + y);
			}
			case 7  :{
				System.out.println("Enter the ScreenId you want to delete: ");
				int screenId=s.nextInt();
				boolean y=Admin.deleteScreen(screenId);
				System.out.println("If deleted result will be true and if not then false would be returned: Result is " + y);
				
			}
			case 8 :{
				System.out.println("Enter the ShowId you want to delete: ");
				int showId=s.nextInt();
				boolean y=Admin.deleteShow(showId);
				System.out.println("If deleted result will be true and if not then false would be returned: Result is " + y);
			}
			
		}
		
		}while(s1==1);
	}
}
