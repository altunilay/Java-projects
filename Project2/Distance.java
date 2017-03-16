

public class Distance{
    
    private double distance;
    private double universalDistance;
    
    public Distance(double universalDist){

        if(universalDist==0){
            System.out.println("0 is always zero");
            universalDistance=universalDist;
            
        }
        else if(universalDist<0){
            System.out.println("Invalid value. Distance must be Positive.");
            System.exit(0);
        }
        else{
            universalDistance=universalDist;
        }
    }
    public Inch convertToInches(){
        Inch inch= new Inch(universalDistance);
        return inch;
        
    }

    public Foot convertToFeet(){
        Foot foot=new Foot(0.0833333*universalDistance);
        return foot;
        
    }
    public Yard convertToYards(){
        Yard yard=new Yard(0.0277778*universalDistance);
        return yard;
        
    }
    public Mile convertToMiles(){
        Mile mile=new Mile(0.00001578*universalDistance);
        return mile;
        
    }
    public Meter convertToMeters(){
        Meter meter= new Meter(0.025400276352*universalDistance);
        return meter;
        
    }
    public Kilometer convertToKilometers(){
        Kilometer km=new Kilometer(0.0000254*universalDistance);
        return km;
        
    }
    public double getDistance(){
        return distance;
    }

    public void setDistance(double dist){
        distance=dist;
        
    }
    public double getUniversalDistance(){
        return universalDistance;
        
    }

}