

public class Yard extends Distance{
    
    public Yard(double u_dist){
        super(u_dist/0.0277778); 
        super.setDistance(u_dist);
    }
    
   public static Yard sum(Distance d1, Distance d2){
        Yard yard= new Yard(d1.convertToYards().getDistance()+ d2.convertToYards().getDistance());
    	return yard;
    }
    public static Yard compare(Distance d1, Distance d2){
    	Yard yard= new Yard(Math.abs(d1.convertToYards().getDistance()- d2.convertToYards().getDistance()));
    	return yard;
        
    }
}