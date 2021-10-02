/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day.pkg3;

/**
 *
 * @author ThinkPad
 */
public class Day3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Car aCar = new Car(4, "Honda");
        System.out.println(aCar.startEngine());
        System.out.println(aCar.accelarate());
        System.out.println(aCar.brake());
        
        Mitsubishi myCar = new Mitsubishi(4, "Outlander");
        System.out.println(myCar.startEngine());
        System.out.println(myCar.accelarate());
        System.out.println(myCar.brake());
        
        Car newCar;
        newCar = getCar();
        System.out.println(newCar.startEngine());
        System.out.println(newCar.accelarate());
        System.out.println(newCar.brake());
        
    }
    public static Car getCar() {
        System.out.println("Randomly pick a car");
        int i = (int) (Math.random() * 4 + 1);
        switch (i){
            case 1:
                return new Mitsubishi(4, "Outlander");
            case 2:
                return new Toyota(6, "Crown");
            case 3:
                return new Kia(6, "Sorento");
            default:
                return new Audi(6, "A4");
        }  
    }
    
    
}
