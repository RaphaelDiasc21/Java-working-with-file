package program;

import java.io.IOException;
import java.util.Scanner;
import entity.airplane.Airplane;
import persistence.data.DAOAiplane;

public class Program {
  public static void main(String[] args) {
	   Scanner ler = new Scanner(System.in);
	   int parada = 0;
	   while(parada != 1) {
		   System.out.println("Which option you choose ? ");
		   
		   int choose = ler.nextInt();
		   ler.nextLine();
	    	 
		   switch(choose) {
		     case 1:
		    	 System.out.println("What is the airplanes's model ? ");
		    	 String airplaneModel = ler.nextLine();
		    	 
		    	 System.out.println("What is the airplanes's company ? ");
		    	 String airplaneCompany = ler.nextLine();
		    	  

		    	 
		    	 Airplane a1 = new Airplane(airplaneModel,airplaneCompany);
		    	 
		    	 DAOAiplane persistence = new DAOAiplane();
		    	 
				try {
					persistence.inserAirplane(a1);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			break;
			
		    case 2:
		      DAOAiplane airplanes = new DAOAiplane();
		      
		      try {
				airplanes.readAirplane();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		      
			    	 
		    	 
		   }
	   }
   }
}
