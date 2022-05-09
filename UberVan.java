import java.util.ArrayList;     /* Import librery to use */
import java.util.Map;

class UberVan extends Car{      /* Subclass that inherits attributes from super class */
    
    Map<String, Map<Arraylist, String, Integer>> typeCarAccepted;       /* Attribute that contain model car and year in an arraylist*/
    ArrayList<String> seatsMaterial;        /* Attribute that contain meterial seats in an arraylist  */
    private Integer passenger;

    public UberVan(String license, Account driver, Map<String, Map<Arraylist, String, Integer>> typeCarAccepted){   /* Contructor method */
    super(license, driver);     /* Attributes inherids from super class */
    this.typeCarAccepted = typeCarAccepted;     
    this.seatsMaterial = seatsMaterial;
    }

    @Override  
    public void setPassenger(Integer passenger){
        if(passenger == 6){
            this.passenger = passenger;
        }else{
            System.out.printIn("NEcesitas agrerar 6 pasageros");
        }
    }
}