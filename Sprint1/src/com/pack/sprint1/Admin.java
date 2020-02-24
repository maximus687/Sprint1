package com.pack.sprint1;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.lang.*;


public class Admin {
	
    public Admin(String adminId, String adminName, String adminPassword, LocalDate dateOfBirth, String adminContact) {
		super();
		this.adminId = adminId;
		this.adminName = adminName;
		this.adminPassword = adminPassword;
		this.dateOfBirth = dateOfBirth;
		this.adminContact = adminContact;
	}
	private String adminId;
	private String adminName;
	private String adminPassword;
	private LocalDate dateOfBirth;
	private String adminContact;
	
	//Getters and Setters
	public String getAdminId() {
		return adminId;
	}
	public void setAdminId(String adminId) {
		this.adminId = adminId;
	}
	public String getAdminName() {
		return adminName;
	}
	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}
	public String getAdminPassword() {
		return adminPassword;
	}
	public void setAdminPassword(String adminPassword) {
		this.adminPassword = adminPassword;
	}
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getAdminContact() {
		return adminContact;
	}
	public void setAdminContact(String adminContact) {
		this.adminContact = adminContact;
	}
	
    
	//Class method
	    public static List<Theatre> addTheatre() {
	    	
		Scanner s =new Scanner(System.in);
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter theater id:");
		int thid= s.nextInt();
		System.out.println("Enter Theater name: ");
		String thName=sc.next();
		System.out.println("Enter the city: ");
		String thCity=sc.next();
		
		//Movie class variables
		//put all the variable in list Movie
		System.out.println("Enter the movie Id: ");
		int movieId=s.nextInt();
		LocalDate movieReleaseDate;
		//Taking input from user of movie details
		System.out.println("Enter the Movie Name: ");
		String mName= sc.next();
		System.out.println("Enter the Director Name:");
		String mDirector=sc.next();
		System.out.println("Enter length of movie in minutes:");
		int mLength =s.nextInt();
		System.out.println("Enter the Three languages of movie: ");
		String[] lang=new String[3];
		for(int i=0;i<3;i++) {
			lang[i]=sc.next();
		}
		System.out.println("Enter the Release Date in format: yyyy-mm-dd ");
		movieReleaseDate= LocalDate.parse(sc.next());
		//Adding Elements to the Movie list
		List<Movie> ml =new ArrayList<Movie>();
		ml.add(new Movie(movieId,mName,mDirector,mLength,lang,movieReleaseDate));//all the data been added to movie list
		//hence movie list created
		
		//Screen class variables
		//Put all the variable in list Screen
		System.out.println("Enter the screen id(integer): ");
		int screenId= s.nextInt();
		// System.out.println("Enter the TheaterId: ");
		int theatreId=thid;
		System.out.println("Enter the screen name: ");
		String screenName=sc.next();
		System.out.println("Enter the Movie End Date in format: yyyy-mm-dd ");
		LocalDate movieEndDate= LocalDate.parse(sc.next());	
		
//Show class variable		
		List<Show> show=new ArrayList<Show>();
		System.out.println("Enter Show id: ");
	    int showId=s.nextInt();
	    System.out.println("Enter the Show Start time in format: hr:mm:ss");
		LocalTime showStartTime=LocalTime.parse(sc.next());
		System.out.println("Enter the Show End time in format: hr:mm:ss");
		LocalTime showEndTime=LocalTime.parse(sc.next());
		
		//seat class variables
		
		List<Integer> seat=new ArrayList<Integer>() ;
        System.out.println("Enter the seat number: ");
        seat.add(s.nextInt());
		System.out.println("Enter the Show name: ");
		String showName=sc.next();
		System.out.println("Enter the movie Name: ");
		String movieName=sc.next();
		//rows and columns variable are of screen class
		System.out.println("Enter the row number: ");
		int rows=s.nextInt();
		System.out.println("Enter the column number:");
		int columns=s.nextInt();
		show.add(new Show(showId,showStartTime,showEndTime,seat,showName,movieName));
		//hence List of Show class created
		List<Screen> lOScreen=new ArrayList<Screen>();
		lOScreen.add(new Screen(screenId,theatreId,screenName,movieEndDate,show,rows,columns));
		//HENCE LIST OF SCREEN CLASS CREATED 
		
		//managerName and managerContact of Theater Class
		System.out.println("Enter the Manager Name: ");
		String managerName=sc.next();
		System.out.println("Enter the Contact Of Mnager:");
		String managerContact=sc.next();
		List<Theatre> lOTheatre= new ArrayList<Theatre>();
		lOTheatre.add(new Theatre(thid,thName,thCity,ml,lOScreen,managerName,managerContact));
		//HENCE LIST OF THEATRE CLASS VARIABLES CREATED 	
	
		return lOTheatre;
	}
	    public static List<Movie> addMovie() {
	    	Scanner s=new Scanner(System.in);
	    	Scanner sc=new Scanner(System.in);
	    	System.out.println("Enter the movie Id: ");
			int movieId=s.nextInt();
			System.out.println("Enter the Movie Name: ");
			String mName= sc.next();
			System.out.println("Enter the Director Name:");
			String mDirector=sc.next();
			System.out.println("Enter length of movie in minutes:");
			int mLength =s.nextInt();
			System.out.println("Enter the Three languages of movie: ");
			String[] lang=new String[3];
			for(int i=0;i<3;i++) {
				
				lang[i]=sc.next();
			}
				System.out.println("Enter the Release Date in format: yyyy-mm-dd ");
				LocalDate movieReleaseDate = LocalDate.parse(sc.next());
				List<Movie> ml =new ArrayList<Movie>();
				ml.add(new Movie(movieId,mName,mDirector,mLength,lang,movieReleaseDate));
				return ml;
	}
	    public static List<Screen> addScreen() {
	    	Scanner s=new Scanner(System.in);
	    	Scanner sc=new Scanner(System.in);
	    	System.out.println("Enter the screen id(integer): ");
			int screenId= s.nextInt();
			System.out.println("Enter the TheaterId: ");
			int theatreId=s.nextInt();
			System.out.println("Enter the screen name: ");
			String screenName=sc.next();
			System.out.println("Enter the Movie End Date in format: yyyy-mm-dd ");
			LocalDate movieEndDate= LocalDate.parse(sc.next());
			System.out.println("Enter Show id: ");
		    int showId=s.nextInt();
		    System.out.println("Enter the Show Start time in format: hr:mm:ss");
			LocalTime showStartTime=LocalTime.parse(sc.next());
			System.out.println("Enter the Show End time in format: hr:mm:ss");
			LocalTime showEndTime=LocalTime.parse(sc.next());
			
			//seat class variables
			
			List<Integer> seat=new ArrayList<Integer>() ;
	        System.out.println("Enter the seat number: ");
	        seat.add(s.nextInt());
			System.out.println("Enter the Show name: ");
			String showName=sc.next();
			System.out.println("Enter the movie Name: ");
			String movieName=sc.next();
			System.out.println("Enter the row number: ");
			int rows=s.nextInt();
			System.out.println("Enter the column number:");
			int columns=s.nextInt();
			List<Show> show=new ArrayList<Show>();
			show.add(new Show(showId,showStartTime,showEndTime,seat,showName,movieName));
			List<Screen> lOScreen=new ArrayList<Screen>();
			lOScreen.add(new Screen(screenId,theatreId,screenName,movieEndDate,show,rows,columns));
			return lOScreen;
	    }
	    public static List<Show> addShow() {
	    	Scanner s=new Scanner(System.in);
	    	Scanner sc=new Scanner(System.in);
	    	System.out.println("Enter Show id: ");
		    int showId=s.nextInt();
		    System.out.println("Enter the Show Start time in format: hr:mm:ss");
			LocalTime showStartTime=LocalTime.parse(sc.next());
			System.out.println("Enter the Show End time in format: hr:mm:ss");
			LocalTime showEndTime=LocalTime.parse(sc.next());
								
			List<Integer> seat=new ArrayList<Integer>() ;//seat class variables
	        System.out.println("Enter the seat number: ");
	        seat.add(s.nextInt());
			System.out.println("Enter the Show name: ");
			String showName=sc.next();
			System.out.println("Enter the movie Name: ");
			String movieName=sc.next();
			List<Show> show=new ArrayList<Show>();
			show.add(new Show(showId,showStartTime,showEndTime,seat,showName,movieName));
			return show;
	    }
	    
	   public static boolean deleteTheatre(int id) {
		   List<Theatre> listOfTheatres=new ArrayList<Theatre>();
		   List<Movie> listOfMovies = new ArrayList<Movie>();
		   List<Screen> listOfScreens= new ArrayList<Screen>();
		   listOfMovies = DataHandler.getMovies();
		   listOfScreens =DataHandler.getListOfScreens();
		   listOfTheatres = DataHandler.getListOfTheatres(listOfMovies, listOfScreens);
		   
		   boolean x =false;
		   //Theatre r = new Theatre();
		   for(Theatre t:listOfTheatres) {
			   if(t.getTheaterId()==id) {
			   listOfTheatres.remove(t);
			   x=true;
			   return x;
			  
			   }
		 }
	return x;
   }
	   public static boolean deleteMovie(int movieId) {
		   List<Movie> listOfMovies = new ArrayList<Movie>();
		   listOfMovies = DataHandler.getMovies();
		   boolean x=false;
		   for(Movie m : listOfMovies) {
			   if(m.getMovieId()==movieId) {
				   listOfMovies.remove(m);
				   x=true;
				   return x;
			   }
		   }
		   
		return x;
		   
	   }
	   public static boolean deleteScreen(int screenId) {
		   List<Screen> listOfScreens= new ArrayList<Screen>();
		   listOfScreens =DataHandler.getListOfScreens();
		   boolean x=false;
		   for(Screen m : listOfScreens) {
			   if(m.getScreenId()==screenId) {
				   listOfScreens.remove(m);
				   x=true;
				   return x;
			   }
		   }
		   
		return x;
	   }
	   public static boolean deleteShow(int showId) {
		   List<Show> listOfShows = new ArrayList<Show>();
		   listOfShows =DataHandler.getlistOfShows();
		   boolean x=false;
		   for(Show m : listOfShows) {
			   if(m.getShowId()==showId) {
				   listOfShows.remove(m);
				   x=true;
				   return x;
			   }
		   }
		   
		return x;
	   }
	   
}



		
	

		
