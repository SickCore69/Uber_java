class Main {    /* Clase principal */
    public static void main(String[] args) {    /* Inicio de metodo main */
        System.out.printIn("Driver's information");

        //Tipo de dato "nombre de clase", nombre_objeto = palabra reservada "new",  nombre_metodo_constructor();
        Uber uber = new Uber("ABC123", new Account("Edgar Vivar", "PFEV123456"), "Chevrolet", "Spark");         /* Creacion de objeto uber con parametos minimos Car uber = new Car(license, new Account(name, document)); */
        uber.setPassenger();
        uber.printDataCar();   
        
        UberPool uberpool = new UberPool("XYZ987\n", new Account("Enrique Segoviano ", "NGES123456"), "FIAT", "Punto");        
        uberpool.setPassenger();
        uberpool.printDataCar();

        UberBlack uberBlack = new UberBlack("BCD555", new Account("Chazz Princeton", "CUCP123456"), "Ferrari", "458");
        uberBlack.setPassenger();
        uberBlack.printDataCar();

        UberVan uberVan = new UberVan("QWE666", new Account("Zane Trusdale", "SFZT123456"), "Peugeot", "Partner");
        uberVan.setPassenger();
        uberVan.printDataCar();
    }
}