

public class Kilometer extends Distance{
   
    public Kilometer(double u_dist){
       super(u_dist/0.0000254);  
       super.setDistance(u_dist); 
    }
    
    public static Kilometer sum(Distance d1, Distance d2){
    	Kilometer km= new Kilometer(d1.convertToKilometers().getDistance()+ d2.convertToKilometers().getDistance());
    	return km;
    }

    public static Kilometer compare(Distance d1, Distance d2){
		Kilometer km= new Kilometer(Math.abs(d1.convertToKilometers().getDistance()- d2.convertToKilometers().getDistance()));
    	return km;
    }

}