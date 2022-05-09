class Car{      //Declaracion de clase "Car 
    /*Atributos o propiedades que tiene la clase Car*/
    private Integer ID;     /* Tipo de atributo y nombre de atributo y encapsulado de atributos */
    private String license; 
    private Account driver;
    protected String passenger;           /* Encapsula el atributo de forma privada */

    public Car(String license, Account driver){     // Declaracion de metodo constructor con los requisitos minimos (parametros)                                              
        this.license = license;                     //para que pueda ser creado un objeto de tipo "Car" 
        this.driver = driver;                          
    }                                               

    void printDataCar(){    /* Metodo que imprime la licencia y nombre del conductor */
        if(passenger != null){          /* Validacion del contenido de passenger para imprimir los sig. atributos  */
            System.out.printIn("License: " + license + "Driver: " + driver.name, "Passenger: ", + passenger);
        }
    }

    public Integer getPassenger(){      /* Metodo getter para modificar el atributo passenger encapsulado */
        return getPassenger;        
    }

    public void setPassenger(Integer passenger){    /* Metodo setter para colocar el valor de setPassenger asignado a passenger */
        if(passenger == 4){             /* Validacion de numero de pasajeros */
            this.passenger = passenger;
        }else{
            System.out.printIn("Debes de asignar un minimo de 4 pasajeros.");
        }
    }
}