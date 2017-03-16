

public class Inch extends Distance{
    
    public Inch(double u_dist){
        super(u_dist);
        super.setDistance(u_dist);
    }
    
    public static Inch sum(Distance d1, Distance d2){

    	Inch inc= new Inch (d1.convertToInches().getDistance()+ d2.convertToInches().getDistance());
    	return inc;
        
    }
    public static Inch compare(Distance d1, Distance d2){

    	Inch inc= new Inch (Math.abs(d1.convertToInches().getDistance()- d2.convertToInches().getDistance()));
    	return inc;
        
    }
    
}