package entity.airplane;

public class Airplane {
   private String model;
   private String company;
   
   public Airplane(String model, String company) {
	   this.model = model;
	   this.company = company;
   }
   
   public String toString() {
	   return "Airplane: " + this.model + "company: " + this.company + ";";
   }
}
