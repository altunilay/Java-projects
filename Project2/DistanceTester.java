
public class DistanceTester{

    public static void main(String[] args){
      
    	testInch();
       testFoot();
      testMeter();
      testKm();
      testYard();
      testMile();
      testSumFunc();
      testCompareFunc();
	
    
    }

    public static void testInch(){

       Inch trial= new Inch(1);
       System.out.println(trial.getDistance()+" inch equals to "+trial.convertToInches().getDistance()+" inch");

       System.out.println(trial.getDistance()+" inch equals to "+trial.convertToFeet().getDistance()+" feet");

       System.out.println(trial.getDistance()+" inch equals to "+trial.convertToYards().getDistance()+" yard");

       System.out.println(trial.getDistance()+" inch equals to "+trial.convertToMiles().getDistance()+" mile");

       System.out.println(trial.getDistance()+" inch equals to "+trial.convertToMeters().getDistance()+" meter");

       System.out.println(trial.getDistance()+" inch equals to "+trial.convertToKilometers().getDistance()+" kilometer");
       
       Inch trial2= new Inch(5);
       System.out.println(trial2.getDistance()+" inch equals to "+trial2.convertToFeet().getDistance()+" feet");

       System.out.println(trial2.getDistance()+" inch equals to "+trial2.convertToYards().getDistance()+" yard");

       System.out.println(trial2.getDistance()+" inch equals to "+trial2.convertToMiles().getDistance()+" mile");

    }

     public static void testFoot(){

       Foot trial= new Foot(1);
       System.out.println(trial.getDistance()+" feet equals to "+trial.convertToInches().getDistance()+" inch");

       System.out.println(trial.getDistance()+" feet equals to "+trial.convertToFeet().getDistance()+" feet");

       System.out.println(trial.getDistance()+" feet equals to "+trial.convertToYards().getDistance()+" yard");

       System.out.println(trial.getDistance()+" feet equals to "+trial.convertToMiles().getDistance()+" mile");

       System.out.println(trial.getDistance()+" feet equals to "+trial.convertToMeters().getDistance()+" meter");

       System.out.println(trial.getDistance()+" feet equals to "+trial.convertToKilometers().getDistance()+" kilometer");

       Foot trial2= new Foot(7);
       System.out.println(trial2.getDistance()+" feet equals to "+trial2.convertToFeet().getDistance()+" feet");

       System.out.println(trial2.getDistance()+" feet equals to "+trial2.convertToYards().getDistance()+" yard");

       System.out.println(trial2.getDistance()+" feet equals to "+trial2.convertToMiles().getDistance()+" mile");

    }

     public static void testMeter(){

       Meter trial= new Meter (1);
       System.out.println(trial.getDistance()+" meter equals to "+trial.convertToInches().getDistance()+" inch");

       System.out.println(trial.getDistance()+" meter equals to "+trial.convertToFeet().getDistance()+" feet");

       System.out.println(trial.getDistance()+" meter equals to "+trial.convertToYards().getDistance()+" yard");

       System.out.println(trial.getDistance()+" meter equals to "+trial.convertToMiles().getDistance()+" mile");

       System.out.println(trial.getDistance()+" meter equals to "+trial.convertToMeters().getDistance()+" meter");

       System.out.println(trial.getDistance()+" meter equals to "+trial.convertToKilometers().getDistance()+" kilometer");

      Meter trial2= new Meter (11);
       System.out.println(trial2.getDistance()+" meter equals to "+trial2.convertToFeet().getDistance()+" feet");

       System.out.println(trial2.getDistance()+" meter equals to "+trial2.convertToYards().getDistance()+" yard");

       System.out.println(trial2.getDistance()+" meter equals to "+trial2.convertToMiles().getDistance()+" mile");

    }

