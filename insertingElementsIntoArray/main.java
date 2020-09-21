package insertingElementIntoArray;

public class main {

	public static void main(String[] args) {
		
		DVD[] dvdCollection = new DVD[4];
		
		
		DVD avengersDVD = new DVD("The Avengers", 2012, "Joss Whedon");
	    dvdCollection[0] = avengersDVD;
	    System.out.println(dvdCollection[0]);
	    
	    DVD incrediblesDVD = new DVD("The Incredibles", 2004, "Brad Bird");
	    dvdCollection[1] = incrediblesDVD;
	    System.out.println(dvdCollection[1]);
	    
	    
	    
	    DVD findingDoryDVD = new DVD("Finding Dory", 2016, "Andrew Stanton");
	    dvdCollection[2] = findingDoryDVD;
	    System.out.println(dvdCollection[2]);

	    DVD lionKingDVD = new DVD("The Lion King", 2019, "Jon Favreau");
	    dvdCollection[3] = lionKingDVD;
	    System.out.println(dvdCollection[3]);
		

	   
	  

	  
	   
	   
	   

	}

}
