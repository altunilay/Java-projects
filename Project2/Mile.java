

public class Mile extends Distance{
    
    public Mile(double u_dist){
        super(u_dist/0.00001578);  
        super.setDistance(u_dist);
    }
    
    public static Mile sum(Distance d1, Distance d2){
    	Mile mile= new Mile (d1.convertToMiles().getDistance()+ d2.convertToMiles().getDistance());
    	return mile;
        
    }
    public static Mile compare(Distance d1, Distance d2){
        Mile mile= new Mile (Math.abs(d1.convertToMiles().getDistance()- d2.convertToMiles().getDistance()));
    	return mile;
    }
 
}