    public static void testKm(){

       Kilometer trial= new Kilometer (1);
       System.out.println(trial.getDistance()+" kilometer equals to "+trial.convertToInches().getDistance()+" inch");

       System.out.println(trial.getDistance()+" kilometer equals to "+trial.convertToFeet().getDistance()+" feet");

       System.out.println(trial.getDistance()+" kilometer equals to "+trial.convertToYards().getDistance()+" yard");

       System.out.println(trial.getDistance()+" kilometer equals to "+trial.convertToMiles().getDistance()+" mile");

       System.out.println(trial.getDistance()+" kilometer equals to "+trial.convertToMeters().getDistance()+" meter");

       System.out.println(trial.getDistance()+" kilometer equals to "+trial.convertToKilometers().getDistance()+" kilometer");

       Kilometer trial2= new Kilometer (3);
       System.out.println(trial2.getDistance()+" kilometer equals to "+trial2.convertToFeet().getDistance()+" feet");

       System.out.println(trial2.getDistance()+" kilometer equals to "+trial2.convertToYards().getDistance()+" yard");

       System.out.println(trial2.getDistance()+" kilometer equals to "+trial2.convertToMiles().getDistance()+" mile");

    }
    public static void testYard(){

       Yard trial= new Yard (1);
       System.out.println(trial.getDistance()+" yard equals to "+trial.convertToInches().getDistance()+" inch");

       System.out.println(trial.getDistance()+" yard equals to "+trial.convertToFeet().getDistance()+" feet");

       System.out.println(trial.getDistance()+" yard equals to "+trial.convertToYards().getDistance()+" yard");

       System.out.println(trial.getDistance()+" yard equals to "+trial.convertToMiles().getDistance()+" mile");

       System.out.println(trial.getDistance()+" yard equals to "+trial.convertToMeters().getDistance()+" meter");

       System.out.println(trial.getDistance()+" yard equals to "+trial.convertToKilometers().getDistance()+" kilometer");

       Yard trial2= new Yard (4);
       System.out.println(trial2.getDistance()+" yard equals to "+trial2.convertToFeet().getDistance()+" feet");

       System.out.println(trial2.getDistance()+" yard equals to "+trial2.convertToYards().getDistance()+" yard");

       System.out.println(trial2.getDistance()+" yard equals to "+trial2.convertToMiles().getDistance()+" mile");

    }

    public static void testMile(){

       Mile trial= new Mile (1);
       System.out.println(trial.getDistance()+" mile equals to "+trial.convertToInches().getDistance()+" inch");

       System.out.println(trial.getDistance()+" mile equals to "+trial.convertToFeet().getDistance()+" feet");

       System.out.println(trial.getDistance()+" mile equals to "+trial.convertToYards().getDistance()+" yard");

       System.out.println(trial.getDistance()+" mile equals to "+trial.convertToMiles().getDistance()+" mile");

       System.out.println(trial.getDistance()+" mile equals to "+trial.convertToMeters().getDistance()+" meter");

       System.out.println(trial.getDistance()+" mile equals to "+trial.convertToKilometers().getDistance()+" kilometer");

       Mile trial2= new Mile (6);
       System.out.println(trial2.getDistance()+" mile equals to "+trial2.convertToFeet().getDistance()+" feet");

       System.out.println(trial2.getDistance()+" mile equals to "+trial2.convertToYards().getDistance()+" yard");

       System.out.println(trial2.getDistance()+" mile equals to "+trial2.convertToMiles().getDistance()+" mile");

    }

    public static void testSumFunc(){

       System.out.println("1 meter + 1 mile "+Inch.sum(new Meter(1), new Mile(1)).getDistance()+" inches");
       System.out.println("1 inch + 1 kilometer "+ Mile.sum(new Inch(1), new Kilometer(1)).getDistance()+" miles");
       System.out.println("1 meter + 1 kilometer "+ Meter.sum(new Foot(1), new Kilometer(1)).getDistance()+" meters");
       System.out.println("1 yard + 1 Mile "+ Kilometer.sum(new Yard(1), new Mile(1)).getDistance()+" kilometers");
       System.out.println("1 inch + 1 feet "+ Yard.sum(new Inch(1), new Foot(1)).getDistance()+" yards");

    }
     public static void testCompareFunc(){

      System.out.println("The difference between 1 Meter and 1 Inch is "+Foot.compare(new Meter(1), new Inch(1)).getDistance()+" feet");
      System.out.println("The difference between 1 Mile and 1 Kilometer is "+Yard.compare(new Mile(1), new Kilometer(1)).getDistance()+" yards");
      System.out.println("The difference between 1 Foot and 1 Yard is "+Inch.compare(new Foot(1), new Yard(1)).getDistance()+" inches");
      System.out.println("The difference between 1 Mile and 1 inch is "+Mile.compare(new Inch(1), new Mile(1)).getDistance()+" miles");
      System.out.println("The difference between 1 Yard and 1 Inch is "+Meter.compare(new Yard(1), new Inch(1)).getDistance()+" meters");
      System.out.println("The difference between 1 Kilometer and 1 Kilometer is "+Kilometer.compare(new Kilometer(1), new Kilometer(1)).getDistance()+" kilometers");
     }





}