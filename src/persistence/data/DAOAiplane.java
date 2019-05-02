package persistence.data;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import entity.airplane.Airplane;

public class DAOAiplane {
   public void inserAirplane(Airplane air) throws IOException{
       FileWriter fw = new FileWriter("Airplanes.txt",true);	
       BufferedWriter bw = new BufferedWriter(fw);
       PrintWriter pw = new PrintWriter(bw);
       
       pw.println(air.toString());
       
       bw.close();
       fw.close();
   }
   
   public void readAirplane() throws IOException {
	   FileReader fr = new FileReader("Airplanes.txt");
	   BufferedReader br = new BufferedReader(fr);
	   
	   String line = null;
	   while((line = br.readLine()) != null) {
		   System.out.println(line);
	   }
	    
   }
}
