import java.util.ArrayList;
import java.util.Map;

class UberBlack extends Car{        /* Subclass that inherits attributes from super class */
    Map<String, Map<ArrayList, String, Integer>> typeCarAccepted;  /* Attribute typeCarAccepted that contain an arraylist -> Map<brand, Map<accpeted_car_ArraysList<model_car, year>> */
    ArrayList<String> seatsMaterial;        /* Attribute that save an arraylist and it containing the material seats*/

    public UberBlack(String license, Account driver, Map<String, Map<ArrayList, String, Integer>>, ){      /* Constructor method it inherits the attribute license and driver from super class Car */ 
    super(license, driver);                                                            
    this.typeCarAccepted = typeCarAccepted;
    this.seatsMaterial = seatsMaterial;
    }
}