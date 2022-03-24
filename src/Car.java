public class Car {
    private String make;
    private String model = "Default Name";
    private String year ;
    private boolean b1;

    public void startCar()
    {
        if(b1){
            System.out.println("Car is running");
        }
        else{
            System.out.println("Car is stopped");
        }

    }


    public Car(String make, String model, String year, boolean b1) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.b1 = b1;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public void setB1(boolean b1) {
        this.b1 = b1;
    }

    public void printDetails(){
        System.out.println("Make -->"+ this.make);
        System.out.println("Year -->"+ this.year);
        System.out.println("Model -->"+ this.model);
       // System.out.println("Running -->"+ this.b1);
    }
}
