package activities;
public class Car {
    String color;
    String transmission;
    int make;
    int tyres;
    int doors;
    Car(){   //Constructor
        tyres=4; doors=4;
         }
         public void displayCharacteristics(){   //method
        System.out.println("color is " +color);
        System.out.println("transmission is " +transmission);
        System.out.println("make is " +make);
        System.out.println("tyre is " +tyres);
        System.out.println("doors " +doors);
         }
         public void accelarate(){
        System.out.println("Car is moving forward");
    }
    public void brake(){
        System.out.println("Car has stopped");

    }



}