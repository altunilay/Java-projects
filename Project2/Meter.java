

public class Meter extends Distance{
    
    public Meter(double u_dist){
        super(u_dist/0.025400276352);
        super.setDistance(u_dist);
    }
    
   public static Meter sum(Distance d1, Distance d2){
   		Meter meter= new Meter (d1.convertToMeters().getDistance()+ d2.convertToMeters().getDistance());
    	return meter;
    }

    public static Meter compare(Distance d1, Distance d2){
        Meter meter= new Meter (Math.abs(d1.convertToMeters().getDistance()- d2.convertToMeters().getDistance()));
    	return meter;
    }
    
}