class Uber extends Car{
    String model;
    String brand;

    public Uber(String license, Account driver, String brand, String model){
    super(license, driver);
    this.model = model;
    this.brand = brand;
    }
}