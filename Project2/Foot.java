

public class Foot extends Distance{
    
    public Foot(double u_dist){

        super(u_dist/0.0833333);
        super.setDistance(u_dist);
        
    }
    
   public static Foot sum(Distance d1, Distance d2){
   	Foot foo= new Foot (d1.convertToFeet().getDistance()+ d2.convertToFeet().getDistance());
    	return foo;
        
    }
    public static Foot compare(Distance d1, Distance d2){

    		Foot foo= new Foot (Math.abs(d1.convertToFeet().getDistance()- d2.convertToFeet().getDistance()));
    	return foo;
    } 
}